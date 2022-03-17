public abstract class Appointment {
    //instance variables
    protected int year;
    protected int month;
    protected int day;
    protected String description;
    
    //appointment constructor 
    public Appointment (int year, int month, int day, String description) {
        this.year = year;
        this.month = month;
        this.day = day;
        this.description = description;
    }

    //occursOn method
    public abstract boolean occursOn(int year, int month, int day);
}