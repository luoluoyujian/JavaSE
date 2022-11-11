/*
ArrayList集合：
    1、默认初始化容量10（底层先创建了一个长度为0的数组，当添加第一个元素的时候，初始化容量10。）
    2、集合底层是一个Object[]数组。
    3、构造方法：
        new ArrayList();
        new ArrayList(20);
    4、ArrayList集合的扩容：
        增长到原容量的1.5倍。
        ArrayList集合底层是数组，怎么优化？
            尽可能少的扩容。因为数组扩容效率比较低，建议在使用ArrayList集合
            的时候预估计元素的个数，给定一个初始化容量。
    5、数组优点：
        检索效率比较高。（每个元素占用空间大小相同，内存地址是连续的，知道首元素内存地址，
        然后知道下标，通过数学表达式计算出元素的内存地址，所以检索效率最高。）
    6、数组缺点：
        随机增删元素效率比较低。
        另外数组无法存储大数据量。（很难找到一块非常巨大的连续的内存空间。）
    7、向数组末尾添加元素，效率很高，不受影响。
    8、面试官经常问的一个问题？
        这么多的集合中，你用哪个集合最多？
            答：ArrayList集合。
            因为往数组末尾添加元素，效率不受影响。
            另外，我们检索/查找某个元素的操作比较多。

    7、ArrayList集合是非线程安全的。（不是线程安全的集合。）
 */


import java.util.*;

public class ArrayListTest1 {

    public static void main(String[] args){
        List list1 = new ArrayList();
        List list2 = new ArrayList(20);

        Set set1 = new HashSet();
        set1.add(100);
        set1.add(200);
        set1.add(900);
        set1.add(50);

        List list3 = new ArrayList(set1);
        for (Object i : list3){
            System.out.println(i);
        }
        List c1 = new ArrayList();
        c1.add(12);
        c1.add(22);
        c1.add(33);
        c1.add(44);
        for(int i=0;i<c1.size();i++){
            System.out.println(c1.get(i));
        }



    }

}
