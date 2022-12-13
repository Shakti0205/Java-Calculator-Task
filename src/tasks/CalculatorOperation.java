package tasks;

public class CalculatorOperation {
    public Integer calOperation(int x, int y, char operation) {
       int result=0;
        switch (operation) {
            case '+':
                 result=x+y;
                break;
            case '-':
                result=x-y;
                break;
            case '*':
                result=x*y;
                break;
            case '/':
                result=x/y;
                break;
            default:
                System.out.println(" Operation not supported ");

        }
        return result;
    }

    }
