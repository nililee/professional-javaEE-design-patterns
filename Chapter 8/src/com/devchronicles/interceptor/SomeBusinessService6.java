﻿package com.devchronicles.interceptor;

import java.util.logging.Logger;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.interceptor.Interceptors;

@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class SomeBusinessService6 {
    @Interceptors(SecurityInterceptor.class)
    public void startService() {
        // 복잡한 비즈니스 로직
        Logger.getLogger("AppLog").info("완료...");
    }

    public void startAnotherService() {
        // 복잡한 비즈니스 로직
        Logger.getLogger("AppLog").info("도 완료...");
    }
}