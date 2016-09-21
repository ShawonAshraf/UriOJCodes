#include <iostream>

using namespace std;



bool isPerfect(int n);


int main() {
    
    int t, n;
    
    cin >> t;
    
    for(int i = 0; i < t; i++) {
        
        cin >> n;
        
        if(isPerfect(n)) cout << n << " eh perfeito" << endl;
        else cout << n << " nao eh perfeito" << endl;
        
    }
    
    return 0;
    
}

bool isPerfect(int n) {
    
    int sum = 0;
    bool perfect = false;
    
    for(int i = 1; i < n; i++) {
        
        if( !(n % i) ) sum += i;
        
    }
    
    if(sum == n) perfect = true;
    
    return perfect;
    
}