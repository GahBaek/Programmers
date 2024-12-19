# [level 2] 피보나치 수 - 12945 

[문제 링크](https://school.programmers.co.kr/learn/courses/30/lessons/12945) 

### 성능 요약

메모리: 82.1 MB, 시간: 1.57 ms

### 구분

코딩테스트 연습 > 연습문제

### 채점결과

정확성: 100.0<br/>합계: 100.0 / 100.0

### 제출 일자

2024년 12월 19일 11:43:43

### 문제 설명

<p>피보나치 수는 F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수 입니다. </p>

<p>예를들어 </p>

<ul>
<li>F(2) = F(0) + F(1) = 0 + 1 = 1</li>
<li>F(3) = F(1) + F(2) = 1 + 1 = 2</li>
<li>F(4) = F(2) + F(3) = 1 + 2 = 3</li>
<li>F(5) = F(3) + F(4) = 2 + 3 = 5</li>
</ul>

<p>와 같이 이어집니다.</p>

<p>2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성해 주세요.</p>

<h5>제한 사항</h5>

<ul>
<li>n은 2 이상 100,000 이하인 자연수입니다.</li>
</ul>

<h5>입출력 예</h5>
<table class="table">
        <thead><tr>
<th>n</th>
<th>return</th>
</tr>
</thead>
        <tbody><tr>
<td>3</td>
<td>2</td>
</tr>
<tr>
<td>5</td>
<td>5</td>
</tr>
</tbody>
      </table>
<h5>입출력 예 설명</h5>

<p>피보나치수는 0번째부터 0, 1, 1, 2, 3, 5, ... 와 같이 이어집니다.</p>

<h5>문제가 잘 안풀린다면😢</h5>

<p>힌트가 필요한가요? [코딩테스트 연습 힌트 모음집]으로 오세요! → <a href="https://school.programmers.co.kr/learn/courses/14743?itm_content=lesson12945" target="_blank" rel="noopener">클릭</a></p>


> 출처: 프로그래머스 코딩 테스트 연습, https://school.programmers.co.kr/learn/challenges



```java
// 내 원래 답:
// 하지만, 성공률이 50% 정도 밖에 되지 않았다. 이에 생각해보니
// int 의 범위 때문에 일정 수 (100?) 이 넘어가면 이상한 값이 출력되었다.
int n = 101;
        int[] f = new int[n+1];
        f[0] = 0;
        f[1] = 1;
        for(int i = 2; i < n+1; i++){
            f[i] = f[i-1]+f[i-2];
        }
        System.out.println(f[n]%1234567);
// 수학적으로 모듈로 연산의 분배 법칙이 적용되기 때문
```
