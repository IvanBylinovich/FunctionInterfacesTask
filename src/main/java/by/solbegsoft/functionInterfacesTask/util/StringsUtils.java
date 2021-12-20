package by.solbegsoft.functionInterfacesTask.util;

import java.util.Objects;
import java.util.Random;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class StringsUtils {
    static Predicate<String> predicateStringLength = (x) -> x.length() > 5;

    public static boolean checkAndGetTrueIfAllStringsLengthMoreThan5(String... testStrings) {
        if (testStrings == null) return false;
        for (String testString : testStrings) {
            if (testString == null) return false;
            if (!predicateStringLength.test(testString)) return false;
        }
        return true;
    }

    public static boolean checkStringNotNullNotEmpty(String string) {
        Predicate<String> predicateStringNotNull = Objects::nonNull;
        Predicate<String> predicateStringNotEmpty = s -> !s.isEmpty();
        return predicateStringNotNull.and(predicateStringNotEmpty).test(string);
    }

    public static void printThisString(String string) {
        Consumer<String> printer = System.out::println;
        printer.accept(string);
    }

    public static String printHappyNewYearGreetings(String name) {
        UnaryOperator<String> printerHNYGreetings = x -> "Happy new year - " + x;
        return printerHNYGreetings.apply(name);
    }

    public static int getStringLength(String string) {
        Function<String, Integer> counter = java.lang.String::length;
        return counter.apply(string);
    }

    public static int randomIntegerGenerator() {
        Supplier<Integer> randomIntegerGenerator = () -> new Random().nextInt();
        return randomIntegerGenerator.get();
    }
}
