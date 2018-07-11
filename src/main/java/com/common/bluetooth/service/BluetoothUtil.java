package com.common.bluetooth.service;

import java.util.Set;

import com.common.bluetooth.model.Device;
import lombok.experimental.UtilityClass;

import static com.common.bluetooth.util.CommandExecutor.executeComand;

@UtilityClass
public class BluetoothUtil {

    private String BLUETOOTH_BASE_COMMAND = "hcitool";


    private Set<Device> scan() {
        System.out.println(executeComand(BLUETOOTH_BASE_COMMAND + " " + "scan"));
    }

}
