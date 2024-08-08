
import java.util.*;

//checking if the frequencies of characters in two strings are same or not
//input : abbbbqqqrr ooopppffe
//output : YES
//input : BOok Look
//output : NO
class CheckStringFrequencies {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String a = "abbbbqqqrr";
        String b = "oooopppffe";
        Set<Integer> set = new HashSet<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Character> s = new HashSet<>();
        for(int i=0;i<a.length();i++){
            s.add(a.charAt(i));
        }
        for(char ch : s){
            int c = 0;
            for(int i=0;i<a.length();i++){
                if(a.charAt(i)==ch){
                    c++;
                }
            }
            set.add(c);
        }
        s.clear();
        for(int i=0;i<b.length();i++){
            s.add(b.charAt(i));
        }
        for(char ch : s){
            int c = 0;
            for(int i=0;i<b.length();i++){
                if(b.charAt(i)==ch){
                    c++;
                }
            }
            set1.add(c);
        }
        if(set.size()!=set1.size()){
            System.out.print("NO");
            return;
        }
        for(int ch : set){
            if(!set1.contains(ch)){
                System.out.print("NO");
                return;
            }
        }
        System.out.print("YES");
    }
}