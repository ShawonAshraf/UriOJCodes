#include <iostream>

using namespace std;

int main()
{
    int x, y;
    int sum = 0;
    
    cin >> x >> y;
    
    for(int i = x - 1; i > y; i--)
    {
        if(i % 2 == 1 || i % 2 == -1) sum += i;
    }
    
    cout << sum << endl;
    
    return 0;
}