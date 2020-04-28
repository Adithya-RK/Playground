#include<iostream>
using namespace std;
int main(){
  int num,fac=1;
  cin>>num;
  for(int i=num;i>0;i--) fac=fac*i;
  cout<<fac;
}