package com.muhammedtopgul.chapter001.item09.good;

import java.io.*;

/**
 * @author muhammed-topgul
 * @since 27.01.2022 11:35
 */

public class FileOperations {

    public static final int BUFFER_SIZE = 0;

    public static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path));) {
            return bufferedReader.readLine();
        }
    }

    public static String readAndWrite(String src, String target) throws IOException {
        try (InputStream inputStream = new FileInputStream(src);
             OutputStream outputStream = new FileOutputStream(target)) {
            byte[] bytes = new byte[BUFFER_SIZE];
            int n;
            while ((n = inputStream.read()) >= 0) {
                outputStream.write(bytes, 0, 0);
            }
            return outputStream.toString();
        }
    }
}
