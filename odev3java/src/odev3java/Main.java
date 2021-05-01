package odev3java;

public class Main {

	public static void main(String[] args) {

        Student student1 = new Student("elif","tuğba",1951802084,1910);
        Student student2 = new Student("ömer","brandon",191802012,1806);
        Instructor instructor1 = new Instructor("Engin","Demiroğ",1111,"1","Java+React");
        
        User user1 = new User();
        user1.setFirstname("elif");
        user1.setLastname("tuğba");
        user1.setNationalNumber(123);
       

        UserManager userManager = new UserManager();
        userManager.singIn(user1);

        StudentManager studentManager = new StudentManager();
        studentManager.add(student1);
        studentManager.add(student2);
        studentManager.attend(student1);
        studentManager.attend(student2);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.addInstructor(instructor1);
}

}
