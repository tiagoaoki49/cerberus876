package br.com.letscode;

import java.util.Random;

public class App
{
    public static void main(String[] args) {

        int[] t = new int[5];
        for (int i = 0; i< t.length; i++) {
            t[i] = new Random().nextInt() % 500;
        }
    }

}
