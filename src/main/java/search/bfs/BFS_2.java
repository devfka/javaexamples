package search.bfs;


public class BFS_2 {

    public static void main(String[] args) {

//        int C[] = {2, 1, 1, 0, 1};
//        System.out.println(solution(3, 2, C));

        int C[] = {0, 0, 1, 1, 2};
        System.out.println(solution(2, 3, C));
    }

    public static String solution(int U, int L, int[] C) {

        StringBuilder rowU = new StringBuilder();
        StringBuilder rowL = new StringBuilder();
        int sumU = 0;
        int sumL = 0;

        for (int i = 0; i < C.length; i++) {

            if (C[i] == 2) {
                if (sumL < L) {
                    sumL++;
                    rowL.append("1");
                } else {
                    rowL.append("0");
                }
                if (sumU < U) {
                    sumU++;
                    rowU.append("1");
                } else {
                    rowU.append("0");
                }
            } else if (C[i] == 1) {
                if (sumL < L) {
                    sumL++;
                    rowL.append("1");
                    rowU.append("0");
                } else if (sumU < U) {
                    sumU++;
                    rowU.append("1");
                    rowL.append("0");
                }

            } else {
                rowU.append("0");
                rowL.append("0");
            }
        }

        if(sumL != L || sumU != U)
        {
            return "IMPOSSIBLE";
        }

        return rowU.append(",").append(rowL).toString();
    }

}


//10101,11000
//11001,10100