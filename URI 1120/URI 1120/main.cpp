#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

int main()
{
    
    int n;
    string s;
    vector<int> v;
    
    while(cin >> n >> s)
    {
        if(!n) break; // if n = 0, break
        
        int l = s.length();
        
        for(int i = 0; i < l; i++)
        {
            int x = s.at(i) - '0'; // coverting char to int
            if(x != n) v.push_back(x);
        }
        
        if(v.empty()) cout << "0" << endl; // if the vector is empty then
        // print 0
        
        else if(!v.at(0)) cout << "0" << endl;
        
        // else print the contents of the vector
        
        else
        {
            l = v.size();
            for (int i = 0; i < l; i++)
            {
                cout << v.at(i);
            }
            cout << endl;
        }
        
        s.clear();
        v.clear();

    }
    
    return 0;
}