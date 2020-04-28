#include<iostream>
using namespace std;
int main()
{
  int num=0,r=3;
  float score=0;
  while(r>0&&num>=0){
    cin>>num;
    if(num>0&&num%2==1) {
      r--;
      score++;
    }
    else if(num>0&&num%2==0) score-=.5;
    else score-=1;
  }
  cout<<score;
}