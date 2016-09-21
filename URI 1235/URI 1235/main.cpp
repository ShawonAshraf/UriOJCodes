#include <iostream>
#include <vector>
#include <algorithm>
#include <string>
#include <sstream>
#include <numeric>

using namespace std;

int main()
{
    string in = "";
    string out = "";
    string r1 = "";
    string r2 = "";
    int n;
    
    {
        string x;
        getline(cin, x);
        istringstream s(x);
        s >> n;
    }
    
    for(int i = 0; i < n; i++)
    {
        getline(cin, in);
        int l = (int) in.length();
        
        for(int j = 0; j < l; j++)
        {
            if(j < (l / 2)) r1 += in[j];
            else r2 += in[j];
        }
        
        reverse(r1.begin(), r1.end());
        reverse(r2.begin(), r2.end());
        
        out = r1 + r2;
        cout << out << endl;
        
        r1 = "";
        r2 = "";
        out = "";
    }
    
    return 0;
}