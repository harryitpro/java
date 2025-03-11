package interview;

//normal situation: use big glass first, then going to small ones
//use a set to contain the glasses/numbers which have been used, iterate from big to small to get next avaiable one. the subtraction result locate the big index of array, no need to go through every one
public class FillGlassesWithWater {
    public int solution(int N, int K) {
        if (K <= N) return 1;
        //check max capacity of N glasses, if max < K, then -1; if max == K; then return N
        int max = (N + 1) * N / 2;
        if (max < K) return -1;
        if (max == K) return N;

        int count = 0; //contain number of glasses
        int remain = K;
        int nextMax = Math.min(remain, N);
        while (nextMax > 0) {
            count++;
            remain = remain - nextMax;
            nextMax = Math.min(remain, nextMax - 1);
        }
        return count;
    }

    public static void main(String[] args) {
        FillGlassesWithWater s = new FillGlassesWithWater();
        System.out.println(s.solution(5, 13));
    }
}
