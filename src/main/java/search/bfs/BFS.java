package search.bfs;

public class BFS {

    public static void main(String[] args) {

        System.out.println(calculateSum(12349));
    }

    public int solution(int N) {

        int sum = calculateSum(N);
        int result = N;
        for (int i = N + 1; i < 50000; i++) {
            if (sum == calculateSum(i)) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static int calculateSum(int num) {

        char x[] = String.valueOf(num).toCharArray();

        int count = 0;

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            count = count + Integer.parseInt(String.valueOf(x[i]));
        }

        return count;
    }


}
