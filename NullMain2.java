package ref;

public class NullMain2 {

    public static void main(String[] args) {
        Data data = null; //참조값이 없음
        data.value = 10; //그냥 아무것도 없는 것에 .value를 찍음
        System.out.println("data.value = " + data.value);
    }
}
