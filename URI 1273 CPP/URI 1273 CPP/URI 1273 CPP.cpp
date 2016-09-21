// URI 1273 CPP.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

#include <iostream>
#include <string>
#include <iomanip>
#include <algorithm>
#include <iterator>
#include <vector>

using namespace std;

string trim(string& str);

int main()
{
	int n;

	while (cin >> n)
	{
		if (!n) break;
		string s;
		getline(cin, s); // consumes the newline from console
		vector<string> v;
		int pad = 0;

		for (int i = 0; i < n; i++)
		{
			string x;
			trim(x);
			getline(cin, x);
			v.push_back(x);

			if (x.size() > pad) pad = x.size();
		}

		cout << endl;
		for (int i = 0; i < n; i++)
		{
			cout << setw(pad) << v.at(i) << endl;
		}
	}

    return 0;
}


string trim(string& str)
{
	if (str == "") return str;
	size_t first = str.find_first_not_of(' ');
	size_t last = str.find_last_not_of(' ');
	return str.substr(first, (last - first + 1));
}


