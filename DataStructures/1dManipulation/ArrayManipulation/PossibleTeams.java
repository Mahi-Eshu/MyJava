import java.util.*;

class PossibleTeams {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int teams=0;//5 -1 -6 -2 -6 7
        int posCount=0,negCount=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>0){
                posCount++; //2
            }else{
                negCount++;//4
            }
        }
        int fullTeams = Math.min(posCount/2, negCount/3);//min(1,1)
        teams+=fullTeams;//1
        posCount-=fullTeams*2; //2-2=0
        negCount-=fullTeams*3;//4-3=1
        
        while(posCount>0 || negCount>0){
            int teamSize=0;
            int negInTeam=0;
            while(teamSize<5 && (posCount>0 || negCount>0)){
                if(negCount>0 && negInTeam<3){
                    negCount--;
                    negInTeam++;
                }
                else if(posCount>0){
                    posCount--;
                }
                else{
                    break;
                }
                teamSize++;
            }
            teams++;
        }
        System.out.print(teams);
    }
}

//input = 9, {2, -5, -7, -2, -10, -3, -4, -6, -3}
//output = 3