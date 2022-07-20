## 큐(No.10845)

<br>

<img src="img/img55.png">

<br>

<img src="img/img56.png">

<br>

Collections.Queue를 이용한 풀이   

<br>

```Java
import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int last = 0;

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String operator = st.nextToken();

            switch (operator) {
                case "push":
                    last = Integer.parseInt(st.nextToken());
                    queue.offer(last);
                    break;

                case "pop":
                    if (queue.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(queue.poll()).append('\n');
                    break;

                case "size":
                    sb.append(queue.size()).append('\n');
                    break;

                case "empty":
                    if (queue.isEmpty()) sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                    break;

                case "front":
                    if (queue.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(queue.peek()).append('\n');
                    break;

                case "back":
                    if (queue.isEmpty()) sb.append(-1).append('\n');
                    else sb.append(last).append('\n');
                    break;
            }
        }

        System.out.println(sb);
    }
}
```