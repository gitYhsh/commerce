package com.commerce.config.authen.CodeFilter.sms;

public interface SmsCodeSender {
    void send(String mobile, String code);
}
