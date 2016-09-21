// URI 1113.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

#include <iostream>

using namespace std;

int main()
{
	int x, y;

	while (cin >> x >> y)
	{
		if (x == y) break;
		else
		{
			if (x > y) cout << "Decrescente" << endl;
			else cout << "Crescente" << endl;
		}
	}

	return 0;
}
