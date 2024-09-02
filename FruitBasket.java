//dynamic programming
//given -> n, array of fruit baskets "s" with s[i] number of fruits,
//condition -> the customer should pick boxes that are not adjacent to each other (never pick adjacent boxes)
//output -> maximum number of fruits a customer can get



// INPUT: 7
//        10 20 15 1 9 12 2
// OUTPUT: 37

// INPUT: 4
//        5 3 11 20
// OUTPUT: 25


import java.util.*;
public class FruitBasket{

    static int maxFruits(int n, int[] s){
        if(n==0) return 0;
        if(n==1) return s[0];
        if(n==2) return Math.max(s[0], s[1]);

        int[] dp = new int[n];
        dp[0] = s[0];
        dp[1] = Math.max(s[0], s[1]);

        for(int i=2;i<n;i++){
            dp[i] = Math.max(dp[i-1], dp[i-2]+s[i]);
        }
        return dp[n-1];
    }

    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for(int  i=0;i<n;i++){
            s[i] = sc.nextInt();
        }

        System.out.print(maxFruits(n, s));
    }
}