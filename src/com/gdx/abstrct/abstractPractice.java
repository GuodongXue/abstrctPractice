package com.gdx.abstrct;

//抽象类就是为了避免子类的随意设计， 是为了给子类提供模板的

//那么抽象类中，可以有几个抽象方法？ 0个， 1个， 多个都可以
public abstract class abstractPractice {
    //1.在一个类中， 有一部分方法， 子类对他永远满意， 直接用， 不用重写
    public void eat(){
        System.out.println("Eat food");
    }
    //在一个类中， 还有一部分类， 无论怎么写子类都不满意， 都要对他重写
    //对于这样的方法， 方法就没必要重写了
    //如果一个方法没有方法体， 只有申明， 则这个方法就是一个抽象方法

    public abstract void say();
    public abstract void sleep();

    public abstractPractice() {
    }
    //抽象类可以有构造器， 并不是给他自己本身用的，而是给子类用的
    //final不可以修饰抽象类， final修饰类就是为了不重写， abstract就是为了让重写， 所以二者冲突

}
//抽象类可以被继承吗 可以， 但是得重写
class Student extends abstractPractice{
    @Override
    public void say() {
        System.out.println("say hello");
    }

    @Override
    public void sleep() {
        System.out.println("sleep");
    }
}
//假如子类没有重写所有的抽象类， 可以吗， 也可以， 但是就得改成abstract
class test{
    //可否创建抽象类的对象， 不可以
    public static void main(String[] args) {
        Student st = new Student();
        //可以用子类的具体来创建父类
        abstractPractice practice = new Student();


    }

}

