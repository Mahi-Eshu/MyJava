package Pattern.MatrixPattern;
import java.util.*;

public class XPatternFromNthIndex {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        //input
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] m = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        //finding the indices where the value is equal to x
        int ind1 = -1, ind2 = -1;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(m[i][j]==x){
                    ind1 = i;
                    ind2 = j;
                    break;
                }
            }
        }

        //printing the X-asterisk pattern
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if( (i==ind1 && j==ind2) || (Math.abs(i-ind1) == Math.abs(j-ind2)) ){
                    System.out.print("* ");
                }
                else System.out.print(m[i][j]+" ");
            }
            System.out.println();
        }
    }
}

//r=5 c=4
//14 13 46 24
//33 35 30 18
//12 22 23 27
//31 21 26 44
//47 10 36 49
//x=22


//output:
//14 13 46 *
//* 35 * 18
//12 * 23 27
//* 21 * 44
//47 10 36 *
