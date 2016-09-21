// URI 1114.cpp : Defines the entry point for the console application.
//

#include "stdafx.h"

#include <iostream>

using namespace std;

int main()
{
	int n;
	const int correctPass = 2002;

	while (cin >> n)
	{
		if (n == correctPass)
		{
			cout << "Acesso Permitido" << endl;
			break;
		}
		else cout << "Senha Invalida" << endl;
	}

	return 0;
}

