#include <iostream>
#include <iomanip>

using namespace std;

double sum(double n);

int main()
{
    double n, s;
    
    n = 100.0;
    s = sum(n);
    
    cout << fixed << setprecision(2) << s << endl;
    
    return 0;
}

double sum(double n)
{
    if(n == 1) return 1;
    else return ((1 / n) + sum(n - 1));
}