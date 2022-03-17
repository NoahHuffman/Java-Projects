public class Monthly extends Appointment {

    //Monthly constructorr
    public Monthly (int year, int month, int day, String description) {
        super(year, month, day, description);
    }

    @Override //occursOn method being overridden
    public boolean occursOn(int year, int month, int day) {
    	//returns true if day is the same, and if the day is not in the past
        if (this.day == day && (this.year >= year && this.month >= month)) { return true; } else { return false; }
    }
    
    @Override //converts to string form
    public String toString() {
        return "Monthly[" + description + " Date: " + year + "/" + month + "/" + day + "]";
    }
    
}