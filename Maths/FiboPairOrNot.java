import java.util.*;

class FiboPairOrNot{
    static boolean isFibo(int n){
        int mid1 = 5*n*n + 4;
        int mid2 = 5*n*n - 4;

        int s1 = (int)Math.sqrt(mid1);
        int s2 = (int)Math.sqrt(mid2);

        if(s1*s1==mid1 || s2*s2==mid2){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        if(isFibo(n)){
            System.out.print("FiboPair");
            return;
        }
        for(int i=1;i<=n;i++){
            if(isFibo(i) && isFibo(n-i)){
                System.out.print("FiboPair");
                return;
            }
        }
        System.out.print("noFiboPair");
    }
}