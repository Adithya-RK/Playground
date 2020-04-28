#include<iostream>
using namespace std;
int main()
{
  int max,a,c;
  cin>>max>>a>>c;
  if(a*75+c*30>max) cout<<"Boat will drow";
  else cout<<"Boat is stable";
}