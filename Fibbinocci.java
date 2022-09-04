package week1.sat;

public class Fibbinocci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstNum=0;
		int secNum=1;
		int sum=0;
		System.out.println(firstNum);
		for(int i=1;i<=9;i++){
			sum=firstNum+secNum;
			firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}
		
		
	}

}
