package com.company;

import javafx.scene.input.InputMethodTextRun;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 * Created by ashrayme on 30/05/15.
 */
public class Console {

    private BufferedReader reader;

    public Console() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public void writeLine(String toWrite) {
        System.out.println(toWrite);
    }

    public String readLine() {
        try {
            return reader.readLine();
        }
        catch (IOException ex) {
            return null;
        }
    }
}
