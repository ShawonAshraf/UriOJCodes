#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    vector<int> v(3, 0);
    vector<int>::iterator i;
    
    cin >> v.at(0) >> v.at(1) >> v.at(2);
    
    i = max_element(v.begin(), v.end());
    
    cout << *i << " eh o maior" << endl;
    
    return 0;
}
