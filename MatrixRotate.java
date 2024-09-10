import java.util.*;

class MatrixRotate{
    static void rotate(int[][] m, int r, int c){
        int row = 0, col = 0;
        int prev = 0, curr = 0;

        while(row < r && col < c){

            prev = m[row+1][col];

            if(row + 1 == r || col + 1 == c){
                break;
            }

            //top rows
            for(int j=col;j<c;j++){
                curr = m[row][j];
                m[row][j] = prev;
                prev = curr;
            }
            row++;

            //right columns
            for(int i=row;i<r;i++){
                curr = m[i][c-1];
                m[i][c-1] = prev;
                prev = curr;
            }
            c--;

            //bottom rows
            if(row < r){
                for(int j=c-1;j>=col;j--){
                    curr = m[r-1][j];
                    m[r-1][j] = prev;
                    prev = curr;
                }
            }
            r--;

            //left columns
            if(col < c){
                for(int i=r-1;i>=row;i--){
                    curr = m[i][c-1];
                    m[i][c-1]= prev;
                    prev = curr;
                }
            }
            col++;
        }
    }
    public static void main(String[] args){
        int[][] m =  {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}};
        int r = m.length, c = m[0].length;
        rotate(m, r, c);
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}