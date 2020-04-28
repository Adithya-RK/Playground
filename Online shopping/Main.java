#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  int arr[9],min=99999;
  string s[3]={"Flipkart","Snapdeal","Amazon"},minstr="Filpkart";
  for(int i=0;i<9;i++) cin>>arr[i];
  for(int i=0;i<3;i++) {
    int sum = arr[i*3]-(arr[i*3]*arr[i*3+1]/100)+arr[i*3+2];
    cout<<"In "<<s[i]<<" Rs."<<sum<<endl;
    if(sum<min) {
      min=sum;
      minstr=s[i];
    }
  }
  cout<<"He will prefer "<<minstr;
}