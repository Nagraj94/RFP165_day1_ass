package com.bridgelabz.basics;

public class DemoVarMethodBlock {

    static int a = 20;
    static int b = 30;

    int sum(int a, int b){
        System.out.println("static value are added");
        int add = this.a +this.b;
        System.out.println(add);
        System.out.println("instance value are added");
        return a+b;
    }
    int sub(int a, int b){
        int sub = this.a -this.b;
        System.out.println("static value are subtracted");
        System.out.println(sub);
        System.out.println("instance value are subtracted");
        return a-b;
    }
    int mul(int a,int b){
        int mul = this.a *this.b;
        System.out.println("static value are multiplied");
        System.out.println(mul);
        System.out.println("instance value are multiplied");
        return a*b;
    }
    int div(int a, int b){
        int div = this.a /this.b;
        System.out.println("static value are divided");
        System.out.println(div);
        System.out.println("instance value are divided");
        return a/b;
    }

    public static void main(String[] args) {

        DemoVarMethodBlock demo = new DemoVarMethodBlock();

        System.out.println(demo.sum(20,10));
        System.out.println(demo.sub(40,30));
        System.out.println(demo.mul(22,45));
        System.out.println(demo.div(100,30));
    }
}
