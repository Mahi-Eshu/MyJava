import java.util.*;

// INPUT: 8 
//        AD 2H 4S 5S JD QD AC 8D
// OUTPUT: C - A 
//         D - A 8 J Q 
//         H - 2 
//         S - 4 5 

// INPUT: 8 
//        AD 2H 4S 5S JD QD AS QD
// OUTPUT: C - *
//         D - A J Q Q 
//         H - 2 
//         S - A 4 5 


//Given n, array of n Cards XY (X:Card Number, Y:Card Family) -> Clubs, Diamonds, Hearts, Spades.
//todo - Print them in C, D, H, S pattern.


public class CardPattern{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for(int i=0;i<n;i++){
            s[i] = sc.next();
        }

        char[] Deck = {'C', 'D', 'H', 'S'};
        char[] Cards = {'A', '2', '3', '4', '5', '6', '7', '8', '9', 'L', 'J', 'Q', 'K'};


        //brute force
        for(int i = 0; i < 4; i++){
            System.out.print(Deck[i]+" - ");
            List<Character> list = new ArrayList<>();

            for(int j = 0; j < 13; j++){

                for(int x = 0; x < n; x++){
                    if(s[x].length()==2){
                        if(s[x].charAt(0)==Cards[j] && s[x].charAt(1)==Deck[i]){
                            list.add(Cards[j]);
                        }
                    }
                    else{
                        if(s[x].charAt(2)==Deck[i] && j==9){
                            list.add(Cards[j]);
                        }
                    }
                }
            }
            if ( list.size() == 0 ) {   
                System.out.println("*");
            }else{
                for (char c : list){
                    if(c=='L'){
                        System.out.print("10 ");
                    }
                    else{
                        System.out.print(c+" ");
                    }
               }
                System.out.println();
            }
        }
    }
}