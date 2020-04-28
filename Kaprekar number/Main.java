#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string number;
  cin>>number;
  int n=stoi(number),n1=0,n2=0;
  int temp=n*n;
  string num=to_string(temp);
  for(int i=0;i<num.length()/2;i++) n1=n1*10+num[i]-'0';
  for(int i=num.length()/2;i<num.length();i++) n2=n2*10+num[i]-'0';
  if(n==n1+n2) cout<<"Kaprekar Number";
  else cout<<"Not a Kaprekar Number";
}