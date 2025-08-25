#include <stdio.h>

extern int add(int a , int b);

int main()
{
    int num1 = 20, num2 = 25;
    printf("Addition result: %d\n", add(num1, num2));
    return 0;
}