#include<iostream>
using namespace std;
int main()
{
  int x,y,num;
  cin>>x>>y>>num;
  if(num%y==0&&num<x*y) cout<<"It is a mango tree";
  else cout<<"It is not a mango tree";
}