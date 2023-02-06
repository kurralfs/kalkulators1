import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ievadi darbību: (+, -, *, /)");
        char operation = scan.next().charAt(0);
        System.out.println("Ievadi skaitli x:");
        int usr_x = scan.nextInt();
        System.out.println("Ievadi skaitli y:");
        int usr_y = scan.nextInt();



        if (operation == '+'){
            System.out.println(usr_x + usr_y);
        } else if (operation == '-') {
            System.out.println(usr_x - usr_y);
        } else if (operation == '*') {
            System.out.println(usr_x * usr_y);
        } else if (operation == '/') {
            System.out.println(usr_x / usr_y);
        }

    }
}