package Equals;

public class Incr {
    public static void main(String[] args) {
        Integer x = 7;
        int y = 2;

        /* y y y y
        *  y x x
        * -= *= *= *=
        * */


        /*
         *   x
         * -=
         * */




        x *= x;//49
        y *= y;//4
        y *= y;//16
        x -= y;//33
        System.out.println(x);


    }
}
