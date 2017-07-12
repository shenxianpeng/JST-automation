package com.action.common;

public class Print {

    public static void successMessage() {
//		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " test case passed.");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + " test case passed.");
    }

    public static void failureMessage() {
//		System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " test case failed.");
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        System.out.println(stackTrace[1].getMethodName() + " test case failed.");
    }

}
