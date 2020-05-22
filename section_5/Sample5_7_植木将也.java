//•‚“®¬”“_‚Ì¸“x

class Sample5_7{
	public static void main(String[] args){
		float sum = 0.0f;
		
		System.out.printf("%9s   %9s\n","x","x*x");
		System.out.println("---------------------");
		
		for(int i = 1; i <= 1000; i++){
			sum += 1/1000.0;
			
			System.out.printf("%8.7f   %8.7f\n", sum, sum * sum);
		}
	}
}