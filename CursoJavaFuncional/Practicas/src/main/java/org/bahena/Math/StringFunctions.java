package org.bahena.Math;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text +"!!";
        System.out.println(quote.apply("Hola Estudiante de platzi!"));
        System.out.println(addMark.apply("Hola"));

        BiFunction<Integer, Integer, Float> division = (x,y) -> (float) x / y;
        System.out.println(division.apply(5,3));

        BiFunction<String, Integer, String> leftPad = (text, number) -> String.format("%" + number + "s", text);

        System.out.println(leftPad.apply("Java",10));


    }
}
