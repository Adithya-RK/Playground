#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string num;
  cin>>num;
  int even=0,odd=0;
  for(int i=0;i<num.length();i++){
    if((num[i]-'0')%2==0) even+=num[i]-'0';
    else odd+=num[i]-'0';
  }
  if(odd==even) cout<<"Yes";
  else cout<<"No";
}