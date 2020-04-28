#include<iostream>
using namespace std;
int main(){
  int a,b;
  cin>>a>>b;
  cout<<"a+b="<<a+b<<endl;
  cout<<"a-b="<<a-b<<endl;
  cout<<"a*b="<<a*b<<endl;
  if(b==0) cout<<"error\n";
  else cout<<"a/b="<<a/b<<endl;
  cout<<"a%b="<<a%b<<endl;
  return 0;
}