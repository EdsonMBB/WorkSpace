import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    //Atributo

    private String speciality;

    //Metodo Constructor

    Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del doctor asignado es " + name);
        this.speciality = speciality;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Comportamientos || Metodos
     ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableApointment(Date date, String time){
        availableAppointments.add(new AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    //Available appointment || Clase anidada
    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;


        public AvailableAppointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

    }


}