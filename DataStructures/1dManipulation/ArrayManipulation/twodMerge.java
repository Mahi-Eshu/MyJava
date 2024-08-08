
import java.util.*;

class twodMerge{
    public static void main(String[] args){
        String[][] arr1 = {{"name", "gender"}, 
                            {"Mahesh", "20"}};
        String[][] arr2 = {{"dob", "home"}, 
                            {"30072003", "Tiruttani"}};

        int m = arr1[0].length;
        int n = arr2[0].length;
        String[][] arr3 = new String[2][m+n];

        for(int i=0;i<2;i++){
            for(int j=0;j<m+n;j++){
                if(j<m){
                    arr3[i][j] = arr1[i][j];
                }else{
                    arr3[i][j] = arr2[i%m][j%m];
                }
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<m+n;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }
    }
}