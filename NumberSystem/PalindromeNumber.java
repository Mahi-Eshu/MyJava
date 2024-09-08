import java.util.*;

class PalindromeNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String s = String.valueOf(n);
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(s.length()-i-1)){
                System.out.print("Not a palindrome");
                return;
            }
        }
        System.out.print("Palindrome");
    }
}