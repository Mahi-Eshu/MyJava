import java.util.*;

class Snake {
    public static void FirstPlayerWins(int a, String s){
        String sb = "";
        ArrayList<String> arr=new ArrayList<>();
        int ind=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i+1)=='w' || s.charAt(i+1)=='s' || s.charAt(i+1)=='g'){
                arr.add(s.substring(ind, i+1));
                ind=i+1;
            }
        }
        int c=0;
        arr.add(s.substring(ind, s.length()));//snake water 
        for(int i=0;i<arr.size()-1;i+=2){
            if((arr.get(i).equals("snake") && arr.get(i+1).equals("water")) 
            || (arr.get(i).equals("water") && arr.get(i+1).equals("gun")) 
            || (arr.get(i).equals("gun") && arr.get(i+1).equals("snake"))){
                    c++;
            }
        }
        System.out.print(c);
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int a=sc.nextInt();
       String s=sc.next();
       FirstPlayerWins(a,s);
    }
}