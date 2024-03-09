#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int left, int right) {
    int answer = 0;
    for(int start = left; start < right+1; start++){
        int num = 0;
        for(int i = 1; i <start + 1; i++){
            if(start %i == 0){
                num++;
            }
        }
        if(num % 2 == 0){
            answer += start;
        }
        else{
            answer -= start;
        }
        }
    return answer;
}