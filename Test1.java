interface Calculator {
    void add();
    void sub();
}

class MyCalculator5 implements Calculator {
    public void add() {
        int num1 = 20;
        int num2 = 30;
        int result = num1 + num2;
        System.out.println(result);
    }

    public void sub() {
        int num1 = 50;
        int num2 = 20;
        int result = num1 - num2;
        System.out.println(result);
    }

    public void mul() {
        int num1 = 50;
        int num2 = 20;
        int result = num1 * num2;
        System.out.println(result);
    }
}

public class Test1 {
    public static void main(String[] args) {
        MyCalculator5 mc = new MyCalculator5();
        Calculator ref = mc;

        ref.add();
        ref.sub();
        mc.mul();
    }
}
