package calculator;

public class Calculator {

    int num1;
    int num2;
    char operation;

    //задаем первое число
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    //получаем первое число
    public int getNum1() {
        return num1;
    }

    //задаем второе число
    public void setNum2(int num2) {
        this.num2 = num2;
    }

    //получаем второе число
    public int getNum2() {
        return num2;
    }

    //задаем оператор
    public void setOperation(char operation) {
        this.operation = operation;
    }

    //получаем оператор
    public char getOperation() {
        return operation;
    }

    //получаем результат операции
    public int getResult() {
        int result;
        switch (operation) {
            case '+':
                result = getNum1() + getNum2();
                break;
            case '-':
                result = getNum1() - getNum2();
                break;
            case '*':
                result = getNum1() * getNum2();
                break;
            case '/':
                result = getNum1() / getNum2();
                break;
            default:
                throw new IllegalStateException("Некорректная операция: " + operation);
        }
        return result;
    }

    Calculator(int num1, int num2, char operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return "Операция выполнена успешно: " + getNum1() + " " + getOperation() + " " + getNum2() + " = " + getResult();
    }
}
