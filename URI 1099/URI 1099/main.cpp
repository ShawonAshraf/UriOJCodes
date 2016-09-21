#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    int n;
    int x, y;
    int s;
    
    
    cin >> n;
    
    for(int i = 0; i < n; i++)
    {
        cin >> x >> y;
        if(x > y) swap(x, y);
        
        s = 0;
        for(int k = x + 1; k < y; k++)
        {
            if(k % 2 == 1) s += k;
        }
        
        cout << s << endl;
    }
    
    
    return 0;
}