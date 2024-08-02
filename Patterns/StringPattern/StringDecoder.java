import java.util.*;

public class StringDecoder {
    public static void decodeString(String s) {
        int open=0,close=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='[') open++;
            if(s.charAt(i)==']') close++;
        }
        if(open!=close || (open==0 || close==0)){
            System.out.print("Invalid input!");
            return;
        }
        Stack<Character> stack = new Stack<>();
        int i=0;
        while(i<s.length()){
            String a="";
            String b="";
            int f=0;
            if(Character.isAlphabetic(s.charAt(i))){
                if(s.charAt(i-1)=='[' && s.charAt(i+1)==']'){
                    for(int j=0;j<s.charAt(i-2)-'0';j++){
                        System.out.print(s.charAt(i));
                    }
                    a=s.substring(0,i-2);
                    b=s.substring(i+2,s.length());
                    s=a+b;
                    f=1;
                }
            }
            if(f==1) i=0;
            else i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String input = sc.next();
        decodeString(input);
    }
}

//input 3[a5[c]]6[d3[k]]
//output : cccccaaakkkdddddd