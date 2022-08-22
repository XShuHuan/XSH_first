package com.error.ch03;

public class Error02 {
    public static void main(String[] args) {
        int i;
        for ( ; ; ) {
            i=0;
            if(i==10){
                break;
            }
            i++;
        }
        if(i==10){
            System.out.println("hello");
        }
    }
}
