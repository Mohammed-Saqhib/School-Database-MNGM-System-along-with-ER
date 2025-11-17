#include <stdio.h>

int main() {
    int num, range;
    printf("Enter number and range: ");
    scanf("%d %d", &num, &range);

    for (int i = 1; i <= range; i++)
        printf("%d x %d = %d\n", num, i, num * i);

    return 0;
}
