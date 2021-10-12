/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ryan Maharaj
 */


import java.io.*;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws Exception
    {

        File file = new File("C:\\Users\\ryanm\\OneDrive\\Documents\\Fall 2021\\Object Program\\exercise42_input.txt");

        BufferedReader reader = new BufferedReader(new FileReader(file));

        ArrayList<String> Names = new ArrayList<>();

        String line = reader.readLine();
        while (line != null){
            Names.add(line);
            line = reader.readLine();
        }
        reader.close();

        String str = Names.replaceAll(",", " ");



        for(int i = 0; i < Names.size(); i++){

            System.out.println(Names.get(i));
        }

    }
}

