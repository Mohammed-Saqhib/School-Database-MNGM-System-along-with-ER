#include <stdio.h>

int main() {
    int a, b, c, max, min;
    
    printf("Enter three numbers: ");
    scanf("%d %d %d", &a, &b, &c);

    // Find max and min using nested if-else
    if (a >= b) {
        max = (a >= c) ? a : c;
        min = (b <= c) ? b : c;
    } else {
        max = (b >= c) ? b : c;
        min = (a <= c) ? a : c;
    }
    
    printf("Maximum: %d\nMinimum: %d\n", max, min);
    
    return 0;
}
