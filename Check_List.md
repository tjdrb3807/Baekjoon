* ## 약수(No.1037)
 
    <img src=img/img01.png>   
    <img src=img/img02.png>   

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


* ## 최대공약수와 최소공배수(No.2609)
 
    <img src=img/img03.png>   
    <img src=img/img04.png>  

    ```Java
    import java.util.*;
    import java.io.*;

    public class Main {
        public static void main(String[] arsg) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            StringBuilder sb = new StringBuilder();
            sb.append(getGCD(x, y));
            sb.append("\n");
            sb.append(getLCM(x, y));

            System.out.println(sb);
        }

        static int getGCD(int x, int y) {
            if (x % y == 0) {
                return y;
            } else {
                return getGCD(y, x % y);
            }
        }

        static int getLCM(int x, int y) {
            return (x * y) / getGCD(x, y);
        }
    }
    ```