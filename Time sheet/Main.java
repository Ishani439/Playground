#include<iostream>
using namespace std;
int main()
{
	int sun,mon,tue,wed,thur,fri,sat,sal,t;
	cin>>sun>>mon>>tue>>wed>>thur>>fri>>sat;
	t=mon+tue+wed+thur+fri;
	sun=(sun*100)+((sun*100)*0.5);
	sat=(sat*100)+((sat*100)*0.25);
	if(mon<=8)
	mon=mon*100;
	else
	mon=(mon*100)+((mon-8)*15);
		if(tue<=8)
	tue=tue*100;
	else
	tue=(tue*100)+((tue-8)*15);
		if(wed<=8)
	wed=wed*100;
	else
	wed=(wed*100)+((wed-8)*15);
		if(thur<=8)
	thur=thur*100;
	else
	thur=(thur*100)+((thur-8)*15);
		if(fri<=8)
	fri=fri*100;
	else
	fri=(fri*100)+((fri-8)*15);
	sal=sun+mon+tue+wed+thur+fri+sat;
	if(t<=40)
		cout<<(sal);
	else{
	    sal=sal+(25*(t-40));
	    cout<<(sal);
	}
	return 0;
}