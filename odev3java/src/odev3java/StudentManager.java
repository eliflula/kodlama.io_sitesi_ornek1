package odev3java;

public class StudentManager {
    public void add(Student student){
        System.out.println(student.getFirstname()+" "+student.getLastname()+" adl� ��renci derse eklendi");

    }
    public void delete(Student student){
        System.out.println(student.getStudentid()+" "+"�grenci dersten silindi!");
    }
    public void attend(Student student){
        System.out.println(student.getStudentid()+" yoklaman�z al�nm��t�r.Derse d�nebilirsiniz.");
    }
}
