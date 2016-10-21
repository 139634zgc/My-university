import java.util.Scanner;
public class HW1 {
	public static void main(String[] args) {
		System.out.println("输入序列：");
		Scanner input = new Scanner(System.in);
	String a = input.nextLine();
	int y;
	int max, j;
	char[] arry = a.toCharArray();
	int[] b = new int[95];
	for (int i = 0; i < a.length(); i++) {
		y = (int) arry[i] - 32;
		b[y]++;
	}
	max = b[0];
	j = 0;
	for (int i = 1; i < 95; i++) {
		if (b[i] > max) {
			max=b[i];
			j = i;
		}
	}
	j = j + 32;
	char c = (char) j;
	System.out.println("众数为"+c);
	}
}
