import java.util.ArrayList;
import java.util.Collection;

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
