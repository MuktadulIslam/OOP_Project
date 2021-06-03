package OOP_Project;

import java.io.*;
import java.io.IOException;

public class Main5 {

    static void search(int i){
        System.out.println("search by it");
    }
    static void search(String str){
        System.out.println("search by String");
    }
    static void search(int i, String str){
        System.out.println("search by int and String");
    }

    public static void main(String[] args) {
        search(45);
        search("dsjk");
        search(45,"dkbj");
    }
}
