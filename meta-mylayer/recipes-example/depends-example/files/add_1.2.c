#include <stdio.h>

extern int add(int a , int b);

int main()
{
    int num1 = 20, num2 = 25, num3 = 7;
    printf("Addition result: %d\n", add(add(num1, num2), num3));
    return 0;
}