package odev3java;

public class UserManager extends User {
    public void singIn(User user){
        System.out.println("Merhaba "+ user.getFirstname()+" hoþgeldin !");
    }
    public void signOut(User user){
        System.out.println(user.getFirstname()+" sistemden çýkýþýn yapýldý!");
    }
}