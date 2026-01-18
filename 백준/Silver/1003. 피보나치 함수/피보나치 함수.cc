#include <iostream>

using namespace std;

int fibonacci(int n) {
    int dp[41];
    dp[0]=0;
    dp[1]=1;
    for (int i=2;i<n+1;i++){
        dp[i]=dp[i-1]+dp[i-2];
    }
    return dp[n];
}

int main(){
    int t;
    cin>>t;

    for (int i=0;i<t;i++){
        int n;
        cin>>n;
        int a,b;
        if (n==0){
            a=1;
            b=0;
        }
        else if (n==1){
            a=0;
            b=1;
        }
        else{
            a=fibonacci(n-1);
            b=fibonacci(n);
        }
        cout<<a<<" "<<b<<endl;

    }

    
}