#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int n,h;
  float sum;
  cin>>n>>h;
  if(n==1) { sum=h; cout<<sum;}
  else if(n==2){ sum=(float)h+h*.5;  cout<<sum;}
  else if(n==3) { sum=(float)h*2;  cout<<sum;}
  else cout<<"Number of items is more";
  
}