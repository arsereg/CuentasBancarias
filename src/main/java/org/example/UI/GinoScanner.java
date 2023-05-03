package org.example.UI;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GinoScanner {

    public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));


    public String nextLine(){
        try {
            return in.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public int nextInt(){
        try {
            return Integer.parseInt(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public double nextDouble(){
        try {
            return Double.parseDouble(in.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }






}
