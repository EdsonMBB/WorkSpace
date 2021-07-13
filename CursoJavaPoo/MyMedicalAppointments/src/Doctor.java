public class Doctor {
    //Atributos
    static int id =0;//Autoincrement
    String name;
    String speciality;

    //Metodo Constructor
    Doctor(){
        System.out.println("Construyendo el objeto doctor");
        id++;
    }

    Doctor(String name){
        System.out.println("El nombre del doctor asignado es " + name);

    }

    //Comportamientos || Metodos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: " + id);
    }

}
