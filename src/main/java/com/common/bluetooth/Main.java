package com.common.bluetooth;

import static com.common.bluetooth.util.CommandExecutor.*;

public class Main {

    public static void main(String[] args) {


        String output = executeComand("ping -c 3 google.com");

        System.out.println(output);
    }
}
