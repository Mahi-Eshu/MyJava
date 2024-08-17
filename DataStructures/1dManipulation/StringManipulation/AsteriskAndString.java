import java.util.*;

// INPUT: boom
// OUTPUT: bo**
//         **om


public class AsteriskAndString{

    static boolean vow(char c){
        char ch = Character.toLowerCase(c);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        String a = new String();
        a += s.charAt(0);
        for(int i=1;i<s.length();i++){
            if(vow(s.charAt(i-1))){
                a += "*";
            }
            else{
                a += s.charAt(i);
            }
        }
        System.out.println(a);
        for(int i=0;i<s.length();i++){
            if(a.charAt(i)=='*'){
                System.out.print(s.charAt(i));
            }
            else{
                System.out.print("*");
            }
        }
    }
}