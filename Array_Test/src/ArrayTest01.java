public class ArrayTest01 {
    public static void main(String[] args){

        int[] a = {1,100,2}; //静态初始化
        System.out.println(a.length);

        printArray(a);
        System.out.println("=============");

        int[] b = new int[4];
        printArray(b);
        System.out.println("=============");

        Object[] obj1 = new Object[3];
        printArray(obj1);
        System.out.println("=============");


        String[] s1 = new String[3];
        printArray(s1);
        System.out.println("=============");


        String[] s2 ={"sdada","dada","adad"};
        printArray(s2);
        System.out.println("===============");

        Object[] obj2 = {new Object(),new Object(),new Object()};
        printArray(obj2);
        System.out.println(obj2);
    }

    public static void printArray(int[] args){
        for(int i =0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
    public static void printArray(String[] args){
        for(int i =0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
    public static void printArray(Object[] args){
        for(int i =0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }

}
