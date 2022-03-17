public class OneTime extends Appointment {

	//onetime constructor
    public OneTime (int year, int month, int day, String description) {
        super(year, month, day, description);
    }

    @Override //occursOn method being overridden
    public boolean occursOn(int year, int month, int day) {
    	//returns true if the input date and the object date are equal
        if (this.year == year && this.month == month && this.day == day) { return true; } else { return false; }
    }

    @Override
    public String toString() {
        return "Onetime[" + description + " Date: " + year + "/" + month + "/" + day + "]";
    }
    
}