#include <iostream>
#include <cmath>
#include <iomanip>
#include <cstdio>

#define PI 3.14159

using namespace std;



void triangle(double x, double y);
void circle(double r);
void trapizium(double a, double b, double c);
void sq(double x);
void rec(double a, double b);



int main() {
    
    double a, b, c;
    
    cin >> a >> b >> c;
    
    triangle(a, c);
    circle(c);
    trapizium(a, b, c);
    sq(b);
    rec(a, b);
    
    return 0;
}


void triangle(double x, double y) {
    double a = 0.5 * x * y;

    printf("TRIANGULO: %0.3lf\n", a);
}


void circle(double r) {
    double a = PI * pow(r, 2);
    
    printf("CIRCULO: %0.3lf\n", a);

}


void trapizium(double a, double b, double c) {
    double x = 0.5 * (a + b) * c;
    
    printf("TRAPEZIO: %0.3lf\n", x);
}

void sq(double x) {
    double a = pow(x, 2);
    
    printf("QUADRADO: %0.3lf\n", a);
}

void rec(double a, double b) {
    double x = a * b;
    
    printf("RETANGULO: %0.3lf\n", x);
}