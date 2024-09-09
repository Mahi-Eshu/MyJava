// sept9

// INPUT: 6
// OUTPUT:
// 1 1 1 1 
// 1 2 2 2 
// 1 2 3 3 
// 1 2 3 6 

// INPUT: 8
// OUTPUT:
// 1 1 1 1 
// 1 2 2 2 
// 1 2 4 4 
// 1 2 4 8 

import java.util.*;
class FactorialPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(n%i==0){
                list.add(i);
            }
        }
        int[][] m = new int[list.size()][list.size()];
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                m[i][j]=list.get(j);
            }
        }
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                if(i<j){
                    m[i][j]=list.get(i);
                }
            }
        }
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.size();j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}