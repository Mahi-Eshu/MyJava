import java.util.*;


// INPUT:      NOTEBOOKPAPER

// OUTPUT:     N-O-TEBOOKPAP-E-R
//             NOT-E-BOOKP-A-PER
//             NOTEB-O--O-KPAPER
//             NOTEB-O--O-KPAPER
//             NOT-E-BOOKP-A-PER
//             N-O-TEBOOKPAP-E-R


public class VowelLeftRight{

    static boolean vow(char c){
        char ch = Character.toLowerCase(c);
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        String s = sc.next();
        int len = 0, a = 0, b = 0;

        //to determine the total vowel count, for the number of rows in output
        for(int i=0;i<s.length();i++){
            if(vow(s.charAt(i))){
                len++;
            }
        }

        //to find the index of the first most vowel
        for(int i=0;i<s.length();i++){
            if(vow(s.charAt(i))){
                a = i;
                break;
            }
        }

        //to find the index of the last most vowel
        for(int i=s.length()-1;i>=0;i--){
            if(vow(s.charAt(i))){
                b = i;
                break;
            }
        }

        //output
        for(int j=0;j<len;j++){
            for(int i=0;i<s.length();i++){
                if(i==a || i==b){
                    System.out.print("-"+s.charAt(i)+"-");
                }
                else{
                    System.out.print(s.charAt(i));
                }
            }
            for(int i=a+1;i<s.length();i++){
                if(vow(s.charAt(i))){
                    a = i;
                    break;
                }
            }
            for(int i=b-1;i>=0;i--){
                if(vow(s.charAt(i))){
                    b = i;
                    break;
                }
            }
            System.out.println();
        }
    }
}

