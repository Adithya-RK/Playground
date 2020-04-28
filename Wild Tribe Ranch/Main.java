#include<iostream>
using namespace std;
int main(){
  int max,a;
  cin>>max>>a;
  if(a<max) cout<<"Yes, you can enter.";
  else if(a==max) cout<<"Yes, you can enter. Kindly use a rope.";
  else cout<<"Sorry, you can't enter";
}