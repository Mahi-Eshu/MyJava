import java.util.*;

class MatrixRowShift{
    static void shiftUp(int[][] m, int k){
        int r = m.length, c = m[0].length;
        for(int i=0;i<c;i++){
            int[] list = new int[r];
            for(int j=0;j<r;j++){
                int index = (j + k) % r;
                list[index] = m[j][i];
            }
            for(int j=0;j<r;j++){
                m[j][i] = list[j];
            }
        }
    }
    static void shiftDown(int[][] m, int k){
        int r = m.length, c = m[0].length;
        for(int i=0;i<c;i++){
            int[] list = new int[r];
            for(int j=0;j<r;j++){
                int index = (j + k) % r;
                list[j] = m[index][i];
            }
            for(int j=0;j<r;j++){
                m[j][i] = list[j];
            }
        }
    }
    public static void main(String[] args){
        int[][] m =  {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}};
        int k = 2;
        int r = m.length, c = m[0].length;

        if(k>r){
            System.out.print("Row shift not possible");
            return;
        }
        // shiftUp(m, k);
        // System.out.println("Shifted Up");
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         System.out.print(m[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        shiftDown(m, k);
        System.out.println("Shifted Down");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}