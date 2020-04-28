#include<iostream>
using namespace std;
int main()
{
  int rad,len;
  cin>>rad>>len;
  if(rad*2<=len) cout<<"circle can be inside a square";
  else cout<<"circle cannot be inside a square";
}