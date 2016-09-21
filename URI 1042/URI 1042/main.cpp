#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main()
{
    int a, b, c;
    vector<int> v;
    
    cin >> a >> b >> c;
    
    v.push_back(a);
    v.push_back(b);
    v.push_back(c);
    
    sort(v.begin(), v.end());
    
    for(int i = 0; i < 3; i++) cout << v.at(i) << endl;
    cout << endl;
    
    cout << a << endl;
    cout << b << endl;
    cout << c << endl;
    
    return 0;
}