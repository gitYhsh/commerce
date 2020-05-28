package com.commerce.config.authen.CodeFilter.utils;

public interface ValidateCodeGenerator {

    ValidateCode createCodeImage();

    ValidateCode createCodeSms();
}
