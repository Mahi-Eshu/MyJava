import java.util.*;

// INPUT: 4   
//        2 1 3 5
// OUTPUT: 1 + 2 = 3
//         2 + 1 = 3
//         2 + 3 = 5
//         3 + 2 = 5

public class SumOfDigitsInTheSameArray{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<n;i++){
            s[i]=sc.nextInt();
            set.add(s[i]);
        }
        List<int[]> triples = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int sum = s[i]+s[j];
                if(set.contains(sum)){
                    triples.add(new int[]{s[i], s[j], sum});
                    triples.add(new int[]{s[j], s[i], sum});
                }
            }
        }
        if(triples.size()==0){
            System.out.print(-1);
            return;
        }
        Collections.sort(triples, (a, b)-> {
            if(a[2]!=b[2]){
                return a[2]-b[2];
            }
            else{
                return a[0]-b[0];
            }
        });
        for(int[] tri : triples){
            System.out.println(tri[0]+" + "+tri[1]+" = "+tri[2]);
        }
    }
}