package Chapter9.interfaceex;

public interface Buy {

    void buy();

    default void order() {
        System.out.println("구매주문");
    }
}

interface Sell {

    void sell();

    default void order() {
        System.out.println("판매 주문");
    }
}

class Customer implements Buy, Sell {

    @Override
    public void buy() {
        System.out.println("customer buy");
    }

    @Override
    public void order() {
        System.out.println("customer order");
    }

    @Override
    public void sell() {
        System.out.println("customer sell");
    }

    public void sayHello() {
        System.out.println("hello");
    }
}

class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buy();
        customer.sell();
        customer.order();
        customer.sayHello();

        Buy buyer = customer;
        buyer.buy();
        buyer.order();

        Sell seller = customer;
        seller.sell();;
        seller.order();
    }
}