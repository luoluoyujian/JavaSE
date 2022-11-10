import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest {
    public static void main(String[] args) {

        int[] arr = {432, 4, 65, 46, 54, 76, 54};
        // 遍历数组（普通for循环）
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("=======");

        // 增强for（foreach）
        // 以下是语法
        /*for(元素类型 变量名 : 数组或集合){
            System.out.println(变量名);
        }*/
        for (int data : arr) {
            System.out.println(data);
        }

        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("world!");
        strList.add("kitty!");

        // 使用下标方式（只针对于有下标的集合）
        System.out.println("=======");
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
        System.out.println("=======");

        // 遍历，使用迭代器方式
        Iterator<String> it = strList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("=======");

        // 使用foreach
        for (String s : strList) {
            System.out.println(s);
        }

        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        for(Integer i : list){
            System.out.println(i);
        }

    }

}
