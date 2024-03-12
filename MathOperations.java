public class MathOperations {
    
    public int add(int a, int b) {
        return a + b;
    }
    public  double add(double a, double b, double c) {
        return a + b + c;
    }
    
    public  String add(String a, String b) {
        return a + b;
        }
    
    public static void main(String[] args) {
        MathOperations mo = new MathOperations();
        int sum1 = mo.add(3, 100);
        System.out.println("Sum of two integers: " + sum1);
        
        double sum2 = mo.add(3.50, 2.5, 6.8);
        System.out.println("Sum of three doubles: " + sum2);
        
        String combined = mo.add("Welcome to, ", "DataValley Classes");
        System.out.println("Concatenated string: " + combined);
    }
}
