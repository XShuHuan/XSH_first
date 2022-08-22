package com.error.ch03;

public class People {
    byte numBety;
    char strChar;
    int numInt;
    long numLong;
    double numDouble;

    boolean isRes;

    public String str;
    public void work(){
        numBety=this.numBety;
        strChar=this.strChar;
        numInt=this.numInt;
        numLong=this.numLong;
        numDouble=this.numDouble;
        isRes=this.isRes;
        str=this.str;
        System.out.println("Bety的默认值是:"+numBety);
        System.out.println("Char的默认值是:"+strChar);
        System.out.println("Int的默认值是:"+numInt);
        System.out.println("Long的默认值是:"+numLong);
        System.out.println("Double的默认值是:"+numDouble);
        System.out.println("boolean的默认值是:"+isRes);
        System.out.println("String的默认值是:"+str);
    }
}
