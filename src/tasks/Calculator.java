package tasks;

public class Calculator {


    public  void calculator(String exp){
        try{
            CalculatorOperation s=new CalculatorOperation();
            char ar[] =exp.toCharArray();
        int firstNo=0, secondNo=0, thirdNo=0;
        char op1, op2;

        try {
             firstNo = Integer.parseInt(String.valueOf(ar[0]));
            secondNo = Integer.parseInt(String.valueOf(ar[2]));
        }catch (NumberFormatException e){
            System.out.println("Invalid Expression");
            System.exit(0);
        }
            if(ar.length==5){

                thirdNo=Integer.parseInt(String.valueOf(ar[4]));
            op1= ar[1];
            op2= ar[3];
            int result1=s.calOperation(firstNo,secondNo, op1);
            int result2=s.calOperation(result1, thirdNo,op2);
            System.out.println(result2);


        } else if (ar.length==3) {
                op1= (ar[1]);
            int result=s.calOperation(firstNo,secondNo, op1);
            System.out.println(result);



        }else {
                System.out.println("Expression doesn't match the expectation");
            }
        }
        catch (Exception e){
            System.out.println("Enter invalid Expression");
        }




    }
}
