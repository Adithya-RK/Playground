#include<iostream>
#include<math.h>
using namespace std;
int main()
{
	int num;
  cin>>num;
  if(num<=200)cout<<"Rs."<<floor(num*.5);
  else if(num<=400)cout<<"Rs."<<num*.65+100;
  else if(num<=600)cout<<"Rs."<<num*.8+200;
  else cout<<"Rs."<<num*1.25+425;
}