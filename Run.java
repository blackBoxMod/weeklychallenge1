import java.text.SimpleDateFormat;
import java.util.*;


public class Run {
    public static void main(String[] a) {

        SLL sll = new SLL();

        Scanner io = new Scanner(System.in);
        String choice;
        String value;
        Boolean menu = true;
        while(menu) {

            System.out.println("-----Menu-----");
            System.out.println("1) Push");
            System.out.println("2) Pop");
            System.out.println("3) Print");
            System.out.println("4) Exit");
            System.out.println("--------------");
            choice = io.nextLine();

            switch(choice) {
                case "1":
                    System.out.print("Value To Push: ");
                    value = io.nextLine();

                    sll.push(Integer.parseInt(value));

                    System.out.println("Value Pushed.");
                    break;
                
                case "2":
                    sll.pop();
                    System.out.println("Value Popped.");
                    break;

                case "3":
                    sll.print();
                    break;

                case "4":
                    menu = false;
                    break;
            }
        }

        System.out.println("Exited.");
    }
}