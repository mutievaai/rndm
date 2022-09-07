import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String sal = "sales";
        String dev = "development";
        String acc = "accounting";
        String none = "";
        System.out.println("New worker John. Department Codes:\n" +
                "1 for Sales\n" +
                "2 for Development \n" +
                "3 for Accounting \n" +
                "0 for none\n" +
                "Enter the department code: ");

        Scanner rndm = new Scanner(System.in);
        int num = rndm.nextInt();
        switch (num) {
            case 1:
                System.out.println("Depatment: " + sal);
                break;
            case 2:
                System.out.println("Depatment: " + dev);
                break;
            case 3:
                System.out.println("Depatment: " + acc);
                break;
            case 4:
                System.out.println("Depatment: ");
                break;

        }
//            if(num == 1) {
//                System.out.println("Depatment: " + sal);
//            } else if (num == 2) {
//                System.out.println("Depatment: " + dev);
//            } else if (num == 3) {
//                System.out.println("Depatment: " + acc);
//            }
//            else {
//                System.out.println("Depatment: " );
//    }
                System.out.println("Your passwordd is: ");
                System.out.println("Display name: John Smith");
        System.out.println("Company email: john.smith@acct." + "" +".com" );
        System.out.println("Mailbox capacoty: 500mb");

    }
}