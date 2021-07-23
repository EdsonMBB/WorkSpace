package org.bahena.Math;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = NombresUtils.getList("Java", "Functional");

        cursos.forEach(curso -> System.out.printf(curso));

        BiFunction<Integer, Integer, Integer> s = (x, y) -> x * y;

        usarZero(() -> 2);
        usarPredicado(text -> text.isEmpty());
        usarBiFunction((x,y) -> x * y);
        usarBiFunction((x,y) -> {
            System.out.println("X: " + x + "Y: " + y);
            return  x + y;
        });

        usarNada(() -> {
            System.out.println("Hola alumno");
        });

        usarBiFunction((Integer x, Integer y) -> x * y);


    }

    static void usarZero(ZeroArgumentos zeroArgumentos){

    }

    static void usarPredicado(Predicate<String> predicado){

    }

    static void usarBiFunction(BiFunction<Integer, Integer, Integer> operacion){

    }

    static void usarNada(OperarNada operarNada){

    }
    @FunctionalInterface
    interface ZeroArgumentos{
        int get();
    }
    @FunctionalInterface
    interface OperarNada {
        void nada();
    }

}
