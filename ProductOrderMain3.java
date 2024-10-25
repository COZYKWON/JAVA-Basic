package ex;

import java.util.Scanner;

public class ProductOrderMain3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        ProductOrder[] orderList = new ProductOrder[count];

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            orderList[i] = createOrder();
        }

        printOrder(orderList);

        getTotalAmount(orderList);
    }

    public static ProductOrder createOrder() {
        Scanner scanner = new Scanner(System.in);
        ProductOrder productOrder = new ProductOrder();

        System.out.print("상품명: ");
        productOrder.productName = scanner.nextLine();
        System.out.print("가격: ");
        productOrder.price = scanner.nextInt();
        System.out.print("수량: ");
        productOrder.quantity = scanner.nextInt();
        scanner.nextLine();

        return productOrder;
    }

    public static void printOrder(ProductOrder[] orderList) {
        for (ProductOrder productOrder : orderList) {
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
        }
    }

    public static int getTotalAmount(ProductOrder[] orderList) {
        int totalAmount = 0;
        for (ProductOrder productOrder : orderList) {
            totalAmount += productOrder.price * productOrder.quantity;
        }
        System.out.println("총 결제 금액: " + totalAmount);
        return totalAmount;
    }
}
