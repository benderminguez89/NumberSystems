import java.io.PrintWriter;
import java.util.Scanner;

public class Decimal {
    private PrintWriter pw;
    private Scanner scan = new Scanner(System.in);
    private int decNum;
    private String binNum;
    private StringBuilder hexNum;

    public Decimal(PrintWriter pw){
        this.pw = pw;
    }
    public void decToBin() {
        inputDec();
        toBin();
        outBin();
    }

    public void decToHex() {
        inputDec();
        toHex();
        outHex();
    }


    private void inputDec(){
        decNum = 0;
        System.out.println("Enter an integer value representing a decimal number:");
        decNum = scan.nextInt();
        System.out.println("You entered: " + decNum);
    }

    private void toBin(){
        int remainder = decNum;
        int temp = 0;
        binNum = "";
        while(remainder >= 1){
            temp = remainder%2;
            binNum = String.valueOf(temp) + binNum;
            remainder = remainder/2;
        }
    }

    private void outBin(){
        pw.print("Decimal to Binary: " + decNum + " -----> " + binNum + "\n");
    }

    private void toHex(){

    }

    private void outHex() {
        pw.print("Decimal to Hexadecimal: " + decNum + " -----> " + hexNum + "\n");
    }
}
