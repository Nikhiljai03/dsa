
public class tt {
    public static int ncr(int n , int r){
        int res = 1;
        for(int i = 0; i < r; i++){
            res  = res * (n - i);
            res = res / (i + 1);
        }
        return res;
        }
    public static void main(String[] args) {
        // int n  = 6;
        // // int r = 3;
        // // System.out.println(ncr(n-1,r-1));
        // for(int c = 0;  c <= n ; c++){
        //     System.out.print(ncr(n-1 ,c-1));
        // }

        // int n = 14875;
        // int rev = 0;
        // while(n > 0){
        //     int rem  = n % 10;
        //     rev  = rev * 10 + rem;
        //     n = n / 10;
        // }
        // System.out.print(rev);

        // int i = 1;
        // float  j = (float) i ;
        // System.out.println(j);
        // int z = (int) j;
        // System.out.println(z);

        // String n = "1234";
        // int ans  = Integer.parseInt(n);
        // System.out.println(ans);
        // int rev = 0;
        // while(ans > 0){
        //     int rem  = ans  % 10;
        //     rev  = rev * 10 + rem;
        //     ans  = ans / 10;
        // }
        // System.out.println(rev);
        // Scanner sc = new Scanner(System.in);
        // printNumber(sc);

        // int  n = 5;
        // for(int i = 0; i < n ;i++){s
        //     for(int j = 0;  j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }
        // for(int i = 0; i < 5; i++){
        //     for(char ch = 'A'; ch <= 'A'+i; ch++){
        //         System.out.print(ch + " ");
        //     }
        //     System.out.println( );
        // }


        rec(5);

    // public static void printNumber(Scanner sc) {
    //         int num = sc.nextInt();
    //         System.out.println(num);
    // }

    public static void rec(int count){
        if(count == 4){
            return;
        }
        System.out.println(count);
        count++;
        rec(count);
        }
        public int count = 0;
    }
}

