package org.bahena.Math;

public class Chaining {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder();
        str.append("Hola")
                .append("almunos")
                .append("de")
                .append("platzi");

        Chainer chainer = new Chainer();
        chainer.sayHi().sayBye();
    }

    static class Chainer{
        public Chainer sayHi(){
            System.out.println("Hola");
            return this;
        }
        public Chainer sayBye(){
            System.out.println("Bye");
            return this;
        }
    }

}

