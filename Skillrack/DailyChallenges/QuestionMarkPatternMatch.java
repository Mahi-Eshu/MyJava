import java.util.*;


// INPUT: ?i?n
//         LION LARGE NEXT lion

// OUTPUT: lion

public class QuestionMarkPatternMatch{

    static boolean matchPattern(String word, String p){
        if(word.length()!=p.length()){
            return false;
        }
        for(int i=0;i<p.length();i++){
            char a = p.charAt(i);
            char b = word.charAt(i);
            if(a!='?' && a!=b){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String p = sc.nextLine();
        String a = sc.nextLine();
        String[] s = a.split(" ");
        for(String word : s){
            if(matchPattern(word, p)){
                System.out.print(word);
                return;
            }
        }
        System.out.print(-1);
    }
}