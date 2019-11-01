package com.pcc.lessons.designPattern.bridge;

import java.nio.charset.Charset;

public class TextMsgEncoder implements MsgEncoder {
    @Override
    public byte[] encode(String message) {
        return message.getBytes(Charset.forName("UTF-8"));
    }
}
