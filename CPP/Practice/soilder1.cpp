#include<iostream>
using namespace std;
int main()
{
    long long int temp1,temp2,temp3;
    cin>>temp1>>temp2>>temp3;
    long long int temp=0;
    for(int i=1;i<=temp3;i++)
    {
        long long int a=temp1*i;
        temp=temp+a;
    }
    if(temp2>=temp)
    {
        cout<<'0';
    }
    else
    {
        cout<<temp-temp2;
    }
    
}