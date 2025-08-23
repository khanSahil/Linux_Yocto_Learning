#include <stdio.h>

extern int substract(int a , int b);

int main()
{
    int num1 = 19, num2 = 25;
    printf("Substraction result: %d\n", substract(num1, num2));
    return 0;
}