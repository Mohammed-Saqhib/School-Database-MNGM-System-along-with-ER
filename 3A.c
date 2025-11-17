#include <stdio.h>

int main() {
    int start, end;
    printf("Enter two integers: ");
    scanf("%d %d", &start, &end);

    for (int i = (start % 2 == 0 ? start : start + 1); i <= end; i += 2)
        printf("%d ", i);

    return 0;
}
