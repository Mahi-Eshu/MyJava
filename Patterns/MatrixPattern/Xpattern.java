import java.util.*;

class Xpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int middle=(n+1)/2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=middle){
                    if(i==j){
                        System.out.print(n-i+1);
                    }
                    else if(i==n-j+1){
                        System.out.print(i);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(i==j){
                        System.out.print(i);
                    }
                    else if(i==n-j+1){
                        System.out.print(n-i+1);
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

// input = 5

//output:
// 5    1
//  4  2
//   3
//  2  4
// 1    5