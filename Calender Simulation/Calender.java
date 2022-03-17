import java.util.ArrayList;

public class Calender {
    
    //creating arrayList to store appointment data
    private ArrayList<Appointment> appointments = new ArrayList<Appointment>();

    //method to add appointments to the list
    public void add(Appointment appoint) {
        appointments.add(appoint);
    }

    //method to remove an appointment from the list
    public void remove(int year, int month, int day) {
    	//loop to remove a specific date from the list
        int i = 0;
        while (i < appointments.size()) {
            if (appointments.get(i).occursOn(year, month, day)) 
            	appointments.remove(i); 
            else {
            	i++;
            	}
        }
    }

    //method to convert list into one big string cheese
    public String toString() {
        String allAppointments = "";
        for (Appointment appoint : appointments) {
            allAppointments += appoint.toString() + "\n";
        }
        return allAppointments;
    }

}