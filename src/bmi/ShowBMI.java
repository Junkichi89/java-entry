package bmi;

public class ShowBMI {
	/*
	 * BMI （体格指数）を計算するプログラム
	 * BMI =  体重 / (身長 * 身長) 
	 * 体重 kg 、身長 cm
	 * 
	 */
	public static void main(String[] args) {
		double weight, height, bmi;
		
		weight = Integer.parseInt(args[0]);
		height = Integer.parseInt(args[1]);
		height /= 100;
		
		bmi = weight / ( height * height);
		System.out.println(bmi);
	}

}
