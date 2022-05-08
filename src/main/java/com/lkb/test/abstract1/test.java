package com.lkb.test.abstract1;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class test {


    public static void main(String[] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\n Call mailCheck using Employee reference--");
        e.mailCheck();
        int i = 0;
        try {
            Path path =Paths.get("s");
            Files.size(path);
            i += 1;
            System.out.println("i0:"+i);
        } catch (Exception e1) {
            e1.printStackTrace();
        } finally {
            i = 10;
            System.out.println("i10:"+i);
        }
    }
}
