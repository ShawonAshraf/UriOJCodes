#include <iostream>
#include <cstdio>

using namespace std;

int main() {
    int x;
    float y;
    
    cin >> x >> y;
    
    float r = x / y;
    printf("%0.3lf km/l", r);
    printf("\n");
    
    return 0;
}
