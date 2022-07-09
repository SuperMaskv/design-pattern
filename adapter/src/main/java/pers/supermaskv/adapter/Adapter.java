package pers.supermaskv.adapter;

public class Adapter implements Client {
    private Service service;

    public Adapter(Service service) {
        this.service = service;
    }

    @Override
    public void method(String integer1, String integer2) {
        service.serviceMethod(Integer.valueOf(integer1), Integer.valueOf(integer2));
    }
}
