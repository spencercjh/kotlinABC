package chapter7.Object5JavaTest;

public class Test {
    public static void process(MyClass obj) {
        obj.test();
    }

    public static void main(String[] args) {
        final int n = 20;
        process(new MyClass() {
            @Override
            public void test() {
//                n++; java: 从内部类引用的本地变量必须是最终变量或实际上的最终变量
                if (n == 20) {
                    System.out.println("success");
                } else {
                    System.out.println("failed");
                }
            }
        });
    }
}
