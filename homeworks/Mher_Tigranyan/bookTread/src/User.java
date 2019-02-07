import java.util.ArrayList;

public class User extends Thread{
    private String name;
    protected User(String name){
        this.name = name;
    }
    @Override
    public void run() {
        System.out.println("Thread " + name + " started");
    }
    public void getBook(String name, int count, ArrayList books){

        for (Object b : books){

        }
    }

}
