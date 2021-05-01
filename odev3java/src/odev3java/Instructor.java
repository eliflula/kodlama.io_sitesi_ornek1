package odev3java;

public class Instructor extends User {
    private String InstructorNumber;
    private String GivenCourse;

    public Instructor(String firstname, String lastname, int nationalNumber,String InstructorNumber,String GivenCourse ){
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setNationalNumber(nationalNumber);
        this.setInstructorNumber(InstructorNumber);
        this.setGivenCourse(GivenCourse);
    }

    public String getInstructorNumber() {
        return InstructorNumber;
    }

    public void setInstructorNumber(String instructorNumber) {
        InstructorNumber = instructorNumber;
    }

    public String getGivenCourse() {
        return GivenCourse;
    }

    public void setGivenCourse(String GivenCourse) {
        this.GivenCourse = GivenCourse;
    }
}
