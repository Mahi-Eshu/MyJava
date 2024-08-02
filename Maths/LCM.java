class LCM {
    static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    static int lcm(int[] s, int n){
        int ans=s[0];
        for(int i=1;i<n;i++){ 
            ans = (s[i]*ans) / gcd(s[i],ans);
        }
        return ans;
    }
    public static void main(String[] args) {
        int n=5;
        int[] s={2,7,3,9,4};
        int ans = lcm(s,n);
        System.out.println(ans);
    }
}

//output : 252