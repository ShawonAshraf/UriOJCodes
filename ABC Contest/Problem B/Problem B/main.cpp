#include <iostream>
#include <cstdio>
#include <utility>
#include <cmath>

using namespace std;


int main() {
    
    int x, y;
    
    scanf("%d %d", &x, &y);
    
    for(int i = 0; i < y; i++) {
        
        int n = x * pow(10, i);
        if(i == y - 1)printf("%d", n);
        else printf("%d ", n);
        
    }
    printf("\n");
    
    return 0;
    
}