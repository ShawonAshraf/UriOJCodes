#include <iostream>
#include <cstdio>

using namespace std;


class Point
{
private:
    double x_cord;
    double y_cord;
    
public:
    Point(double x, double y);
    ~Point();
    void determineCoord();
};



int main()
{
    double x, y;
    
    while (scanf("%lf %lf", &x, &y) == 2)
    {
        Point p(x, y);
        p.determineCoord();
        p.~Point();
    }

    
    return 0;
}


Point::Point(double x, double y)
{
    x_cord = x;
    y_cord = y;
}

void Point::determineCoord()
{
    if(x_cord > 0.0 && y_cord > 0.0) cout << "Q1" << endl;
    if(x_cord < 0.0 && y_cord > 0.0) cout << "Q2" << endl;
    if(x_cord < 0.0 && y_cord < 0.0) cout << "Q3" << endl;
    if(x_cord > 0.0 && y_cord < 0.0) cout << "Q4" << endl;
    if(x_cord == 0.0 && y_cord == 0.0) cout << "Origem" << endl;
    if(x_cord == 0.0 && y_cord != 0.0) cout << "Eixo Y" << endl;
    if(x_cord != 0.0 && y_cord == 0.0) cout << "Eixo X" << endl;
}

Point::~Point() { }