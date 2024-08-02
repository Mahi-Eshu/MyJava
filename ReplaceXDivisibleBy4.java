import java.util.*;

class ReplaceXDivisibleBy4{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        int num = 0;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                num = (num*10) + s.charAt(i)-'0';
            }
        }
        for(int i=0;i<10;i++){
            int ans = (num*10) + i;
            if(ans%4==0){
                System.out.print(ans+" ");
            }
        }
    }
}