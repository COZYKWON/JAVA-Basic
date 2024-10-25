package ex;

public class ProductOrderMain2 {

    public static void main(String[] args) {
        ProductOrder dooboo = createOrder("두부", 2000, 2); //productOrder에 참조값이 들어감.
        ProductOrder gimchi = createOrder("김치", 5000, 1);
        ProductOrder cola = createOrder("콜라", 1500, 2);

        ProductOrder[] orderList = {dooboo, gimchi, cola}; //배열에 저장

        printOrder(orderList);

        getTotalAmount(orderList);
    }

    public static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
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
