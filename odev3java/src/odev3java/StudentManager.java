package odev3java;

public class StudentManager {
    public void add(Student student){
        System.out.println(student.getFirstname()+" "+student.getLastname()+" adlı öğrenci derse eklendi");

    }
    public void delete(Student student){
        System.out.println(student.getStudentid()+" "+"ögrenci dersten silindi!");
    }
    public void attend(Student student){
        System.out.println(student.getStudentid()+" yoklamanız alınmıştır.Derse dönebilirsiniz.");
    }
}
