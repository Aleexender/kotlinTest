public class Prac {
     static  int a = 0;
    public Prac() {
        System.out.println("Con");
        a = 4;
    }

    {
        System.out.println("kim");
        a = 5;
    }

    public static void main(String[] args) {
        new Prac();
    }
}


