	#include <stdio.h>

    int main()
    {
        int num1;
        int num2;
        int gcd;
        int lcm;
        int remainder;
        int numerator;
        int denominator;

        printf("Enter two numbers");
        scanf("%d %d", &num1, &num2);
        if (num1 > num2)
        {
            numerator = num1;
            denominator = num2;
        }
        else
        {
            numerator = num2;
            denominator = num1;
        }
        remainder = numerator % denominator;
        while (remainder != 0)
        {
            numerator   = denominator;
            denominator = remainder;
            remainder   = numerator % denominator;
        }
        gcd = denominator;
        lcm = num1 * num2;
        lcm = lcm / gcd;
        printf("Greatest common divisor of %d and %d is %d", num1, num2, gcd);
        printf("Least common multiple of %d and %d is %d", num1, num2, lcm);
    }