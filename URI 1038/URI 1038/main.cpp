#include <iostream>
#include <cstdio>

using namespace std;

int main()
{
    int x, y;
    float sum = 0;
    
    cin >> x >> y;
    
    switch (x)
    {
        case 1:
            sum = 4 * y;
            break;
            
        case 2:
            sum = 4.5 * y;
            break;
            
        case 3:
            sum = 5 * y;
            break;
            
        case 4:
            sum = 2 * y;
            break;
            
        case 5:
            sum = 1.5 * y;
            break;
            
        default:
            break;
    }
    
    
    printf("Total: R$ %0.2f\n", sum);
    
    return 0;
    
}