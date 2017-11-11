package com.example.licheng.lcdemo.patterm.state.flyweight;

/**
 * Created by changyuan on 2017/11/11.
 */

public class Client {
    public static void main(String[] args) {
        NetworkDevice nd1, nd2, nd3, nd4, nd5;
        DeviceFactory factory = new DeviceFactory();

        nd1 = factory.getNetworkDevice("cisco");
        nd1.use();

        nd2 = factory.getNetworkDevice("cisco");
        nd2.use();

        nd3 = factory.getNetworkDevice("cisco");
        nd3.use();

        nd4 = factory.getNetworkDevice("tp");
        nd4.use();

        nd5 = factory.getNetworkDevice("tp");
        nd5.use();

        System.out.println("Total Device:" + factory.getTotalDeviceSize());
        System.out.println("Total Terminal:" + factory.getTotalTerminal());
    }
}
