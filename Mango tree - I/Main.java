#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  cin>>a>>b>>c;
  if((c%b==1||c%b==0||c<b)&&c<(a*b)) cout<<"Yes";
  else cout<<"No";
}