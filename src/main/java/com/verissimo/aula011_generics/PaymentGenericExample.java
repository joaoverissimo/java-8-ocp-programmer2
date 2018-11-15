package com.verissimo.aula011_generics;

class PaymentGoogle {
    public String name = "Google";
    public double rate = 3;
}

class PaymentAmazon {
    public String name = "AWS";
    public double rate = 3;
}

class GatewayPayment<T> {
    private T obj;

    public GatewayPayment(T obj) {
        this.obj = obj;
    }

    public T process() {
        System.out.println("executing payment complete");
        return obj;
    }

    public T refunds() {
        System.out.println("refounding payment");
        return obj;
    }
}

public class PaymentGenericExample {

    public static void main(String[] args) {
        PaymentGoogle g = new PaymentGoogle();
        GatewayPayment<PaymentGoogle> paymentGoogle = new GatewayPayment<>(g);
        paymentGoogle.process();

        PaymentAmazon a = new PaymentAmazon();
        GatewayPayment<PaymentAmazon> paymentAmazon = new GatewayPayment<>(a);
        paymentAmazon.process();

        paymentGoogle.refunds();
        paymentAmazon.refunds();
    }

}
