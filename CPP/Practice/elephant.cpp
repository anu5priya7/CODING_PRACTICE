#include<iostream>
using namespace std;
int main()
{
    int temp1;
    cin>>temp1;
    if(temp1<=5)
    {
        cout<<'1';
    }
    else
    {
        if(temp1%5==0)
        {
            int a=temp1/5;
            cout<<a;
        }
        else
        {
            int a=temp1/5;
            cout<<a+1;
        }
    }
    
}