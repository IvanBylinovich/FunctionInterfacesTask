package by.solbegsoft.functionInterfacesTask.util;

import org.junit.After;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class StringUtilsTest {

    private String strLengthMoreThan5 = "666666";
    private String strLengthEqual5 = "55555";
    private String strLengthLessThan5 = "4444";
    private String strEmpty = "";
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    @Test
    void testCheckAndGetTrueIfStringLengthMoreThan5Success() {
        Assertions.assertTrue(StringsUtils.checkAndGetTrueIfAllStringsLengthMoreThan5(strLengthMoreThan5));
    }

    @Test
    void testCheckAndGetTrueIfStringLengthMoreThan5Fail() {
        Assertions.assertFalse(StringsUtils.checkAndGetTrueIfAllStringsLengthMoreThan5(strLengthLessThan5));
    }

    @Test
    void testCheckAndGetTrueIfStringLengthMoreThan5IfNull() {
        Assertions.assertFalse(StringsUtils.checkAndGetTrueIfAllStringsLengthMoreThan5(null));
    }

    @Test
    void testCheckAndGetTrueIfStringLengthMoreThan5IfEmpty() {
        Assertions.assertFalse(StringsUtils.checkAndGetTrueIfAllStringsLengthMoreThan5(""));
    }

    @Test
    void testCheckAndGetTrueIfStringLengthMoreThan5IfLengthEqual5() {
        Assertions.assertFalse(StringsUtils.checkAndGetTrueIfAllStringsLengthMoreThan5(strLengthEqual5));
    }

    @Test
    void testCheckAndGetTrueIf3StringsLengthMoreThan5Success() {
        Assertions.assertTrue(StringsUtils.checkAndGetTrueIfAllStringsLengthMoreThan5(strLengthMoreThan5, strLengthMoreThan5, strLengthMoreThan5));
    }

    @Test
    void testCheckAndGetTrueIf3StringsLengthMoreThan5Fail() {
        Assertions.assertFalse(StringsUtils.checkAndGetTrueIfAllStringsLengthMoreThan5(strLengthLessThan5, strLengthMoreThan5, strLengthMoreThan5));
    }

    @Test
    void testCheckAndGetTrueIfAllStringsLengthMoreThan5IfNull() {
        Assertions.assertFalse(StringsUtils.checkAndGetTrueIfAllStringsLengthMoreThan5(null, strLengthMoreThan5, strLengthMoreThan5));
    }

    @Test
    void testCheckAndGetTrueIfAllStringsLengthMoreThan5IfNull2() {
        Assertions.assertFalse(StringsUtils.checkAndGetTrueIfAllStringsLengthMoreThan5(null, null, strLengthMoreThan5));
    }

    @Test
    void testCheckAndGetTrueIfAllStringsLengthMoreThan5IfNull3() {
        Assertions.assertFalse(StringsUtils.checkAndGetTrueIfAllStringsLengthMoreThan5(null, null, null));
    }

    @Test
    void testCheckAndGetTrueIfAllStringsLengthMoreThan5IfNullIfEmpty() {
        Assertions.assertFalse(StringsUtils.checkAndGetTrueIfAllStringsLengthMoreThan5(strEmpty, strLengthMoreThan5, strLengthMoreThan5));
    }

    @Test
    void testCheckAndGetTrueIfAllStringsLengthMoreThan5IfNullIfEmpty2() {
        Assertions.assertFalse(StringsUtils.checkAndGetTrueIfAllStringsLengthMoreThan5(strEmpty, strEmpty, strLengthMoreThan5));
    }

    @Test
    void testCheckAndGetTrueIfAllStringsLengthMoreThan5IfNullIfEmpty3() {
        Assertions.assertFalse(StringsUtils.checkAndGetTrueIfAllStringsLengthMoreThan5(strEmpty, strEmpty, strEmpty));
    }

    @Test
    void testCheckStringNotNullNotEmptySuccess() {
        Assertions.assertTrue(StringsUtils.checkStringNotNullNotEmpty(strLengthLessThan5));
    }

    @Test
    void testCheckStringNotNullNotEmptyFailIfStringEmpty() {
        Assertions.assertFalse(StringsUtils.checkStringNotNullNotEmpty(strEmpty));
    }

    @Test
    void testCheckStringNotNullNotEmptyFailIfNull() {
        Assertions.assertFalse(StringsUtils.checkStringNotNullNotEmpty(null));
    }

    @Test
    void testPrintThisString() {
        System.setOut(new PrintStream(output));
        StringsUtils.printThisString("this string");
        Assertions.assertEquals("this string\r\n", output.toString());
    }

    @After
    public void cleanUpStreamsSuccess() {
        System.setOut(null);
    }

    @Test
    void testPrintHappyNewYearGreetings() {
        Assertions.assertEquals("Happy new year - someone", StringsUtils.printHappyNewYearGreetings("someone"));
    }

    @Test
    void testGetStringLength() {
        Assertions.assertEquals(6, StringsUtils.getStringLength(strLengthMoreThan5));
    }

    @Test
    void testGetStringLengthIfStringEmpty() {
        Assertions.assertEquals(0, StringsUtils.getStringLength(strEmpty));
    }

    @Test
    void testRandomNumberGenerator() {
        Object object = StringsUtils.randomIntegerGenerator();
        Integer integer = 1;
        Assertions.assertEquals(integer.getClass(), object.getClass());
    }

}