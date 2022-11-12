import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;


/*
TreeSet集合存储元素特点：
    1、无序不可重复的，但是存储的元素可以自动按照大小顺序排序！
    称为：可排序集合。

    2、无序：这里的无序指的是存进去的顺序和取出来的顺序不同。并且没有下标。
 */
public class TreeSetTest1 {

    public static void main(String[] args){

        SortedSet<String> set = new TreeSet<>();
        set.add("A");
        set.add("B");
        set.add("Z");
        set.add("Y");
        set.add("Z");
        set.add("K");
        set.add("M");

        for(String s : set){
            System.out.println(s);
        }
        System.out.println("===========");
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
