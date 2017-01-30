package com.kotovdv.chain.of.responsibility.handler;

import com.kotovdv.chain.of.responsibility.request.Request;
import com.kotovdv.chain.of.responsibility.request.RequestBody;

import static java.util.Base64.getEncoder;

/**
 * @author Dmitriy Kotov
 */
public class EncodingRequestHandler implements RequestHandler {

    @Override
    public boolean shouldHandle(Request request) {
        return request.getBody().doesNeedEncoding();
    }

    @Override
    public void handle(Request request) {
        RequestBody body = request.getBody();

        String encodedContent = encodeContent(body);

        body.setContent(encodedContent);
    }

    private String encodeContent(RequestBody body) {
        byte[] encodedBytes = getEncoder().encode(body.getContent().getBytes());

        return new String(encodedBytes);
    }
}