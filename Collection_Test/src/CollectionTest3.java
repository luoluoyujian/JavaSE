
/*
深入Collection集合的contains方法：
    boolean contains(Object o)
        判断集合中是否包含某个对象o
        如果包含返回true， 如果不包含返回false。

    contains方法是用来判断集合中是否包含某个元素的方法，
    那么它在底层是怎么判断集合中是否包含某个元素的呢？
        调用了equals方法进行比对。
        equals方法返回true，就表示包含这个元素。
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest3 {

    public static void main(String[] args){
        Collection c = new ArrayList();
        String s1 = new String("aaaa");// s1 = 0x1111
        c.add(s1);
        String s2 = new String("bbbb");// s2 = 0x2222
        c.add(s2);

        String x = new String("aaaa"); //x = 0x5555
        boolean flag = c.contains(x);
        System.out.println(flag);//判断集合中是否存在"abc" true


    }
}
