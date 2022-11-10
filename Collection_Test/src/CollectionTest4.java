
/*
测试contains方法
测试remove方法。
结论：存放在一个集合中的类型，一定要重写equals方法。
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionTest4 {
    public static void main(String[] args){
        Collection c = new ArrayList();

        User u1 = new User("jack");
        c.add(u1);
        User u2 = new User("jack");
        System.out.println(c.contains(u2));
        c.remove(u2);
        System.out.println(c.size());

        Integer x= new Integer(1000);
        c.add(x);
        Integer y = new Integer(1000);
        System.out.println(c.contains(y));

        Collection cc = new ArrayList();
        String s1  =new String("hello");
        cc.add(s1);

        String s2 = new String("hello");
        // 删除s2
        cc.remove(s2); // s1.equals(s2) java认为s1和s2是一样的。删除s2就是删除s1。
        // 集合中元素个数是？
        System.out.println(cc.size()); // 0

    }

}

class User{
    private String name;
    public User(){}
    public User(String name){
        this.name = name;
    }

    // 重写equals方法
    // 将来调用equals方法的时候，一定是调用这个重写的equals方法。
    // 这个equals方法的比较原理是：只要姓名一样就表示同一个用户。
    public boolean equals(Object o) {
        if(o == null || !(o instanceof User)) return false;
        if(o == this) return true;
        User u = (User)o;
        // 如果名字一样表示同一个人。（不再比较对象的内存地址了。比较内容。）
        return u.name.equals(this.name);
    }

}
