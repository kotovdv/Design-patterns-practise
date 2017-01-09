package com.kotovdv.proxy.logic;

import com.kotovdv.proxy.exception.AccidentInfoNotFoundException;
import com.kotovdv.proxy.exception.FailedToLoadAccidentDataException;
import com.kotovdv.proxy.model.accident.Accident;
import com.kotovdv.proxy.model.accident.LazyAccidentData;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static java.lang.ClassLoader.getSystemResourceAsStream;
import static java.time.LocalDate.parse;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;

/**
 * @author Dmitriy Kotov
 */
public class AccidentFactory {

    public Accident buildAccident(String accidentName) {
        String commonInfoFileName = accidentName + ".properties";

        try (InputStream commonInfoStream = getSystemResourceAsStream(commonInfoFileName)) {
            if (commonInfoStream == null) {
                throw new AccidentInfoNotFoundException(commonInfoFileName);
            }

            Properties commonInfo = readCommonInfoProperties(commonInfoStream);

            return buildProxy(accidentName, commonInfo);
        } catch (IOException e) {
            throw new FailedToLoadAccidentDataException(e);
        }

    }

    private Properties readCommonInfoProperties(InputStream commonInfoStream) throws IOException {
        Properties commonInfo = new Properties();
        commonInfo.load(commonInfoStream);

        return commonInfo;
    }

    private LazyAccidentData buildProxy(String accidentName, Properties commonInfo) {
        return new LazyAccidentData(
                commonInfo.getProperty("summary"),
                parse(commonInfo.getProperty("accident_date"), ISO_LOCAL_DATE),
                accidentName
        );
    }
}