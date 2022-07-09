package pers.supermaskv.adapter;

public class Main {
    public static void main(String[] args) {
        Client client = new Adapter(new Service());
        client.method("5", "7");
    }
}
