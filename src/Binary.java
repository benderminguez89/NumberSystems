import java.io.PrintWriter;
import java.lang.String;
import java.util.Scanner;
import java.lang.StringBuilder;

//Binary Class handles conversions from binary to other formats
public class Binary {
    private Scanner scan = new Scanner(System.in);
    private StringBuilder sb;
    private PrintWriter pw;
    private String binNum;
    private String hexNum;
    private int decNum;
    public Binary(PrintWriter pw){
        this.pw = pw;
    }
    public void binToDec() {
        inputBin();
        toDec();
        outDec();
    }

    public void binToHex() {
        inputBin();
        toHex();
        outHex();
    }


    private void inputBin(){
        System.out.println("Enter a String representing a binary number:" +
                "\n\tNOTE:Binary numbers containing groupings of 0's and 1's" +
                "\n\t\t The sequences should be in groups of 4\n\t - For example: 0011 is binary for 3");
        binNum = scan.nextLine();
        System.out.println("You entered: " + binNum);

    }

    private void toDec(){
        int base = 1;
        for(int length = binNum.length() - 1; length >= 0; length--){
            if(binNum.charAt(length) == '1'){
                decNum += base;
            }
            base = base * 2;
        }
        System.out.println(decNum);
    }

    private void outDec(){
        pw.print(decNum);

    }

    private void toHex(){

    }

    private void outHex() {

    }
}
