#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <cstdio>
#include <cctype>
#include <map>
#include <utility>

#define MAX_RANGE 26

using namespace std;

bool isAlphabet( char c );
int mapRot13( char c );

map<char, int> dataMap;
map<int, char> charMap;

int main()
{
    int i = 1;
    for(char c = 'a'; c <= 'z'; c++, i++)
    {
        dataMap.insert(pair<char, int>(c, i));
        charMap.insert(pair<int, char>(i, c));
    }
    
    string data, mapped;
    
    getline( cin, data );
    int len = static_cast<int>( data.length() );
    
    for( int i = 0; i < len; i++ )
    {
        char c = data.at( i );
        if(!isAlphabet(c)) mapped.push_back(c);
        else
        {
            char tmp;
            if(isupper(c))
            {
                tmp = tolower(c);
                char x = mapRot13(tmp);
                mapped.push_back(toupper(x));
            }
            else
            {
                tmp = c;
                char x = mapRot13(tmp);
                mapped.push_back(x);
            }
        }
    }
    
    cout << mapped << endl;

    return 0;
}

bool isAlphabet( char c )
{
    bool retVal = false;
    
    bool a = ( c >= 'a' && c <= 'z' );
    bool b = ( c >= 'A' && c <= 'Z' );
    
    if( a || b ) retVal = true;
    
    return retVal;
}

int mapRot13( char c )
{
    char retVal = c;
    int tmp;
    map<char, int>::iterator i;
    
    i = dataMap.find(c);
    int r = i->second;
    
    if(r + 13 > MAX_RANGE)
    {
        tmp = r - 13;
        retVal = charMap.find(tmp)->second;
    }
    else
    {
        tmp = r + 13;
        retVal = charMap.find(tmp)->second;
    }
    
    return retVal;
}