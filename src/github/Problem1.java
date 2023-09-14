package github;
//write a java program to find the largest of two numbers using conditional operator only &trace it
public class Problem1 {

	public static void main(String[] args) {
		int a=20;
		int b=40;
		int c=60;
		int res=(a>b&&a>c)?a:((b>c&&b>a)?b:c);
		System.out.println(res);

	}

}
