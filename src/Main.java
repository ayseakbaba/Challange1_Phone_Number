import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] number = {1,2,3,4,5,6,7,8,9,0};
        createPhoneNumber(number);

    }
    public static String createPhoneNumber(int[] number) {
        String str = Arrays.toString(number);
        for(int i =0;i<1;i++){
            System.out.println("Phone Number: (" + number[0] +number[1] + number[2] +") "
                    + number[3]+number[4]+number[5]+ "-"
                    +number[6]+number[7]+number[8]+number[9]);
        }
        return str;
    }
}