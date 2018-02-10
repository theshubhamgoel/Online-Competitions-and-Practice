
public class one0001stprime {

	public static void main(String[] args) {
		int count=1;
		long i=3;
		while(count<100001){
			if(isPrime(i++))
				count++;
		}
		System.out.println(i-1);

	}
	
	static boolean isPrime(Long n) {
		// check if n is a multiple of 2
		
		if (n % 2 == 0)
			return false;
		// if not, then just check the odds
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
