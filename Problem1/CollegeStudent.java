package Problem1;



public class CollegeStudent extends Student {
    private String major;
    private int year;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, int year, String major) {
        super(name, age, gender, idNum, gpa);
        this.major = major;
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @SuppressWarnings("override")
    public String toString() {
        return super.toString() + ", Year: " + year + ", Major: " + major;
    }
    
    
}
