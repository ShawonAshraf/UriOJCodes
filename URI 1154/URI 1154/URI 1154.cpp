// URI 1154.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

#include <iostream>
#include <vector>
#include <numeric>
#include <iomanip>

using namespace std;

int main()
{
	vector<int> v(0, 0);
	int n;
	double s, avg;

	while (cin >> n)
	{
		if (n < 0) break;
		else v.push_back(n);
	}

	s = accumulate(v.begin(), v.end(), 0.0);
	avg = s / (v.size());
	cout << fixed << setprecision(2) << avg << endl;
	v.clear();

	return 0;
}