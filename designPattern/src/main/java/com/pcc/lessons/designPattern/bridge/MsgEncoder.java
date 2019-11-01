package com.pcc.lessons.designPattern.bridge;

public interface MsgEncoder {
    byte[] encode(String message);
}
