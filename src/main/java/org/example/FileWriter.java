package org.example;

import java.io.*;

public class FileWriter {
    java.io.FileWriter writer;

    FileWriter(String filename) throws IOException {
        writer = new java.io.FileWriter(filename);
    }

    void write(String msg) throws IOException {
        writer.write(msg + "\n");
    }

    void close() throws IOException {
        writer.close();
    }
}
