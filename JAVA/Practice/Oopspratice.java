public class Oopspratice {

    public static void main(String args[]) {
        Pen p1 = new Pen();// created a pen in heap
        p1.setcolor("red");
        System.out.println(p1.getColor());

        p1.setTip(6);
        System.out.println(p1.getTip());

        BankAccount Acc = new BankAccount();
        Acc.username ="anuu";
        Acc.setpassword("12345");
        System.out.println(Acc.getPassword());

    }

}

class BankAccount {

    public String username;

    private String Password;

    String getPassword() {
        return this.Password;
    }

    void setpassword(String pkd) {
       this.Password = pkd;
    }

}

class Pen {

    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setcolor(String newcolor) {
        color = newcolor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}
