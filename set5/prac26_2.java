public class prac26_2{
    public static void CheckedException() throws Exception {
        throw new Exception("This is a checked exception.");
    }

    public static void UncheckedException() {
        int result = 10 / 0; 
    }
    public static void main(String[] args) {
        try {
            CheckedException();
        } catch (Exception e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        try {
            UncheckedException();
        } catch (ArithmeticException e) {
            System.out.println("Caught unchecked exception: " + e.getMessage());
        }

        System.out.println("23DCS081 Mahi Patel");
    }
}