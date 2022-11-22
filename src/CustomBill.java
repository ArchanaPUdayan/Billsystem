import java.util.ArrayList;
import java.util.Scanner;

public class CustomBill {
    int tea=10;
    int coffee=15;
    int snacks=10;
    int idli=8;
    int dosha=6;
    public CustomBill(int tea,int coffee,int snacks,int idli,int dosha) {
        this.tea = tea;
        this.coffee = coffee;
        this.snacks = snacks;
        this.idli = idli;
        this.dosha = dosha;
    }
}
class main {
    public static void main(String[] args) {
        ArrayList<CustomBill> arr = new ArrayList<CustomBill>();
        while (true) {
            System.out.println("Select an option \n 1 - Tea \n 2 - coffee \n 3 - snacks \n" +
                    "4 - idli \n 5 - Dosha\n 6-Exit");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            if (n == 6) {
                System.out.println("You are exiting from the program");
                System.exit(0);
            } else {
                switch (n) {
                    case 1:
                        System.out.println("Enter food item");

                        Scanner obj = new Scanner(System.in);
                        int Gu= obj.nextInt();
                        System.out.println(Gu);

                       System.out.println("Enter the num of tea");
                        int hu= obj.nextInt();
                        System.out.println(hu);
                        System.out.println("price of tea"+(obj * 10));

                    break;
                    case 2:
                        System.out.println("Enter next item");

                        Scanner obj1 = new Scanner(System.in);
                        int zy= obj1.nextInt();
                        System.out.println(zy);

                        System.out.println("Enter the num of coffee");
                        int tu= obj1.nextInt();
                        System.out.println(tu);
                        System.out.println("price of tea"+(obj1 * 15));
                        break;




                }
            }
        }
    }
}



