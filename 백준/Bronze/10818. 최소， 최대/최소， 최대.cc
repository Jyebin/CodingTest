#include <stdio.h>
int main()
{
    int i = 0;
    scanf("%d\n",&i);
    int arr[i];
    
    for(int j=0;j<i;j++){
        scanf("%d",&arr[j]);
    }
    
    int min = arr[0];
    int max = arr[0];
    
    for(int a=0;a<i;a++){
        if(min>arr[a]){
            min = arr[a];
        }
        if(max<arr[a]){
            max = arr[a];
        }
    }
    printf("%d %d",min,max);
    
    return 0;
}