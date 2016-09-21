#include <iostream>
#include <iomanip>

using namespace std;


int main()
{
    int rabbitCount = 0, frogCount = 0, ratCount = 0, total;
    
    double per_rabbit, per_frog, per_rat;
    
    int n, t;
    char c;
    
    cin >> t;
    
    for(int i = 0; i < t; i++)
    {
        cin >> n >> c;
        
        if(c == 'C') rabbitCount += n;
        if(c == 'R') ratCount += n;
        if(c == 'S') frogCount += n;
        
    }
    
    total = rabbitCount + frogCount + ratCount;
    
    
    per_rabbit = ((double) rabbitCount / (double) total) * 100.0;
    per_frog = ((double) frogCount / (double) total) * 100.0;
    per_rat = ((double) ratCount / (double) total) * 100.0;
    
    
    
    cout << "Total: " << total << " cobaias" << endl;
    cout << "Total de coelhos: " << rabbitCount << endl;
    cout << "Total de ratos: " << ratCount << endl;
    cout << "Total de sapos: " << frogCount << endl;
    
    cout << "Percentual de coelhos: " << fixed << setprecision(2) << per_rabbit << " %" << endl;
    cout << "Percentual de ratos: " << fixed << setprecision(2) << per_rat << " %" << endl;
    cout << "Percentual de sapos: " << fixed << setprecision(2) << per_frog << " %" << endl;

    
    return 0;
}