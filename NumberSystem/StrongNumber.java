import java.util.*;

// 1, 2, 145, and 40585

class StrongNumber{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int k = n;
        int sum = 0;
        while(k>0){
            int t = k%10;
            int p = 1;
            while(t>0){
                p*=t;
                t--;
            }
            sum+=p;
            k/=10;
        }
        if(sum == n) System.out.print("Strong number");
        else System.out.print("Not a strong number");
    }
}