package com.kotovdv.chain.of.responsibility.request;

/**
 * @author Dmitriy Kotov
 */
public class RequestBody {

    private final boolean needEncryption;
    private String content;

    public RequestBody(String content, boolean needEncryption) {
        this.content = content;
        this.needEncryption = needEncryption;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean doesNeedEncoding() {
        return needEncryption;
    }

    @Override
    public String toString() {
        return "RequestBody{" +
                "content='" + content + '\'' +
                '}';
    }
}