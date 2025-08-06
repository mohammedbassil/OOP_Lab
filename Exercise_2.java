package bassil;
import java.util.Scanner;
public class Mohammed {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int count=0,val=0;
	if(num==0 || num==1) {
		System.out.println(num+"is not a prime num");
		
	}
	
	else if(num>=2) {
		for(int i=1;i<=num;i++) {
			val=num%i;
			if(val==0){
				count++;
				
			}
		}
		if(count==2){
			System.out.println(num+"is a prime number");
			
		}
		else {
			System.out.println(num+"is not a prime number");
			
	}
	}
	}
}
