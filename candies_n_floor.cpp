#include<bits/stdc++.h>
using namespace std;
#define ll long long
#define sky LONG_LONG_MAX
#define ajen LONG_LONG_MIN
#define mod 1000000007
ll binaryexponentiation(ll a,ll b){
    if(b==0)return 1;
    ll res = binaryexponentiation(a,b/2);
    if(b%2) return res*res*a;
    else return res*res;
}
void SieveOfEratosthenes(int n){
    bool prime[n + 1];
    memset(prime, true, sizeof(prime));
    for (int p = 2; p * p <= n; p++){
        if (prime[p] == true){
            for (int i = p * p; i <= n; i += p)
                prime[i] = false;
        }
    }
    for (int p = 2; p <= n; p++){
        if (prime[p]){
            cout<<p<<" ";
        }
    }        
}
int main(){
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    ll n; cin>>n;
    ll a[n][n];
    for(int i = 0; i<n; i++){
        for(int j = 0; j<n; j++){
            cin>>a[i][j];
        }
    }
    ll dp[n][n];
    for(int i = 0; i<n; i++){
        dp[0][i] = a[0][i];
    }
    for(int i = 1; i<n; i++){
        for(int j = 0; j<n; j++){
            ll maxx = dp[i-1][j];
            if(j+1<n){
                maxx = max(maxx,dp[i-1][j+1]);
            }
            if(j-1>=0){
                maxx = max(maxx,dp[i-1][j-1]);
            }
            dp[i][j] = maxx+a[i][j]; 
        }
    }
    ll maxx = ajen;
    for(int i = 0; i<n; i++){
        maxx = max(dp[n-1][i],maxx);
    }
    cout<<maxx<<endl;
    return 0;
}