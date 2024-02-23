/*
/tmp/lePiIbVTRg.o
n=10
Fibonacci series :
0 1 1 2 3 5 8 13 21 34 
*/
// Online C compiler to run C program online
#include <stdio.h>

int main() {
    // Write C code here
    int n, a=0, b=1, temp,i;
    printf("n=");
    scanf("%d", &n);
    printf("Fibonacci series : ");
    if(n>0)
    printf("0 ");
    if(n>=1)
    printf("1 ");
    for(i=2;i<n;i++){
        temp = b;
        b = a+b;
        a = temp;
        printf("%d ", b);
    }
    return 0;
}
