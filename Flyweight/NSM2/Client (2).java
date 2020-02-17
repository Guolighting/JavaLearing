package com.mode.Flyweight.NSM2;

public class Client {
    public static void main(String[] args) {
        NetworkDevice nd1,nd2,nd3,nd4,nd5;
        DeviceFactory df=DeviceFactory();
        nd1=df.getNetworkDevice("cisco");
        nd1.use(new Port("1000"));
    }
}
