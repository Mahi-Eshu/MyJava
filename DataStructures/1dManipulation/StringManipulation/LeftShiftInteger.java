import java.util.*;

// INPUT :    3467
// OUTPUT :   7346
//            6734

public class LeftShiftInteger{
    public static void main(String[] args){
        Scanner sc =  new Scanner (System.in);

        //getting the input
        int n = sc.nextInt();

        //converting the input into String for better manipulation
        String s = String.valueOf(n);


        for(int i=0;i<s.length();i++){
            //assigning a new string for storing the combination at each shift
            String a = new String();

            if(i>0){
                for(int j=s.length()-i;j<s.length();j++){
                    a += s.charAt(j);
                }
            }
            for(int j=0;j<s.length()-i;j++){
                a += s.charAt(j);
            }

            //if the unit digit (or) the last element of the string is even then printing it
            if((a.charAt(a.length()-1)-'0')%2==0){
                System.out.println(a);
            }
        }
    }
}