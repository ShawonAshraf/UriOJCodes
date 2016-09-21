// URI 1068.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

// program starts here

#include <iostream>
#include <stack>
#include <algorithm>
#include <string>

#include <fstream>

using namespace std;

void emptyStack(stack<char>& s);

int main()
{
	ifstream read("input.txt");

	string str = "";
	int l;
	bool correct = false;

	while (getline(read, str))
	{
		stack<char> paranStack;
		l = str.size();
		for (int i = 0; i < l; i++) 
		{
			char c = str.at(i);
			if (c == '(') paranStack.push(c);
			else if (c == ')' && !paranStack.empty()) paranStack.pop();
			else if (c == ')' && paranStack.empty()) correct = false;
			else continue;
		}

		//correct = paranStack.empty() ? true : false;
		correct ? cout << "correct" : cout << "incorrect";
		cout << endl;

		emptyStack(paranStack);
	}

	_gettche();
    return 0;
}

void emptyStack(stack<char>& s)
{
	while (!s.empty()) s.pop();
}

