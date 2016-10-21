import java.util.Scanner;

public class HW4 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		String before = input.next();
		int length = before.length() + 1;
		int[] arry = new int[length];
		char[] a = before.toCharArray();
		for (int k = 0; k < length - 1; k++) {
			arry[k + 1] = a[k] - '0';
		}
		sort(arry, length);
		if (arry[0] != 0)
			System.out.print(arry[0]);
		for (int i = 1; i < length; i++)
			System.out.print(arry[i]);
	}

	private static void sort(int[] arry, int length) {
		for (int i = 1; i < length; i++) { // 最前面第0个空间用于存储进位
			if (i == length - 1) {
				if (arry[i] != 9) {
					arry[i]++;
					if (arry[i - 1] != arry[i])
						break;
					else
						sort(arry, length);
				} else {
					arry[i] = 0;
					arry[i - 1]++;
					sort(arry, length);
				}
			} else {

				if ((arry[i + 1] == arry[i]) && (arry[i] != 9)) {
					arry[i + 1]++;
					for (int j = i + 2; j < length; j++) {
						if ((j - i - 2) % 2 == 0) {
							arry[j] = 0;
						} else {
							arry[j] = 1;
						}
					}
					break;
				} else if ((arry[i + 1] == arry[i]) && (arry[i] == 9)) {
					arry[i - 1]++;
					arry[i] = arry[i + 1] = 0;					
					sort(arry, length);
					break;
				}
			}
		}
	}
}