#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int num;
  string str;
  cin>>str>>num;
  if(str=="front"&&num==1||str=="rear"&&num==0) cout<<"Left Handed";
  else  cout<<"Right Handed";
}