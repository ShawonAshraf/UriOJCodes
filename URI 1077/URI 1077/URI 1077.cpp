// URI 1077.cpp : Defines the entry point for the console application.
//
#include "stdafx.h"

#include <iostream>
#include <algorithm>
#include <string>
#include <iterator>
#include <stack>
#include <cctype>
#include <map>

using namespace std;


int main() {

	int n;
	cin >> n;

	string temp;
	getline(cin, temp); // consumes the new line

	map<char, int> prec;

	prec['*'] = prec['^'] = prec['/'] = 3;
	prec['+'] = prec['-'] = 2;
	prec['('] = 1;

	for (int i = 0; i < n; i++) {
		string x;
		string postfix;
		stack<char> s;
		int l;

		getline(cin, x);
		l = static_cast<int>(x.size());

		for (int k = 0; k < l; k++) {
			char c = x.at(k);
			
			if (isalnum(c)) s.push(c);
			else if (c == '(') s.push(c);
			else if (c == ')') {
				char top = s.top();
				while (top != '(') {
					postfix.push_back(top);
					s.pop();
					top = s.top();
				}
			}
			else {
				char top = s.top();
				while (!s.empty() && ((prec.find(top)->second) >= (prec.find(c)->second))) {
					postfix.push_back(top);
					s.pop();
					top = s.top();
				}
				s.push(c);
			}
		}

		while (!s.empty()) {
			char op = s.top();
			postfix.push_back(op);
			s.pop();
		}

		cout << postfix << endl;
	}

	_gettche();
    return 0;
}
