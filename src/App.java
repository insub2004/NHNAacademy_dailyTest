public class App {
    public static void main(String[] args) throws Exception {

        double d = 0.90625;
        String str = "";
        //2 곱하고
        //1.0 으로 나눈 몫 저장
        //정수부분 날리기

        while(d!=0.0){
            d = d*2;
            str += (int)d/1;
            d = d%1.0;
        }

        System.out.println("최종답 : " + str);
    }
}
