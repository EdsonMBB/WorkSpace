package org.bahena.Math.Streams;

public class prueba {
    public static void main(String[] args) {
        int [][] entero = new int[3][3];
        for (int i = 0; i < entero.length; i++) {
            for (int j = 0; j < entero.length; j++) {
                entero[i][j] = i+1;
                System.out.print(" " + entero[i][j]);
            }
            System.out.println("\n");
        }
    }

}
