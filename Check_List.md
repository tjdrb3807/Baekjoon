* ## 약수(No.1037)
 
    <img src=img/img01.png width=800, height=250>   
    <img src=img/img02.png width=800, height=450>   

    ```Java
    import java.util.*;
    import java.io.*;

    public class Main {
        public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int count = Integer.parseInt(br.readLine());

            int max = Integer.MAX_VALUE;
            int min = Integer.MIN_VALUE;

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            while (count-- > 0) {
                max = N < max ? N : max;
                min = N > min ? N : min;
            }

            System.out.println(max * min);
        }
    }
    ```
---
