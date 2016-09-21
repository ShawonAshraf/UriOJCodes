// URI 1133.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

#include <iostream>
#include <utility>
#include <numeric>
#include <vector>

using namespace std;

int main()
{
	int x, y;

	cin >> x >> y;
	if (x > y) swap(x, y);

	for (int i = x + 1; i < y; i++)
	{
		if (i % 5 == 2 || i % 5 == 3) cout << i << endl;
	}

	//_gettche();

	return 0;
}