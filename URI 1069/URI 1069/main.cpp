//
//  main.cpp
//  URI 1069
//
//  Created by Shawon Ashraf on 8/16/16.
//  Copyright © 2016 Shawon Ashraf. All rights reserved.
//

#include <iostream>
#include <algorithm>
#include <vector>
#include <stack>
#include <iterator>
#include <iomanip>

using namespace std;

int main() {
    int n;
    cin >> n;
    string temp;
    getline(cin, temp); // consumes the newline from console
    
    for(int i = 0; i < n; i++) {
        string x;
        stack<char> s;
        int diamonds = 0;
        
        getline(cin, x);

        int l = static_cast<int>(x.size());
        
        for(int j = 0; j < l; j++) {
            char c = x.at(j);
            
            if(c == '<') s.push(c);
            if(c == '>' && !s.empty()) {
                s.pop();
                diamonds++;
            }
        }
        
        cout << diamonds << endl;
    }
    
    return 0;
}