#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int chalk,days;
  cin>>chalk;
  days=chalk;
  float rem=chalk;
    days=chalk+rem*(1/pow(rem,.5));
  cout<<days+1;
}