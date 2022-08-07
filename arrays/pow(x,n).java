//o(n)
double ans=1.0;
for(int i=1;i<=n;i++){
    ans*=x;
}
return n<0?1.0/ans:ans;

// log2n
        
        double ans=1.0;
        long nn=n;
        if(nn<0) nn=-1*nn;
        while(nn>0){
            if(nn%2==1){
                ans=ans*x;
                nn--;
            }
            else{
                x=x*x;
                nn/=2;
            }
        }
        if(n<0) ans=(double)1.0/(double)ans;
        return ans;

// striver soln 