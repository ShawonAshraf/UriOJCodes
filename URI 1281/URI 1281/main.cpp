#include <iostream>
#include <string>
#include <iomanip>

using namespace std;

int main() {
    int testCase, n;
    string in;
    string delimiter = " ";
    
    cin >> testCase;
    for (int i = 0; i < testCase; i++) {
        cin >> n;
        string x; getline(cin, x);
        double sum = 0;
        for (int j = 0; j < n; j++) {
            // getline(cin, in);
            getline(cin, in);
            
            size_t pos = 0;
            pos = in.find(delimiter);
            in.erase(0, pos + delimiter.length());
            
            double price = stod(in);
            sum += price;
        }
        
        cout << "R$ " << setprecision(2) << sum << endl;
    }
    
    return 0;
}
