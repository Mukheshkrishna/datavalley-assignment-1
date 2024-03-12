public class MathOperations{

    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b, double c){
        return a + b + c;
    }
    
    public String add(String a, String b){
        return a + b;
    }

    public static void main(String[] args){
        MathOperations op = new MathOperations();
        int IntSum = op.add(35, 87);
        System.out.println("Sum of two integers: " + IntSum);
        double DoubleSum = op.add(91.02, 56.91, 11.11);
        System.out.println("Sum of three doubles: " + DoubleSum);
        String StringConcat = op.add("Welcome", "to India!");
        System.out.println("Concatenation of two strings: " + StringConcat);
    }
}