package programmers.level3;

public class Num12979 {
    public static void main(String[] args) {
        Num12979 aa = new Num12979();
        System.out.println(aa.solution(16, new int[]{9}, 2));
    }
    public int build(int begin, int end, int con) {
        int area = end - begin + 1;
        int result = area / con;
        if (area % con != 0) {
            result++;
        }
        return result;
    }
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int begin = 1;
        int con = w * 2 + 1;

        for (int i = 0; i < stations.length; i++) {
            if (begin < stations[i] - w) {
                answer += build(begin, stations[i] - w - 1, con);
            }
            begin = stations[i] + w + 1;
        }
        if (stations[stations.length - 1] + w < n) {
            answer += build(stations[stations.length - 1] + w + 1, n, con);
        }
        return answer;
    }


}
