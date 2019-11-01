package com.pcc.lessons.designPattern.bridge;

import java.nio.charset.Charset;

public class VedioMsgEncoder implements MsgEncoder {
    @Override
    public byte[] encode(String message) {
        return (message + "encode to mp4").getBytes(Charset.forName("UTF-8"));
    }
}
