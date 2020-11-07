package search.bfs;

import java.util.Arrays;

public class BFS_1 {

    public static void main(String[] args) {

//        int A[] = {0, 4, -1, 0, 3};
//        int B[] = {0, -2, 5, 0, 3};
        int A[] = {2, -2, -3, 3};
        int B[] = {0, 0, 4, -4};
//        int A[] = {4, -1, 0, 3};
//        int B[] = {-2, 6, 0, 4};
        System.out.println(solution(A, B));
    }

    public static int solution(int[] A, int[] B) {

        int A_sub1[];
        int A_sub2[];
        int B_sub1[];
        int B_sub2[];
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            A_sub1 = Arrays.copyOfRange(A, 0, i);
            A_sub2 = Arrays.copyOfRange(A, i, A.length);
            B_sub1 = Arrays.copyOfRange(B, 0, i);
            B_sub2 = Arrays.copyOfRange(A, i, B.length);

            if (A_sub2.length > 0 && B_sub2.length > 0 && A_sub1.length > 0 && B_sub1.length > 0 && findSum(A_sub1) == findSum(A_sub2) && findSum(B_sub1) == findSum(B_sub2)) {
                result++;
            }
        }

        return result;
    }

    static int findSum(int[] array) {
        return Arrays.stream(array).sum();
    }

}
