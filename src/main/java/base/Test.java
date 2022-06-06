package base;

public class Test {
    public  void test1(){
        int a = 9;
        int b = 3;
        int total = a + b;

    }

    public int test2(){
        int a = 9;
        int b = 3;
        int total = a + b;
        return total;
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.test1();
        //void return
        //System.out.println(test.test1());


        System.out.println(test.test2());
        int myTotal = test.test2();

    }
}
