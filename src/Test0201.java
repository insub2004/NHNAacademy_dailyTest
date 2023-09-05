public class Test0201 {
    public static void main(String[] args) {
        int[] input = {0, 3, 2, 624, 339, 13, 45232};
        String[] output = {"0", "11", "10", "1001110000", "101010011", "1101", "1011000010110000"};

        System.out.printf("Out of %d Cases, %1.0f were correct", input.length, test(input, output));
    }

    public static double test(int[] input, String[] output) {
        double score = 0;

        for (int i = 0; i < input.length; i++) {
            System.out.printf("Case %d %n", i);

            String correct = output[i];
            System.out.printf("Input : %d \t -> Expected : %s %n", input[i], output);

            String str = solution(input[i]);
            System.out.printf("Your Answer : %s %n", str);

            if (str.equals(correct)) {
                score++;
            }
        }

        return score;
    }

    // 20230904 20분 소요
    // answer += (input%2)가 아니라 answer = (input%2) + answer 해야
    // 원하는 역순으로 나옴
    // if(input == 0) bf.append(0); 이거 대신에 do while로 하면 예외적으로
    // 추가해주는 것이 아닌 의도적으로 한 번 해줌

    /*
     * do while 이용하기 문자열 bf대신 사용할 수 있는 방법 있음
     */

    // public static String solution(int input) {
    // int n = input;
    // StringBuffer bf = new StringBuffer();
    // while(n>0) {
    // bf.append(n%2+"");
    // n=n/2;
    // }

    // if(input == 0) bf.append(0);
    // return String.valueOf(bf.reverse());
    // }

    public static String solution(int input) {

        String str = "";

        do {
            str = (input % 2) + str;
            input = input / 2;
        } while (input > 0);

        return str;
    }
}
