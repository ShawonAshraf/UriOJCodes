#include <iostream>
#include <vector>
#include <numeric>
#include <cmath>
#include <iomanip>

using namespace std;

int main()
{
    vector<double> v(0, 0);
    double sum;
    
    for(double i = 1; i <= 19; i++)
    {
        double x = (2.0 * i + 1.0) / pow(2.0, i);
        v.push_back(x);
    }
    
    sum = accumulate(v.begin(), v.end(), 0.0);
    cout << fixed << setprecision(2) << (sum + 1) << endl;
    
    return 0;
}