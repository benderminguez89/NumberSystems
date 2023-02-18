import java.io.PrintWriter;
import java.util.Scanner;

public class Menu {
    private PrintWriter pw;
    private Scanner s = new Scanner(System.in);
    public Menu(PrintWriter pw){
        this.pw = pw;
    }

    public void display(){
        System.out.println("------------------------------------------------\n\t\t\tNUMBER SYSTEM\nThis program will convert values based \n\t\ton following options:");
        System.out.println("\t1.\tDecimal to Binary\n\t2.\tDecimal to Hexidecimal\n\t3.\tBinary to Decimal\n\t4.\tBinary to Hexidecimal\n\t5.\tHexidecimal to Decimal\n\t6.\tHexidecimal to Binary\n\t7.\tQuit");
    }

    public int getSelection(){
        int choice = s.nextInt();

        if(choice > 6 && choice < 1){
            System.out.println("Error: Selection MUST be 1 through 7");
            getSelection();
        }

        return choice;
    }
}
