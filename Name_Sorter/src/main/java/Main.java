/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Ryan Maharaj
 */

import java.io.*;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws Exception
    {

        File file = new File("C:\\Users\\ryanm\\OneDrive\\Documents\\Fall 2021\\Object Program\\exercise41_input.txt");

        BufferedReader reader = new BufferedReader(new FileReader(file));

        ArrayList<String> Names = new ArrayList<>();

        String str = reader.readLine();
        while (str != null){
            Names.add(str);
            str = reader.readLine();
        }
        reader.close();


        int size = Names.size();
        int count = 0;
        for(int j = 0; j < size; j++){
            count++;
        }

        Collections.sort(Names);

        System.out.println("Total of "+count+" names");
        System.out.println("-----------------");

        for(int i = 0; i < Names.size(); i++){
            System.out.println(Names.get(i));
        }

    }
}
