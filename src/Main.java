public class Main {
    
    public static boolean pierwsza(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(int n) {
        
    }

    public static void main(String[] args) {
        for
    }
}