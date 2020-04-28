#include<iostream>
using namespace std;
int main()
{
  int f=0,s=1,num=0,a;
  cin>>a;
  for(int i=1;i<a-1;i++){
    num=f+s;
    f=s;
    s=num;
  }
  cout<<num;
  
}