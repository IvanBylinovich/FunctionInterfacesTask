package by.solbegsoft.functionInterfacesTask.util;

import java.util.*;
import java.util.function.*;
import java.util.stream.Stream;

public class MyFunctionInterfacesUtil {

    public static boolean checkStringLength(String testString){
        Predicate<String> predicateStringLength = (x)-> x.length() > 5;
        return predicateStringLength.test(testString);
    }

    public static boolean checkStringLength(String testString1, String testString2, String testString3){
        Stream<String> strings = Stream.of(testString1, testString2, testString3);
        return strings.allMatch(x -> x.length() > 5);
    }
    public static boolean checkStringNotNullNotEmpty(String string){
        Predicate<String> predicateStringNotNull = Objects::nonNull;
        Predicate<String> predicateStringNotEmpty = s -> !s.isEmpty();
        return predicateStringNotNull.and(predicateStringNotEmpty).test(string);
    }

    public static void printThisString(String string){
        Consumer<String> printer = System.out::println;
        printer.accept(string);
    }
    public static String printHappyNewYearGreetings(String name){
        UnaryOperator<String> printerHNYGreetings = x -> "Happy new year - " + x;
        return printerHNYGreetings.apply(name);
    }

    public static int stringLengthCounter(String string){
        Function<String, Integer> counter = java.lang.String::length;
        return counter.apply(string);
    }

    public static int randomIntegerGenerator(){
        Random random = new Random();
        Supplier<Integer> randomIntegerGenerator = () ->(Integer)random.nextInt();
        return randomIntegerGenerator.get();
    }
}
