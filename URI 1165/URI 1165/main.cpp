#include <iostream>
#include <cmath>

using namespace std;

bool isPrime(int n);

int main() {
    int n, testCase;
    bool prime;
    
    cin >> testCase;
    
    for(int i = 0; i < testCase; i++) {
        cin >> n;
        
        prime = isPrime(n);
        
        cout << n;
        prime ? cout << " eh primo" << endl : cout << " nao eh primo" << endl;
    }
    
    return 0;
}

bool isPrime(int n) {
    if(n < 2) return false;
    else if(n == 2) return true;
    else if(n != 2 && n % 2 == 0) return false;
    else {
        for(int i = 3; i < (n/2); i++) {
            if(n % i == 0) return false;
        }
    }
    
    return true;
}