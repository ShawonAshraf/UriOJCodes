#include <iostream>
#include <algorithm>

using namespace std;

int main()
{
    int a, b;
    
    while(cin >> a >> b)
    {
        if(a == b) cout << "O JOGO DUROU 24 HORA(S)" << endl;
        else
        {
            int r = b - a;
            
            if(r < 0)
            {
                r = 24 + b - a;
            }
            
            cout << "O JOGO DUROU " << r << " HORA(S)" << endl;
        }
    }
    
    return 0;
}