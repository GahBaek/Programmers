#include <iostream>
#include <cstring>
#include <vector>
using namespace std;

string solution(string s) {
    string answer = "";
	if (strlen(s.c_str()) % 2 == 0) {
		answer += s[strlen(s.c_str()) / 2-1];
		answer += s[(strlen(s.c_str()) / 2)];
	}
	else {
		answer += s[strlen(s.c_str()) / 2];
	}
	return answer;
}
