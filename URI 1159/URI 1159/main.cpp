#include <iostream>
#include <vector>
#include <numeric>

#define ITERATION_NO 5

using namespace std;

int main(){
    int n;
    vector<int> v(0, 0);
    
    while(cin >> n){
        if(!n) break;
        
        int counter = 0;
        
        for(int i = n; ; i++){
            if(i % 2 == 0){
                counter++;
                
                if(counter > ITERATION_NO) break;
                else v.push_back(i);
            }
        }
        
        try{
            int s = accumulate(v.begin(), v.end(), 0);
            cout << s << endl;
        }
        catch(exception e) { /* nothing here */ }
        
        v.clear();
    }
    
    return 0;
}