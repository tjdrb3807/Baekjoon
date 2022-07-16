## 1, 2, 3 더하기(No.9095)

<br>

<img src="img/img31.png">

<br>

<img src="img/img32.png">

<br>

하나의 자연수를 1, 2, 3 으로만 조합하여 더해서 해당 자영수가 나오는 경우의 수를 구하는 문제이다.   

그렇다면 먼저 1, 2, 3의 경우의 수를 찾아 봐야 한다.  

d[0] = 0   
d[1] = 1밖에 없으니 경우의 수는 1   
d[2] = (1 + 1), (2) 즉, 경우의 수는 2   
d[3] = (1 + 1 + 1), (1 + 2), (2 + 1), (3) 즉 경우의 수는 3     

이렇게 되어 있을 때 d[4] = (1 + 1 + 1 + 1), (1 + 1 + 2), (1 + 2 + 1), (2 + 1 + 1), (2 + 2), (1 + 3), (3 + 1) 으로 7개가 된다.   

이것을 DP를 풀어야 한다.   

`DP의 가장 큰 특징은 문제를 작은 문제로 쪼갤 수 있어야 한다.`

그리고 작은 문제보다 더 작은 문제로부터 탑을 알고있어야 한다.   

말로 풀면 굉장히 어렵지만, 지금 알고 있는 경우의 수는 0과 1, 2, 그리고 3뿐이다. 이를 이용해서 문제를 쭉 풀어야 한다.   

d[4]를 생각할 떄   

    1. 4는 1 + 3 이다. 3을 1, 2, 3 더하기로 하였을 때의 경우의 수는 4가지 이다.      
    2. 4는 2 + 2 이다. 2를 1, 2, 3 더하기로 하였을 때의 경우의 수는 2가지 이다.   
    3. 4는 3 + 1 이다. 3을 1, 2, 3 더하기로 하였을 때의 경우의 수는 1가지 이다.   

즉, 4 + 2 + 1을 하면 7가지가 된다.   

이렇게 d[5]를 마저 생각하게 되면   
    
    1. 5는 1 + 4 이다. 4를 1, 2, 3 더하기로 하였을 때의 경우의 수는 7가지 이다.   
    2. 5는 2 + 3 이다. 3을 1, 2, 3 더하기로 하였을 때의 경우의 수는 4가지 이다.   
    3. 5는 3 + 2 이다. 2를 1, 2, 3 더하기로 하였을 때의 경우의 수는 2가지 이다.

즉, 7 + 4 + 2 를 하면 d[5]는 13개가 된다.   

이렇게 작은 문제로부터 구해진 문제를 자료구조에 저장을 해야하는데 이것을 `Memorization`라고 부른다.   

```Java
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[11];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        int n = 0;

        for (int i = 0; i < T; i++) {
            n = Integer.parseInt(br.readLine());

            for (int j = 4; j <= n; j++) {
                arr[j] = arr[j - 1] + arr[j - 2] + arr[j - 3];
                sb.append(arr[j]).append('\n');
            }
        }

        System.out.println(sb);
    }
}
```