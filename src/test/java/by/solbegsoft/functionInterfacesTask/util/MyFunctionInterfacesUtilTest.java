package by.solbegsoft.functionInterfacesTask.util;

import org.junit.After;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.*;

class MyFunctionInterfacesUtilTest {

    private String strMoreThan5 = "666666";
    private String strLessThan5 = "4444";
    private String strNull = null;
    private String strEmpty = "";
    private ByteArrayOutputStream output = new ByteArrayOutputStream();


    @org.junit.jupiter.api.Test
    void testStringLengthSuccess() {
        Assertions.assertTrue(MyFunctionInterfacesUtil.checkStringLength(strMoreThan5));
    }

    @org.junit.jupiter.api.Test
    void testStringLengthFail() {
        Assertions.assertFalse(MyFunctionInterfacesUtil.checkStringLength(strLessThan5));
    }

    @org.junit.jupiter.api.Test
    void testAllStringsLengthSuccess() {
        Assertions.assertTrue(MyFunctionInterfacesUtil.checkStringLength(strMoreThan5, strMoreThan5, strMoreThan5));
    }

    @org.junit.jupiter.api.Test
    void testAllStringsLengthFail() {
        Assertions.assertFalse(MyFunctionInterfacesUtil.checkStringLength(strLessThan5, strMoreThan5, strMoreThan5));
    }

    @org.junit.jupiter.api.Test
    void testStringNotEmptySuccess() {
        Assertions.assertTrue(MyFunctionInterfacesUtil.checkStringNotNullNotEmpty(strLessThan5));
    }

    @org.junit.jupiter.api.Test
    void testStringNotEmptyFail() {
        Assertions.assertFalse(MyFunctionInterfacesUtil.checkStringNotNullNotEmpty(strEmpty));
    }

    @org.junit.jupiter.api.Test
    void testStringNotNullSuccess() {
        Assertions.assertTrue(MyFunctionInterfacesUtil.checkStringNotNullNotEmpty(strLessThan5));
    }

    @org.junit.jupiter.api.Test
    void testStringNotNullFail() {
        Assertions.assertFalse(MyFunctionInterfacesUtil.checkStringNotNullNotEmpty(strNull));
    }

    @org.junit.jupiter.api.Test
    void testPrintThisString() {
        System.setOut(new PrintStream(output));
        MyFunctionInterfacesUtil.printThisString("this string");
        Assertions.assertEquals("this string\r\n", output.toString());
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }


    @org.junit.jupiter.api.Test
    void testPrintHappyNewYearGreetings() {
        Assertions.assertEquals("Happy new year - someone", MyFunctionInterfacesUtil.printHappyNewYearGreetings("someone"));
    }

    @org.junit.jupiter.api.Test
    void testStringLengthCounter() {
        Assertions.assertEquals(6, MyFunctionInterfacesUtil.stringLengthCounter(strMoreThan5));
    }

    @org.junit.jupiter.api.Test
    void testRandomNumberGenerator() {
        Object object = MyFunctionInterfacesUtil.randomIntegerGenerator();
        Integer integer = 1;

        Assertions.assertEquals(integer.getClass(), object.getClass());
    }

}