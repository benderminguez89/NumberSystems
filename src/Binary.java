import java.io.PrintWriter;
import java.util.Scanner;
import java.lang.StringBuilder;

//Binary Class handles conversions from binary to other formats
public class Binary {
    private Scanner scan = new Scanner(System.in);
    private StringBuilder sb;
    private PrintWriter pw;
    public Binary(PrintWriter pw){
        this.pw = pw;
    }
    public void binToDec() {
        inputBin();
    }

    public void binToHex() {
        inputBin();
    }


    private void inputBin(){
        System.out.println("Enter a String representing a binary number:" +
                "\n\tNOTE:Binary numbers containing groupings of 0's and 1's" +
                "\n\t\t The sequences should be in groups of 4\n\t - For example: 0011 is binary for 3");
        String binNum = scan.nextLine();

    }

    private void toDec(){

    }

    private void outDec(){

    }

    private void toHex(){

    }

    private void outHex() {

    }
}
