import java.util.*;

class ReverseOfNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        int p = 0;
        for(int i=s.length()-1;i>=0;i--){
            p = (p*10)+(s.charAt(i)-'0');
        }
        System.out.print(p);
    }
}