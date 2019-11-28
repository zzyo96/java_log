import java.util.Scanner;

class input{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("输入一个正整数：");
		int num = input.nextInt();
		System.out.println(num % 2 == 0 ? "是偶数": "是奇数");
	}
}