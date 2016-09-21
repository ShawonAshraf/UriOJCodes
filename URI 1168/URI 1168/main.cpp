#include <iostream>
#include <vector>
#include <string>
#include <algorithm>
#include <numeric>

using namespace std;

int getDigit(char c);
vector<int> data(10, 0);

int main()
{
    data[0] = 6;
    data[1] = 2;
    data[2] = 5;
    data[3] = 5;
    data[4] = 4;
    data[5] = 5;
    data[6] = 6;
    data[7] = 3;
    data[8] = 7;
    data[9] = 6;
    
    
    
    vector<int> counter;
    string s;
    int n, c;
    
    cin >> n;
    
    for(int i = 0; i < n; i++)
    {
        cin >> s;
        int l = (int) s.length();
        
        for(int j = 0; j < l; j++)
        {
            int x = getDigit(s[j]);
            counter.push_back(x);
        }
        
        c = accumulate(counter.begin(), counter.end(), 0);
        cout << c << " leds" << endl;
        
        counter.clear();
    }
    
    return 0;
}


int getDigit(char c)
{
    int r = 0;
    
    int x = c - '0';
    r = data[x];
    
    return r;
}