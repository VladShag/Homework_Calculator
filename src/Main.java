public class Main {
    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1,2);
        int b = calc.minus.apply(1,1);
        int c = calc.divide.apply(a,b);
        //Данный код работать не будет, т.к. происходить деление на 0 и выбрасывается ArithmeticException
        //Попробовал решить проблему добавив блок try/catch, который в случае попытки деления на ноль будет возвращать числитель
        calc.println.accept(c);
        int d = calc.abs.apply(-5);
        //Не совсем понял, при чём здесь тернарный оператор abs, он, вроде бы, сработал правильно
        System.out.println(d);
    }
}