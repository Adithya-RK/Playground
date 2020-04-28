#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  string str;
  int sum=0,num=0;
  cin>>str;
  for(int i=0;i<str.length();i++) {
    sum+=str[i]-'0';
    num=num*10+str[i]-'0';
  }
  
  if(num%sum==0) cout<<"Harshad Number";
  else cout<<"Not Harshad Number";
}