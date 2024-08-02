package LeetCode;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] s, int n){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(s);
        for(int i=0;i<n;i++){
            if(i>0 && s[i]==s[i-1]){
                continue;
            }
            int j = i+1;
            int k = n-1;
            while(j<k){
                int sum = s[i] + s[j] + s[k];
                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                }
                else{
                    ans.add(Arrays.asList(s[i], s[j], s[k]));
                    j++;
                    while(j<k && s[j]==s[j-1]){
                        j++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for(int i=0;i<n;i++){
            s[i] = sc.nextInt();
        }
        System.out.print(threeSum(s, n));
    }
}
