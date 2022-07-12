package 수학;

import java.io.*;
import java.util.*;

/*
* length 가 count 인 배열을 생성
* 배열에 입력받은 숫자 넣음
* 정렬시켜 최대공배수를 구한다
* */
public class No_1037 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        while (count-- > 0) {
            int N = Integer.parseInt(st.nextToken());
            max = N < max ? N : max;
            min = N > min ? N : min;
        }
        System.out.println(max * min);
    }
}
