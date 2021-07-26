package Practica3;

public class PrePostDemo {
    public static void main(String[] args){

        int i = 3;

        i++;
        System.out.println(i);    // "4"

        ++i;
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6" es 6 porque primero imprime y luego incrementa
        System.out.println(i);    // "7"

    }
}
