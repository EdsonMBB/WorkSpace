public class updatingVariables {
    public static void main(String[] args) {
        int salary = 1000;
        //bono
        salary = salary + 200;
        System.out.println(salary);

        //pension 50$ de descuento
        salary = salary -50;
        System.out.println(salary);

        //2 horas extra 30$ c/u
        //comida: 45$
        salary = salary + (30*2) - 45;
        System.out.println(salary);

        //actualizando cadenas de texto
        String employee = "Edson";
        employee = employee + " Bahena Barrios";
        System.out.println(employee);

    }
}
