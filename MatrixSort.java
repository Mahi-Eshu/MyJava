import java.util.*;

class MatrixSort{


    static void sortMatrix(int[][] m, int r, int c){
        for(int i=0;i<r;i++){
            Arrays.sort(m[i]);
        }
    }
    static void TransposeMatrix(int[][] m, int r, int c){
        for(int i=0;i<r;i++){
            for(int j=i+1;j<c;j++){
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
    }
    static void sortAndTranspose(int[][] m, int r, int c){

        //sorting each row
        sortMatrix(m, r, c);

        //transposing to convert columns into rows
        TransposeMatrix(m, r, c);

        //sorting each column
        sortMatrix(m, r, c);

        //transposing to get final result
        TransposeMatrix(m, r, c);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] m =     { {12, 7, 1, 8},
                    {20, 9, 11, 2},
                    {15, 4, 5, 13},
                    {3, 18, 10, 6} };
        int r = m.length, c = m[0].length;
        sortAndTranspose(m, r, c);
    }
}