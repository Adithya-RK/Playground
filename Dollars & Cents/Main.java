#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,dol,cent;
  cin>>a>>b>>c>>d;
  cent=(b+d)%100;
  dol=a+c+(b+d)/100;
  cout<<dol<<endl<<cent;
}