#include <iostream>
#include <vector>
#include <numeric>

using namespace std;

int main()
{
    vector<double> v(0, 0);
    double n;
    int c;
    double sum;
    double avg;
    
    for(int i = 0; i < 6; i++)
    {
        cin >> n;
        if(n > 0.0) v.push_back(n);
    }
    
    c = (int) v.size();
    
    sum = accumulate(v.begin(), v.end(), 0.0);
    avg = sum / (double) c;
    
    cout << c << " valores positivos" << endl;
    cout << avg << endl;
    
    
    return 0;
    
}