package com.collections;

@FunctionalInterface
interface MyInterf{
    int add(int x, int y);
}
class Test{
    int add(int x, int y){
        return (x+y);
    }
}
public class MethodReference1 {

    public static void main(String[] args){

        int a = 8;int b=9;
        //Using lamba
        MyInterf myInterfLambda = (int x, int y)-> {return (x+y);};
        System.out.println("With Lambda Expression : "+myInterfLambda.add(a,b));

        //Using ClassMethodRef
        MyInterf myInterfClassMethodRef = MethodReference1::addMethodRef;
        System.out.println("With Class MethodRef : "+myInterfClassMethodRef.add(a,b));

        //Using ObjMethodRef
        Test test = new Test();
        MyInterf myInterfObjMethodRef = test::add;
        System.out.println("With Obj MethodRef : "+myInterfObjMethodRef.add(a,b));
    }
    static int addMethodRef(int x, int y){
        return (x+y);
    }
}
