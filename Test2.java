interface Calculator0 {
    void add();
    void sub();
}

interface Calculator1 {
    void mul();
    void div();
}

class MyCalculator5 implements Calculator0, Calculator1 {
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
        int num1 = 10;
        int num2 = 5;
        int result = num1 * num2;
        System.out.println(result);
    }

    public void div() {
        int num1 = 100;
        int num2 = 5;
        int result = num1 / num2;
        System.out.println(result);
    }
}

public class Test2 {
    public static void main(String[] args) {
        MyCalculator5 mc = new MyCalculator5();

        mc.add();
        mc.sub();
        mc.mul();
        mc.div();
    }
}
