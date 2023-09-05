public class Test01{

    private static double correctCount = 0;
    private static final String[][] TESTCASES = new String[][] {
        { "MANGO", "mango" }, 
        { "peach", "PEACH" },
        { "Apple", "aPPLE" }, 
        { "baNANa", "BAnanA" }, 
        { "Believe In YourSelF", "bELIEVE iN yOURsELf" }, 
        { "THiS is how LIFE is!!", "thIs IS HOW life IS!!" }, 
        { "Li^^ve  p$osi&TIVE*", "lI^^VE  P$OSI&tive*" }, 
        { "%tiMe~~~~ iS>.< gggggolD ?:)", "%TImE~~~~ Is>.< GGGGGOLd ?:)" }
    };

    public static void main(String[] args) {
        for (int i = 0; i < TESTCASES.length; i++) 
            System.out.println("Testcase " + i + " = " + test(TESTCASES[i][0], TESTCASES[i][1]));

        System.out.println("정답률 = " + (int)(correctCount / 8 * 100) + "%");
    }

    private static boolean test(String input, String answer) {
        boolean res = solution(input).equals(answer);
        if (res)
            correctCount++;
        return res;
    }


    // 20230904 15분 소요
    // feedback 
    // 코드의 가독성을 높여보자
    // toCharArray() 사용해보자
    // char는 정수형임
    
    // solution
    public static String solution(String input) {

        //대문자 65~90 소문자 97~122
        //차이가 32난다

        String str1 = input;
        String str2 = "";

        for(int i=0; i<str1.length(); i++){
            if (str1.charAt(i)>=65&&str1.charAt(i)<=90) {   // 현재 보고 있는 문자가 65~90(대문자) 사이면 +32 해서 소문자로 만들기
                str2+=(char)(str1.charAt(i) + 32);
            }else if (str1.charAt(i)>=97&&str1.charAt(i)<=122) { // 현재 보고 있는 문자가 65~90(대문자) 사이면 -32 해서 대문자로 만들기
                str2+=(char)(str1.charAt(i) - 32);
            }else str2+=str1.charAt(i);                     // 둘 다 아니면 그냥 str에 더하기
        }

        return str2;
    }

}