class cast{
	public static void main(String[] args){
		// 成绩57.6分，加五分，的多少？
		double score = 57.6;
		score = score + 5;
		System.out.println("score = " + score);

		// 得到整数成绩
		int result = (int)score; //强制类型转换时，可能存在精度丢失
		System.out.println(result);
	}
}