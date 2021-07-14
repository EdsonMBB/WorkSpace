import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        //showMenu();
        Doctor myDoctor = new Doctor("Edson Bahena", "Cirujano");
        myDoctor.addAvailableApointment(new Date(), "4pm");
        myDoctor.addAvailableApointment(new Date(), "10am");
        myDoctor.addAvailableApointment(new Date(), "1pm");

        for(Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }

        Patient patient = new Patient("Alejandra", "alejandra@nmail.com");
        System.out.println(patient);


    }


}
