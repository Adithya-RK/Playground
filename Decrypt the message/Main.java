#include <iostream>
using namespace std;
int main(){
  int a,b,sum=0;
  cin>>a>>b;
  a=a+b;
  for (int i=a/2;i>0;i--){
    if(a%i==0) sum+=i;
  }
  if(sum==a) cout<<"They can read the message";
  else cout<<"They can't read the message";
}