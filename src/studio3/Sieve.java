import java.util.Scanner;

public class Sieve {

    public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

System.out.println("Please enter an integer.");

int n = scan.nextInt();
    int[] primeNumbers = new int[n-1];

for (int y = 0; y < n - 1; y++) {
    primeNumbers[y] = y+2;
}
for (int i = 2; i<Math.sqrt(n); i++) {

    for (int x = i*i; x<=n; x=x+i){
        primeNumbers[x-2]=0;
    }


}
for (int j = 0; j < primeNumbers.length; j++) {
    
    if (primeNumbers[j] != 0) {System.out.println(primeNumbers[j]);}
}


    }
}