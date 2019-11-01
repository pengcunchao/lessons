package com.pcc.lessons.designPattern.bridge;

public class PhoneMsgSender implements MsgSender {
    private MsgEncoder msgEncoder;

    public PhoneMsgSender(MsgEncoder msgEncoder) {
        this.msgEncoder = msgEncoder;
    }

    public void setMsgEncoder(MsgEncoder msgEncoder) {
        this.msgEncoder = msgEncoder;
    }

    @Override
    public void send(String message) {
        System.out.println("open message and set recipient");
        byte[] content = msgEncoder.encode(message);
        System.out.println("paste " + content + "and click send");
    }
}
