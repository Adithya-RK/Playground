#include<iostream>
using namespace std;
int main()
{
  int arr[7],sum=0,extra=0;
  for(int i=0;i<7;i++) cin>>arr[i];
  for(int i=0;i<7;i++){
    sum+=arr[i]*100;
    if(arr[i]>8) extra+=15*(arr[i]-8);
  }
  extra+=arr[0]*100*.5;
  extra+=arr[6]*100*.25;
  cout<<sum+extra;
}