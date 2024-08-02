package LeetCode;
import java.util.*;

public class TwoSum {
    public static int[] twoSumBruteforce(int[] s, int n, int a){
        int[] ans = new int[2];
        int ind=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(s[i]+s[j]==a){
                    ans[ind++]=s[i];
                    ans[ind++]=s[j];
                    break;
                }
            }
            if(ind==2){
                break;
            }
        }
        return ans;
    }
    public static int[] twoSumOptimal(int[] s, int n, int a){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int diff = a - s[i];
            if(map.containsKey(diff)){
                return new int[]{diff, s[i]};
            }
            map.put(s[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int s[] = new int[n];
        for(int i=0;i<n;i++){
            s[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        for(int val : twoSumBruteforce(s, n, a)){
            System.out.print(val + " ");
        }
        System.out.println();
        for(int val : twoSumOptimal(s, n, a)){
            System.out.print(val + " ");
        }
    }
}

