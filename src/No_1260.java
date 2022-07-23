import java.io.*;
import java.util.*;

public class No_1260 {

    static int vertex;
    static int edge;
    static int startVertex;
    static List<Integer>[] graph;
    static boolean[] visited;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        vertex = Integer.parseInt(st.nextToken());
        edge = Integer.parseInt(st.nextToken());
        startVertex = Integer.parseInt(st.nextToken());

        graph = new ArrayList[vertex + 1];
        visited = new boolean[vertex + 1];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        while (edge-- > 0) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        for (int i = 0; i < graph.length; i++) {
            Collections.sort(graph[i]);
        }

        DFS(startVertex);
        sb.append('\n');
        visited = new boolean[vertex + 1];
        BFS(startVertex);

        System.out.println(sb);
    }

    static void DFS(int startVertex) {
        visited[startVertex] = true;
        sb.append(startVertex).append(' ');
        for (int i : graph[startVertex]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

    static void BFS(int startVertex) {
        visited[startVertex] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int nextVertex = queue.poll();
            sb.append(nextVertex).append(' ');
            for (int i : graph[nextVertex]) {
                if (!visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
