//
// Created by Su Min on 9/16/15.
//
/*
ID: nimus011
PROG: test
LANG: C++                  (<-- or C++11 if you prefer)
*/

#include "Submitting_Solutions.h"
#include <iostream>
#include <fstream>
#include <string>

using namespace std;

int main() {
    ofstream fout ("test.out");
    ifstream fin ("test.in");
    int a, b;
    fin >> a >> b;
    fout << a+b << endl;
    return 0;
}
