package com.error.ch03;
/**
 * 程序执行的时候 先找到匹配的case常量 进入选择结构
 * 如果没找到则执行default；
 * break的作用是跳出Switch 否则找到匹配的case常量后面的不判断但是进入case并执行
 */
public class Error01 {
    public static void main(String[] args) {
        int i=2,k=0;
        switch (i){
            default:
                k+=4;
            case 1:
                k++;
                break;
            case 2:
                k--;
        }
        System.out.println("K"+k);
    }
}
