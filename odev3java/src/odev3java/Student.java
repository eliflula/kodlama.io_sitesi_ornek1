package odev3java;

public class Student extends User{
    private int Studentid;

    public Student(String firstname, String lastname, int studentid,int nationalNumber){
        this.setFirstname(firstname);
        this.setLastname(lastname);
        this.setStudentid(studentid);
        this.setNationalNumber(nationalNumber);
      
    }

    public int getStudentid() {
        return Studentid;
    }

    public void setStudentid(int studentid) {
        Studentid = studentid;
    }
}
