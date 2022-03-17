public class Daily extends Appointment {
	
	//daily constructor 
    public Daily (int year, int month, int day, String description) {
        super(year, month, day, description);
    }

    @Override //occursOn method be overridden
    public boolean occursOn(int year, int month, int day) {
    	//rweturns true if the date is after the beginnning date
        if (this.day < day && this.month <= month && this.year <= year) { return false; } else { return true; }
    }

    @Override //converts to string form
    public String toString() {
        return "Daily[" + description + " Date: " + year + "/" + month + "/" + day + "]";
    }
    
}