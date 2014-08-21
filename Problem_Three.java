//the prime factors of 13195 are 5, 7, 13, and 29;
//What is the largest prime factor of 600851475143


//                           600851475143

// recursively add primes to array. 

public class Problem_Three{

    public static int primeFactor(long n){
	int i;
	for(i=2; i <= n; i++){
	    if( n%i == 0 ){
		n /= i;
		i--;
	    }
	}
	return i;
    }
    public static void main(String[] args){
	System.out.println(primeFactor(600851475143L));
    }
}
