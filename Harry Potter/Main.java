#include <iostream>
#include<string.h>
using namespace std;
int main() {
	//code
	
	char arr[100];
	gets(arr);
	for(int i =0; i<strlen(arr);i++);
	cout<<("%d", (arr[0]-48) + (arr[strlen(arr)-1] -48));
	return 0;
}