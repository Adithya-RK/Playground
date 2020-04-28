#include<iostream>
using namespace std;
int main(){
  int a,b,sum=0;
  cin>>a>>b;
  for(int i=a;i<=b;i++){
    sum=0;
    for(int j=i/2;j>0;j--){
      if(i%j==0) sum+=j;
    }
    if(sum==i) cout<<i<<" ";
  }
}