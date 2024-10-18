class MyException extends Exception {
    public MyException() {
        System.out.println("Exception created by user");
    }
}

public class prac26_1 {

    static void checkValue(int value) throws MyException {
        if (value > 10) {
            throw new MyException();
        }
        System.out.println("Value is acceptable: " + value);
    }
    public static void main(String[] args) {
        try {
            checkValue(3); 
            checkValue(20);

        } catch (MyException e) {
            System.out.println("Caught exception: ");
        }

        System.out.println("23DCS081 Mahi Patel");
    }    
}