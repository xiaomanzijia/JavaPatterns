package com.example.licheng.lcdemo.patterm.state.flyweight;

import java.util.ArrayList;

/**
 * Created by changyuan on 2017/11/11.
 */

public class DeviceFactory {

    private ArrayList devices = new ArrayList();
    private int totalTerminal = 0;

    public DeviceFactory() {
        NetworkDevice nd1 = new Switch("Cisco-WS-C2950-24");
        devices.add(nd1);

        NetworkDevice nd2 = new Hub("TP-LINK-HF8M");
        devices.add(nd2);
    }

    public NetworkDevice getNetworkDevice(String type) {
        if (type.equalsIgnoreCase("cisco")) {
            totalTerminal ++;
            return (NetworkDevice) devices.get(0);
        } else if (type.equalsIgnoreCase("tp")) {
            totalTerminal ++;
            return (NetworkDevice) devices.get(1);
        } else {
            return null;
        }
    }

    public int getTotalTerminal() {
        return totalTerminal;
    }

    public int getTotalDeviceSize() {
        return devices.size();
    }
}
