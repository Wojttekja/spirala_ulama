

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

    public static void print_array(int[][] array, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (pierwsza(array[i][j])) {
                System.out.print(array[i][j] + "*\t");
            } else {
                System.out.print(array[i][j] + "\t");
            }
            }
            System.out.print("\n");
        }
    }

    public static void spiralaUlama(int n) {
        int[][] array = new int[n][n];
        int i = 1;
        // x, y - coordinates in array, we start from the middle
        int x = n / 2, y = n / 2;
        array[x][y] = i;
        for (int end = n / 2; end < n; end++) {
            // right
            while (y < end) {
                y++;
                i++;
                array[x][y] = i;
            }
            // up
            while (x > n-end-1) {
                x--;
                i++;
                array[x][y] = i;
            }
            // left
            while (y > n-end-1) {
                y--;
                i++;
                array[x][y] = i;
            }
            // down
            while (x < end) {
                x++;
                i++;
                array[x][y] = i;
            }
        }
        while (y < n-1) {
            y++;
            i++;
            array[x][y] = i;
        }
        print_array(array, n);
    }

    public static void main(String[] args) {
        spiralaUlama(3);
    }
}