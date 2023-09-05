public class Test0202 {
    public static void main(String[] args) {
        double[] input = {0.90625, 19.6875};
        String[] output = {"0.11101", "10011.1011"};

        System.out.printf("Out of %d Cases, %1.0f were correct", input.length, test(input, output));
    }

    public static double test(double[] input, String[] output) {
        double score = 0;

        for (int i = 0; i < input.length; i++) {
            System.out.printf("Case %d %n", i);

            String correct = output[i];
            System.out.printf("Input : %f \t -> Expected : %s %n", input[i], output[i]);

            String str = solution(input[i]);
            System.out.printf("Your Answer : %s %n", str);

            if (str.equals(correct)) {
                score++;
            }
        }

        return score;
    }

    /*
     * 소수부분을 2진수로 만드는 방법
     * 명시적 형변환
     */

    private static String solution(double d) {

        // 정수와 소수 부분 나누기
        int jung = (int)Math.floor(d / 1.0);
        double so = d % 1.0;

        // 정수 2진수 구하기
        String str1 = "";
        do {
            str1 = (jung % 2) + str1;
            jung = jung/2;
        } while (jung > 0);
        
        // 소수 2진수 구하기
        String str2 = "";
        do{
            so = so*2;          // 곱하기 2
            str2+=(int)so/1;    // 정수 따로 빼기
            so = so%1.0;        //소수만 남기기
        }while(so!=0);


        return str1+"."+str2;
    }
}
