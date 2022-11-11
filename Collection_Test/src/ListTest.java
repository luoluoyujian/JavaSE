import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
测试List接口中常用方法
    1、List集合存储元素特点：有序可重复
        有序：List集合中的元素有下标。
        从0开始，以1递增。
        可重复：存储一个1，还可以再存储1.
    2、List既然是Collection接口的子接口，那么肯定List接口有自己“特色”的方法：
        以下只列出List接口特有的常用的方法：
            void add(int index, Object element)
            Object set(int index, Object element)
            Object get(int index)
            int indexOf(Object o)
            int lastIndexOf(Object o)
            Object remove(int index)

        以上几个方法不需要死记硬背，可以自己编写代码测试一下，理解一下，
        以后开发的时候，还是要翻阅帮助文档。
 */
public class ListTest {
    public static void main(String[] args) {
        List myList = new ArrayList();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");

        myList.add(1, "luo");
        for (Object s : myList) {
            System.out.println(s);
        }

        Object obj = myList.get(0);
        System.out.println(obj);

        System.out.println("=========");

        myList.set(0,"okok");

        Iterator it = myList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
