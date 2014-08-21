public class Problem_Two{
    //find the sum of the even valued fibonacci numbers up to 4 million. 
    public int lastFib = 0;

    public Problem_Two(){
	int answer = 0;
	for(int i = 0; i < 4000000; i = fib(lastFib)){
	    lastFib++;
	    if( i % 2 == 0 ){
		answer+= i;
	    }
	}
	System.out.println(answer);
    }

    public int fib(int n){
	if( n==0 ){
	    return 0;
	}else if( n==1 ) { 
	    return 1;
	}else{ 
	    return fib(n-1)+fib(n-2);
	}
    }

    public static void main(String[] args){
	new Problem_Two();
    }
}
