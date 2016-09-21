// URI 1117.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

#include <iostream>
#include <iomanip>

using namespace std;

bool isValid(float n);

int main()
{
	float x, sum = 0, median;
	int validCount = 0;

	while (cin >> x)
	{
		if (isValid(x))
		{
			validCount++;
			sum += x;
		}
		else cout << "nota invalida" << endl;

		if (validCount == 2)
		{
			median = sum / 2.0;
			cout << "media = " << fixed << setprecision(2) << median << endl;
			return 0;
		}
	}

	return 0;
}

bool isValid(float n)
{
	if (n >= 0.0 && n <= 10.0) return true;
	return false;
}