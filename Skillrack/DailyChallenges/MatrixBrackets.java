// sept9

// INPUT: 5
// OUTPUT:
// (1 2 3 4 5)
// (1 2 3 4)(5)
// (1 2 3)(4 5)
// (1 2)(3 4)(5)
// (1)(2)(3)(4)(5)

// INPUT : 8
// OUTPUT:
// (1 2 3 4 5 6 7 8)
// (1 2 3 4 5 6 7)(8)
// (1 2 3 4 5 6)(7 8)
// (1 2 3 4 5)(6 7 8)
// (1 2 3 4)(5 6 7 8)
// (1 2 3)(4 5 6)(7 8)
// (1 2)(3 4)(5 6)(7 8)
// (1)(2)(3)(4)(5)(6)(7)(8)

import java.util.*;
class MatrixBrackets{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("(");
            for(int j=1;j<=n;j++){
                if(i>1){
                    if(j%(n-i+1)==0){
                        if(i<n && j!=1){
                            if(j<n){
                                System.out.print(j+")(");
                            }
                            else{
                                System.out.print(j);
                            }
                        }
                        else{
                            if(j<n){
                                System.out.print(j+")(");
                            }
                            else{
                                System.out.print(j);
                            }
                        }
                    }
                    else{
                        if(j<n){
                            System.out.print(j+" ");
                        }
                        else{
                            System.out.print(j);
                        }
                    }
                }
                else{
                    if(j<n){
                        System.out.print(j+" ");
                    }
                    else{
                        System.out.print(j);
                    }
                }
            }
            System.out.println(")");
        }
    }
}