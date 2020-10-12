#include<stdio.h>

int main()
{ 
 	static int x = 10;
	 int y = x;
   if(x == y){
     printf("Equal");
  }
  else if(x > y){
     printf("Greater");
  }
  else{
     printf("Lesser");
  }
  return 0; 
}



