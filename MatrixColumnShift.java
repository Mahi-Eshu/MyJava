import java.util.*;

class MatrixColumnShift{

    static void shiftRight(int[][] m, int k){
        int r = m.length, c = m[0].length;
        for(int i=0;i<r;i++){
            int[] list = new int[c];
            for(int j=0;j<c;j++){
                int index = (j+k) % c;
                list[index] = m[i][j];
            }
            for(int j=0;j<c;j++){
                m[i][j] = list[j];
            }
        }
    }
    static void shiftLeft(int[][] m, int k){
        int r = m.length, c = m[0].length;
        for(int i=0;i<r;i++){
            int[] list = new int[c];
            for(int j=0;j<c;j++){
                int index = (j+k) % c;
                list[j] = m[i][index];
            }
            for(int j=0;j<c;j++){
                m[i][j] = list[j];
            }
        }
    }
    public static void main(String[] args){
        int[][] m =  {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}};
        int k = 2;
        int r = m.length, c = m[0].length;
        if(k>c){
            System.out.print("Shift not possible");
            return;
        }
        shiftLeft(m, k);
        System.out.println("Shifted Left");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}