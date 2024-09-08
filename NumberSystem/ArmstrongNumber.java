import java.util.*;

// 0, 1, 153, 370, 371 and 407

class ArmstrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int sum = 0;
        String s = String.valueOf(n);
        for(int i=0;i<s.length();i++){
            int t = s.charAt(i)-'0';
            sum += (int)Math.pow(t,s.length());
        }
        if(n==sum) System.out.print("Armstrong Number");
        else System.out.print("not an armstrong Number");
    }
}