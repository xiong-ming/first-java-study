package 匿名内部类;
/*
1.如果接口实现类（或者父类的子类）只需要使用唯一的一次。
那么这种情况就可以省略掉该类的定义，而改为匿名内部类。
定义格式：
接口名称 对象名=new 接口名称（）{
    //...
};
格式解析：
1.new表示创建对象的动作
2.接口名称就是匿名内部类需要实现哪个接口。
3.{...}这才是匿名内部类的内容
注意：
1.匿名内部类在创建对象时，只能使用唯一一次。
如果希望多次创建对象，而且类的内容一样的话，那么就需要单独定义的实现类了。
（就像一个是提前定义，然后封装，就可以重复调用。另一个是临时定义，不封装，只用一次）
2.匿名对象，在调用方法的时候，只能调用唯一一次,
如果希望同一对象调用多次方法，那必须给对象起个名字。
3.匿名内部类是省略了实现类/子类名称，但是匿名对象省略了对象名称。两者不是一回事。
 */

public class Main {
    public static void main(String[] args) {
        /*MyInterfaceImpl impl=new MyInterfaceImpl();也可以如下来写
        impl.method();*/
        /*MyInterface obj=new MyInterfaceImpl();
        obj.method();*/

        //MyInterface some=new MyInterface();错误写法
        MyInterface objA =new MyInterface(){

            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法！111A");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法！222A");
            }
        };
        objA.method1();
        objA.method2();

        new MyInterface(){

            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法！111B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法！222B");
            }
        }.method1();

        //使用了匿名内部类，而且省略了对象名称，也是匿名对象
        new MyInterface(){

            @Override
            public void method1() {
                System.out.println("匿名内部类实现了方法！111B");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类实现了方法！222B");
            }
        }.method2();


    }
}
