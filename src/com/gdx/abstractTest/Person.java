package com.gdx.abstractTest;
//接口就是接口， 不是类
//一个类中所有方法变成抽象方法时， 这个类就是接口
//也是一个引用数据类型

public interface Person {
    //接口中有常量 public static final
    //还有抽象方法 public abstract
    public static final int NUM = 10;
    public abstract void eat();
    abstract void sleep();
    //系统会默认帮你写没写的static 或者public

}
//一个类可以实现多个接口
//加入没有实现所有的抽象方法，那么这个类也变成了抽象类
//一个类可以即继承， 又实现接口吗 可以， 但必须先继承再实现
interface Person2{
    public abstract void study();
    public abstract void drink();
}

//类和接口之间是什么关系
//一个类要实现一个接口， 必须要实现全部抽象方法
class Student implements Person, Person2{
    @Override
    public void eat() {
        System.out.println("I can eat");
    }

    @Override
    public void sleep() {
        System.out.println("I can sleep");
    }

    @Override
    public void study() {

    }

    @Override
    public void drink() {

    }

    public static void main(String[] args) {
        //接口不可以创建对象， 但是可以接口=实现类
        Person p = new Student();
        p.eat();
        //如何访问接口的常量
        System.out.println(Person.NUM);
        Student st = new Student();
        System.out.println(st.NUM);
        System.out.println(Student.NUM);
    }

    /*
    手机是一个照相机
    手机 extends 照相机 （安装胶卷）
    但是手机并不行
    所以手机具备照相能力

    继承：继承是is a 的关系
    接口：接口是has a的关系

    飞机， 小鸟， 风筝
    这三个抽取不了父类，
    如果小鸟继承了fly类， 有一天他想继承animal就不行了
    但是可以继承fly的接口
     */
}

