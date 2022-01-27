package com.muhammedtopgul.chapter001.item09.bad;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author muhammed-topgul
 * @since 27.01.2022 11:34
 */

public class FileOperations {

    public static String firstLineOfFile(String path) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }
        return null;
    }
}
