#include<iostream>
using namespace std;
int main()
{
  int a,b,c,sec,third,cod,i;
  cin>>a>>b>>c;
  if(a>b&&a>c) {
    if(b>c) { sec=b; third=c;}
    else { sec=c; third=b;}
  }
  else if(b>a&&b>c){
    if(a>c) { sec=a; third=c;}
    else { sec=c; third=a;}
  }
  else{
    if(a>b) { sec=a; third=b;}
    else { sec=b; third=a;}
  }
  cout<<"The treasure is in box which has number "<<sec<<endl;
  for(i=third;i>0;i--){
    if(a%i==0 && b%i==0 && c%i==0) break;
  }
  cout<<"The code to open the box is "<<i;
  
}