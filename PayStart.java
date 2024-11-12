package poly.ex.pay1;

import java.util.Scanner;

public class PayStart {

    private static String payType;
    private static int payPrice;

    public static void startPay() {
        Scanner scanner = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제 수단을 입력하세요: ");
            payType = scanner.nextLine();

            if (payType.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            } else {
                System.out.print("결제 금액을 입력하세요: ");
                payPrice = scanner.nextInt();
                scanner.nextLine();

                payService.processPay(payType, payPrice);
            }
        }
    }
}
