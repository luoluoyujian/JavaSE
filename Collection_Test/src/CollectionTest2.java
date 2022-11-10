import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class CollectionTest2 {
    public static void main(String[] args){
        Collection c = new ArrayList(); // ArrayList集合：有序可重复
        c.add("abc");
        c.add("def");
        c.add(100);
        c.add(new Object());

        Iterator it = c.iterator();

        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

        System.out.println("========================");
        Collection c2 = new HashSet();// HashSet集合：无序不可重复
        c2.add(100);
        c2.add(200);
        c2.add(300);
        c2.add(90);
        c2.add(400);
        c2.add(50);
        c2.add(60);
        c2.add(100);
        Iterator it2 = c2.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }


    }
}
