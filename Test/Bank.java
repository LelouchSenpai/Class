package Test;

public class Bank {
    private String customer,branch,account,card;

    public void setcustomer(String c){
        customer=c;
    }

    public void open(String b){
        System.out.println(b + " is open.");
    }

    public void close (String b){
        System.out.println(b + " is closed.");
    }

    public void accountregistered(){
        System.out.println("acount has been registered.");
    }

    public void cardready(){
        System.out.println( "\' card is ready.");
    }
}
