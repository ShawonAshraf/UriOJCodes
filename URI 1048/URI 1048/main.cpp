#include <iostream>
#include <algorithm>
#include <iomanip>

using namespace std;

class Employee
{
    
private:
    
    float salary;
    float increment;
    float percentage;
    
    float getPercentage();
    float getTotal();
    float getIncrement();
    
    
public:
    
    Employee(float salary);
    void displayOutput();
    
};


Employee::Employee(float salary)
{
    this->salary = salary;
}


float Employee::getPercentage()
{
    if(salary >= 0.0 && salary <= 400.0) percentage = .15;
    if(salary >= 400.01 && salary <= 800.0) percentage = .12;
    if(salary >= 800.01 && salary <= 1200.0) percentage = .10;
    if(salary >= 1200.01 && salary <= 2000.0) percentage = .07;
    if(salary > 2000.0) percentage = .04;
    
    
    return percentage;
}

float Employee::getIncrement()
{
    increment = salary * getPercentage();
    return increment;
}


float Employee::getTotal()
{
    float total;
    
    total = salary + getIncrement();
    
    return total;
}

void Employee::displayOutput()
{
    
    
    cout << "Novo salario: " << setprecision(2) << fixed << getTotal() << endl;
    cout << "Reajuste ganho: " << setprecision(2) << fixed << getIncrement() << endl;
    cout << "Em percentual: " << setprecision(0) << ( getPercentage() * 100 ) << " %" << endl;
}


int main()
{
    
    float salary;
    
    cin >> salary;
    
    Employee e(salary);
    e.displayOutput();
    
    return 0;
}