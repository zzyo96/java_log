package com.lml.test;

public class StaticTest {

    public static void main(String[] args) {
        StaticTest staticTest1 = new StaticTest("lml");
        StaticTest staticTest2 = new StaticTest();
        staticTest2.staticTest();
    }

    public void staticTest(){
        System.out.println("afsdfsadf");
    }

    String name;

    String age;

    String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        address = address;
    }

    public StaticTest() {
        System.out.println("111");
    }

    public StaticTest(String name){
        name = name;
        System.out.println(name);
    }

    public static void a(){
        System.out.println("static方法");
//        System.out.println(name);
    }

    public void b(){
        a();
        System.out.println("非static方法");
    }

    public void c(){
        b();
        this.b();
    }


}
