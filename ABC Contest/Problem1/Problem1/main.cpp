#include <cstdio>
#include <iostream>
#include <utility>

using namespace std;

int main()
{
    int a, b, i;
    
    scanf("%d %d", &a, &b);
    
    if(a > b) swap(a, b);
    if (a == b) printf("%d\n", a);
    else {
        
        for(i = a; i <= b; i++) {
            
            printf("%d ", i);
            
        }
        printf("\n");
        
    }
    
    return 0;
}