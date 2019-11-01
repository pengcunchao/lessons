package com.pcc.lessons.designPattern.bridge;

public class WechatMsgSender implements MsgSender {
    private MsgEncoder msgEncoder;

    public WechatMsgSender(MsgEncoder msgEncoder) {
        this.msgEncoder = msgEncoder;
    }

    public void setMsgEncoder(MsgEncoder msgEncoder) {
        this.msgEncoder = msgEncoder;
    }

    @Override
    public void send(String message) {
        System.out.println("open weChat and find the recipient");
        System.out.println("send" + msgEncoder.encode(message) + "by weChat");
    }
}
