import java.util.*;


// INPUT: 45673456735456
// OUTPUT: 5818

// INPUT : 999
// OUTPUT: 7

public class BinaryToDecimal{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        //getting the input
        long n = sc.nextLong();

        //converting to String for better manipulation
        String s = String.valueOf(n);

        //variable to store the final answer
        int ans = 0;


        for(int i=0;i<s.length();i++){
            
            //adding the decimal value[pow(2,x)] to the 'ans' when the value at any index is odd
            if((s.charAt(i)-'0')%2!=0){
                int pow = (int)Math.pow(2, s.length()-i-1);
                ans += pow;
            }
        }
        System.out.print(ans);
    }
}