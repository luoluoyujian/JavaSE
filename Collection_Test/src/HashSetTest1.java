import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
HashSet集合：
    无序不可重复。
 */
public class HashSetTest1 {

    public static void main(String[] args){

        Set<String> set = new HashSet<>();

        // 添加元素
        set.add("hello3");
        set.add("hello4");
        set.add("hello1");
        set.add("hello2");
        set.add("hello3");
        set.add("hello3");
        set.add("hello3");
        set.add("hello3");

        // 遍历
        /*
        hello1
        hello4
        hello2
        hello3
        1、存储时顺序和取出的顺序不同。
        2、不可重复。
        3、放到HashSet集合中的元素实际上是放到HashMap集合的key部分了。
         */

        for(String s : set){
            System.out.println(s);
        }
        System.out.println("========");

        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}
