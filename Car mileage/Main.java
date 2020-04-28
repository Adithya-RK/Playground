#include<iostream>
using namespace std;
int main()
{
  float mile;
  int pet,dis;
  cin>>mile>>pet>>dis;
  if(mile*pet>=dis) cout<<"Can reach";
  else cout<<"Cannot reach";
}