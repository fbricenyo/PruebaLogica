import java.util.Scanner;
public class PruebaLogica { 
	public static void main(String[] args) { 
	// TODO Auto-generated method stub 
		Scanner input=new Scanner(System.in);
		System.out.println("Enter T");
		int t=input.nextInt();
		input.nextLine();
		String [] numbers = new String[t]; 

		System.out.println("INPUT "+ t + " VALUES TYPE N M");
		for(int i=0;i<t;i++){
			numbers[i] = input.nextLine();
		}

		System.out.println("OUTPUT");
		for (int i=0;i<t;i++) {
			String number = numbers[i];
			String[] parts = number.split(" ");
			String n = parts[0];
			String m = parts[1];
			int nn = Integer.parseInt(n);
			int mm = Integer.parseInt(m);

			if(nn==mm){
				if(nn%2==0||mm%2==0){
					System.out.println("L");
				}else{
					System.out.println("R");
				}
			}else if(nn<mm){
				if(nn%2!=0&&mm%2!=0){
					System.out.println("R");
				}else if(nn%2!=0&&mm%2==0){
					System.out.println("R");
				}else if(nn%2==0&&mm%2==0){
					System.out.println("L");
				}else if(nn%2==0&&mm%2!=0){
					System.out.println("L");
				}
			}else if(nn>mm){
				if(nn%2!=0&&mm%2!=0){
					System.out.println("D");
				}else if(nn%2==0&&mm%2!=0){
					System.out.println("D");
				}else if(nn%2==0&&mm%2==0){
					System.out.println("U");
				}else if(nn%2!=0&&mm%2==0){
					System.out.println("U");
				}
			}
		}
	} 
} 