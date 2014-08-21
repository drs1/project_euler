import structure5.*;

public class Problem_One{

    public Problem_One(){
	int answer = 0;
	for( int i = 0; i<1000; i++){
	    if( i % 3 == 0 || i % 5 == 0 ){
		answer += i;
	    }
	}
	System.out.println(answer);
    }

    
    public static void main(String[] args){
	new Problem_One();
    }

}
