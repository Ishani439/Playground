#include<stdio.h>
int isprime(int n)
{
	//Your code goes here
  	    int flag=0,i;
    for(i=2;i<=n/2;i++)
    {
        if(n%i==0)
        {
            flag=1;
            break;
        }
    }
    if(flag==1)
        return 0;
    else
        return 1;
}
void print(int a, int b)
{
    int i;
    for(i=a;i<=b;i++)
    {
        if(isprime(i)==1)
            printf("%d ",i);
    }
}
int main()
{
    int a,b;
    scanf("%d %d",&a,&b);
    print(a,b);
    return 0;
}
