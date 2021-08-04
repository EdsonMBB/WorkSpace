package org.bahena.Math;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(squareFunction.apply(5));
        System.out.println(square(5));

        Function<Integer, Boolean> isOdd = x -> x % 2 ==1;
        System.out.println(isOdd.apply(3));
        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(2));

        Predicate<Student> isApproved = student -> student.getCalificacion() > 6.0;
        Student edson = new Student(5.9);
        System.out.println(isApproved.test(edson) + " Approved or not");

     }
     static class Student {
        private double calificacion;

         public Student(double calificacion) {
             this.calificacion = calificacion;
         }

         public double getCalificacion() {
             return calificacion;
         }
     }

    static int square(int x){
        return x * x;
    }

}
