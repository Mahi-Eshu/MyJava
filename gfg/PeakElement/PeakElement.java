import java.util.*;

class PeakElement{
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 120, 40, 90, 70));
        if(list.get(0)>list.get(1)){
            System.out.print(list.get(0)+" ");
        }
        for(int i=1;i<list.size()-1;i++){
            if(list.get(i)>list.get(i-1) && list.get(i)>list.get(i+1)){
                System.out.print(list.get(i)+" ");
            }
        }
        if(list.get(list.size()-1)>list.get(list.size()-2)){
            System.out.print(list.get(list.size()-1));
        }
    }
}


// An element is said to be peak element only if it is greater than its adjacent elements