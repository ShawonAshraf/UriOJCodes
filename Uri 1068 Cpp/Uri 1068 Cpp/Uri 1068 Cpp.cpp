// Uri 1068 Cpp.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

#include <iostream>
#include <algorithm>
#include <stack>
#include <iterator>
#include <string>

using namespace std;

int main()
{
	string expression;

	while (getline(cin, expression))
	{
		int len = expression.size();
		bool flag = false;
		stack<char> paran_stack;

		for (int i = 0; i < len; i++)
		{
			if (expression[i] == '(') paran_stack.push('(');
			else if (expression[i] == ')' && !paran_stack.empty()) paran_stack.pop();
			else if (expression[i] == ')' && paran_stack.empty()) paran_stack.push('e');
		}

		flag = paran_stack.empty();
		flag ? cout << "correct" << endl : cout << "incorrect" << endl;
		
	}

    return 0;
}

