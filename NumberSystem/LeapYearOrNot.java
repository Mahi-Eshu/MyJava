import java.util.*;

class LeapYearOrNot{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int f = ( n%400 == 0) || ( n%4 == 0 && n%100 != 0 ) ? 1 : 0;
        if(f==1) System.out.print("Leap year");
        else System.out.print("Not a leap year");
    }
}