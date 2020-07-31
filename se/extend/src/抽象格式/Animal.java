package 抽象格式;
/*
抽象方法：加上abstract关键字，然后去掉大括号，直接分号结束。注意一定是在抽象类里。
抽象类：类前面加上sbstract。
如何使用抽象类和抽象方法：
1.不能直接创建抽象类对象。
2.必须要用一个子类来继承抽象父类
3.子类必须覆盖重写抽像父类当中所有的抽象方法。
覆盖重写（实现）；子类去掉抽象方法的abstract关键字，然后补上方法体大括号
4.创建子类对象进行使用
 */

public  abstract class Animal {
    //这是普通的成员方法
    public void normalMethod(){

    }

    //这是一个抽象方法，代表吃东西，但具体是什么（大括号内容）确定
    public abstract void eat();
}
