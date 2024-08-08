// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

public class PerimeterOfAreaInMatrix {
    public static int surrounding(int[][] m, int i, int j){
        int r = m.length;
        int c = m[0].length;
        int x = 0;
        if(i>0 && m[i-1][j]==1){
            x++;
        }
        if(j>0 && m[i][j-1]==1){
            x++;
        }
        if(i<r-1 && m[i+1][j]==1){
            x++;
        }
        if(j<c-1 && m[i][j+1]==1){
            x++;
        }
        return x;
    }
    public static int perimeter(int[][] m){
        int r = m.length;
        int c = m[0].length;
        int perim=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j]==1){
                    perim += (4 - surrounding(m, i, j));
                }
            }
        }
        return perim;
    }
    public static void main(String[] args) {
        int[][] m =  {{0, 1, 0, 1, 0}, 
                       {1, 1, 1, 0, 0}, 
                       {1, 0, 0, 0, 1}};
        System.out.print(perimeter(m));
    }
}

//output : 20