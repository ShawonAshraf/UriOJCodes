#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector < double > v(6, 0);
    int c = 0;

    for(int i = 0; i < 6; i++)
    {
        cin >> v.at(i);
        if(v.at(i) > 0.0) c++;
    }

    cout << c << " valores positivos" << endl;

    return 0;
}
