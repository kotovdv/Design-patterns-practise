package com.kotovdv.proxy.logic;

import com.kotovdv.proxy.exception.FailedToLoadCommonDataException;
import com.kotovdv.proxy.exception.TransportAccidentInfoNotFoundException;
import com.kotovdv.proxy.model.accident.LazyTransportAccidentData;
import com.kotovdv.proxy.model.accident.TransportAccident;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static java.lang.ClassLoader.getSystemResourceAsStream;
import static java.time.LocalDate.parse;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;

/**
 * @author Dmitriy Kotov
 */
public class TransportAccidentFactory {

    public TransportAccident buildAccident(String accidentName) {
        String commonInfoFileName = accidentName + ".properties";

        try (InputStream commonInfoStream = getSystemResourceAsStream(commonInfoFileName)) {
            if (commonInfoStream == null) {
                throw new TransportAccidentInfoNotFoundException(commonInfoFileName);
            }

            Properties commonInfo = readCommonInfoProperties(commonInfoStream);

            return buildProxy(accidentName, commonInfo);
        } catch (IOException e) {
            throw new FailedToLoadCommonDataException(e);
        }

    }

    private Properties readCommonInfoProperties(InputStream commonInfoStream) throws IOException {
        Properties commonInfo = new Properties();
        commonInfo.load(commonInfoStream);

        return commonInfo;
    }

    private LazyTransportAccidentData buildProxy(String accidentName, Properties commonInfo) {
        return new LazyTransportAccidentData(
                commonInfo.getProperty("summary"),
                parse(commonInfo.getProperty("accident_date"), ISO_LOCAL_DATE),
                accidentName
        );
    }
}