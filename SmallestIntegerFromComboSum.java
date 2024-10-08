import java.util.*;

class SmallestIntegerFromComboSum {
    static int SmallestInteger(int[] s){
        Arrays.sort(s);
        int sum = 0;
        for(int i : s){
            if(i > sum+1){
                return sum+1;
            }
            sum += i;
        }
        return sum+1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for(int i=0;i<n;i++){
            s[i] = sc.nextInt();
        }
        System.out.print(SmallestInteger(s));
    }
}

// This program prints the smallest positive integer that is neither
// a subset of the given array nor the sum of any subsets of the given
// array.

// input:
// 4
// 1 2 3 4
// output:
// 11

// input:
// 4
// 12 12 12 12
// output:
// 1