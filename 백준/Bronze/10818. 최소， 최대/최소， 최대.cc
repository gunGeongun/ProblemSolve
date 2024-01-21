#include <stdio.h>

int main(){
	int num,i;

	scanf("%d",&num);
	int a[num];
	for(i=0;i<num;i++){
		scanf("%d",&a[i]);
	}
	int max=a[0];
	int min=a[0];
	for(i=0;i<num;i++){
		if(max<a[i]){
			max = a[i];
		}
		if(min>a[i]){
			min = a[i];
		}
	}
	printf("%d ",min);
	printf("%d",max);
	
	return 0;
}