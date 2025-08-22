#include <stdio.h>

extern int add(int a , int b);
extern int substract(int a , int b);

int main()
{
    int num1 = 1, num2 = 2;
    printf("Addition result: %d\n", add(num1, num2));
    printf("Substraction result: %d\n", substract(num1, num2));
    return 0;
}