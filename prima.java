import java.util.Scanner;
public class prima {
    public static void main(String arg []) {
        System.out.print ("Masukkan Angka : ") ;
        Scanner sc = new Scanner (System.in) ;
        int n = sc.nextInt ();
        prime (n) ;
    }
    static void prime (int num) {
        int count = 0 ;
        for (int i = 1 ; i <= num ; i++) {
            if (num%i == 0) {
                count++ ;
            }
        }
        if (count == 2) 
        System.out.println ("Bilangan Prima") ;
        else
        System.out.println ("Bukan Bilangan Prima") ;
    }
}
