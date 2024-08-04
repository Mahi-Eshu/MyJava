import java.util.*;


// 1. a matrix size of r & c, filled with alphabets and digits is given
// 2. determine the count of the digits and alphabets
// 3. check which count is a perfect square root (either is definitly a perfect square)
// 4. print the square matrix based on their count, which is a perfect square
// 5. else if both counts are perfect square, find the max and print the equivalent square matrix




class SquareMatrixDigitOrAlphabet{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        char[][] s = new char[r][c];

        List<Character> numbers  = new ArrayList<>();
        List<Character> letters = new ArrayList<>();

        int digits = 0, chars = 0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                s[i][j] = sc.next().charAt(0);
                if(Character.isDigit(s[i][j])){
                    digits++;
                    numbers.add(s[i][j]);
                }
                else{
                    chars++;
                    letters.add(s[i][j]);
                }
            }
        }
        double sqrt = Math.sqrt(digits);
        double sqrt2 = Math.sqrt(chars);

        if(sqrt - Math.floor(sqrt)==0 && sqrt2 - Math.floor(sqrt2)==0){
            System.out.println("Both are Square");
            int ind = 0;
            if(sqrt > sqrt2){
                for(int i=0;i<sqrt;i++){
                    for(int j=0;j<sqrt;j++){
                        System.out.print(numbers.get(ind));
                        ind++;
                    }
                    System.out.println();
                }
            }
            else{
                for(int i=0;i<sqrt2;i++){
                    for(int j=0;j<sqrt2;j++){
                        System.out.print(letters.get(ind));
                        ind++;
                    }
                    System.out.println();
                }
            }
        }
        else if(sqrt - Math.floor(sqrt)==0){
            System.out.println("Numbers is square");
            int ind = 0;
            for(int i=0;i<sqrt;i++){
                for(int j=0;j<sqrt;j++){
                    System.out.print(numbers.get(ind));
                    ind++;
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Characters is square");
            int ind = 0;
            for(int i=0;i<sqrt2;i++){
                for(int j=0;j<sqrt2;j++){
                    System.out.print(letters.get(ind));
                    ind++;
                }
                System.out.println();
            }
        }
    }
}