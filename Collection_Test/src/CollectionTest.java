import java.util.ArrayList;
import java.util.Collection;

/*
关于java.util.Collection接口中常用的方法。
    1、Collection中能存放什么元素？
        没有使用“泛型”之前，Collection中可以存储Object的所有子类型。
        使用了“泛型”之后，Collection中只能存储某个具体的类型。
        集合后期我们会学习“泛型”语法。目前先不用管。Collection中什么都能存，
        只要是Object的子类型就行。（集合中不能直接存储基本数据类型，也不能存
        java对象，只是存储java对象的内存地址。）
    2、Collection中的常用方法
        boolean add(Object e) 向集合中添加元素
        int size()  获取集合中元素的个数
        void clear() 清空集合
        boolean contains(Object o) 判断当前集合中是否包含元素o，包含返回true，不包含返回false
        boolean remove(Object o) 删除集合中的某个元素。
        boolean isEmpty()  判断该集合中元素的个数是否为0
        Object[] toArray()  调用这个方法可以把集合转换成数组。【作为了解，使用不多。】
 */
public class CollectionTest {

    public static void main(String[] args) {

        Collection c = new ArrayList();
        c.add(1200);
        c.add(3.14);
        c.add(new Object());
        c.add(true);

        System.out.println("集合中的元素个数为 " + c.size());
        c.clear();
        System.out.println("集合中的元素个数为 " + c.size());

        c.add("hello"); // "hello"对象的内存地址放到了集合当中。
        c.add("world");
        c.add("浩克");
        c.add("绿巨人");
        c.add(1);

        boolean flag = c.contains(1);
        System.out.println(flag);
        c.remove(1);
        System.out.println("集合中的元素个数为 " + c.size());

        Object[] objs = c.toArray();
        for(int i =0;i<objs.length;i++){
            System.out.println(objs[i]);
        }

    }


}
