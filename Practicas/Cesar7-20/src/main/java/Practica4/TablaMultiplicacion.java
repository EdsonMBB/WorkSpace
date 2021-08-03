package Practica4;

public class TablaMultiplicacion {
    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(x * j);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
