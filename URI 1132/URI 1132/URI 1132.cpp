// URI 1132.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

#include <iostream>
#include <vector> 
#include <iomanip>
#include <utility>
#include <numeric>

using namespace std;

int main()
{
	vector<int> v(0, 0);
	int sum, x, y;


	while (cin >> x >> y)
	{
		if (x > y) swap(x, y);
		for (int i = x; i <= y; i++)
		{
			if (i % 13) v.push_back(i);
		}

		sum = accumulate(v.begin(), v.end(), 0);
		cout << sum << endl;
	}

	return 0;
}