import java.io.PrintWriter;
import java.util.Hashtable;
import java.util.Scanner;
import java.lang.StringBuilder;
import java.lang.String;

//Binary Class handles conversions from binary to other formats
public class Binary {
    private Scanner scan = new Scanner(System.in);
    private StringBuilder sb;
    private PrintWriter pw;

    private String binNum;
    private String hexNum;
    private int decNum;

    /*

     */
    public Binary(PrintWriter pw){
        this.pw = pw;
    }

    /*

     */
    public void binToDec() {
        inputBin();
        toDec();
        outDec();
    }

    /*

     */
    public void binToHex() {
        inputBin();
        toHex();
        outHex();
    }

    /*

     */
    private void inputBin(){
        binNum = "";
        System.out.println("Enter a String representing a binary number:" +
                "\n\tNOTE:Binary numbers containing groupings of 0's and 1's" +
                "\n\t\t The sequences should be in groups of 4\n\t - For example: 0011 is binary for 3");
        binNum = scan.nextLine();
        System.out.println("You entered: " + binNum);
    }

    /*

     */
    private void toDec(){
        decNum = 0;
        int base = 1;
        for(int length = binNum.length() - 1; length >= 0; length--){
            if(binNum.charAt(length) == '1'){
                decNum += base;
            }
            base = base * 2;
        }
        System.out.println(decNum);
    }

    /*

     */
    private void outDec(){
        pw.print("Binary to Decimal: " + binNum + " -----> " + decNum + "\n");
    }

    /*

     */
    private void toHex(){
        Hashtable<String, String> binHex = new Hashtable<String, String>()
        {{
            put("0000","0");
            put("0001","1");
            put("0010","2");
            put("0011","3");
            put("0100","4");
            put("0101","5");
            put("0110","6");
            put("0111","7");
            put("1000","8");
            put("1001","9");
            put("1010","A");
            put("1011","B");
            put("1100","C");
            put("1101","D");
            put("1110","E");
            put("1111","F");
        }};

        hexNum = "0x";

        for(int i = 0; i < binNum.length()/4; i++){
            int index = i*4;
            hexNum += binHex.get(binNum.substring(index, index +4));
        }
        System.out.println(hexNum);
    }

    /*

     */
    private void outHex() {
        pw.print("Binary to Hexadecimal: " + binNum + " -----> " + hexNum + "\n");
    }
}
