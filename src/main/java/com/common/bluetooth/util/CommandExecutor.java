package com.common.bluetooth.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import lombok.experimental.UtilityClass;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@UtilityClass
@Log
public class CommandExecutor {

    public static String executeComand(String command) {
        StringBuilder output = new StringBuilder();
        Process p;
        try {
            p = Runtime.getRuntime().exec(command);
            p.waitFor();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line).append("\n");
            }
        } catch (Exception e) {
            log.info(e.getMessage());
        }

        return output.toString();
    }}
