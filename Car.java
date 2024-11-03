package static3.ex;

public class Car {

    private static int count;
    private String carName;

    Car(String carName) {
        this.carName = carName;
        System.out.println("차량 구입, 이름: " + carName);
        count++;
    }

    static void showTotalCars() {
        System.out.println("구매한 차량 수: " + count);
    }
}
