#include <iostream>

using namespace std;

bool isOdd(int n);

int main(){
    int n, x, y, s;
    
    cin >> n;
    
    for(int i = 0; i < n; i++){
        cin >> x >> y;
        s = 0;
        int oddCount = 0;
        
        for(int j = x; ; j++){
            if(isOdd(j)){
                oddCount++;
                
                if(oddCount > y) break;
                else s += j;
            }
        }
        
        cout << s << endl;
    }
    
    return 0;
}


bool isOdd(int n){
    bool ret = false;
    
    if((n % 2)) ret = true;
    
    return ret;
}