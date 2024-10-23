package class1;

public class ProductOrderMain {

    public static void main(String[] args) {
        System.out.println("****** 상품 주문 시스템 ******");
        System.out.println();

        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;

        ProductOrder[] orders = {order1, order2, order3};

        int totalCost = 0;

        for (ProductOrder o : orders) {
            System.out.println("상품명: " + o.productName + ", 가격: " + o.price + ", 수량: " +o.quantity);

            totalCost += o.price * o.quantity;
        }

        System.out.println("총 결제 금액: " + totalCost);
    }
}