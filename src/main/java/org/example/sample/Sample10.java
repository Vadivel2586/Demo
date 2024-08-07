package org.example.sample;

public class Sample10 {
    class MyException extends Exception{
        String errorMessage;

        public MyException(String message) {
            super(message);
            this.errorMessage = message;
        }

    }
    interface Calculate{
        int calculate(int a,int b);
    }
    public static void main(String[] args) {
        Calculate sum = (a, b)-> a+b;
        Calculate sub = (a, b)-> a-b;
        System.out.println(sum.calculate(10,20));
        System.out.println(sub.calculate(100,20));

        validate(10);

        Sample10 sample10 = new Sample10();
        try{
            sample10.sampleMethod();
        }catch (MyException e){
            e.printStackTrace();
        }

    }
    public static void validate(int age) {
        if(age<18) {
            throw new ArithmeticException("Person is not eligible to vote");
        }
        else {
            System.out.println("Person is eligible to vote!!");
        }
    }
    public void sampleMethod() throws MyException {
        if(1==1){
            throw new MyException("Custom Exception");
        }
    }
}
