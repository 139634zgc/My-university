import java.util.Scanner;
public class HW2 {
	static int[][] a={{1,1,1},{2,2,2},{3,3,3}};
	static int length=a.length;
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		boolean result=search(a,num);	
		if(result)
			System.out.println("含有这个数");
		else
			System.out.println("不含这个数");
	}
	public static boolean search(int[][]a,int num) {
		
		int i=0;
		int start,end;
		boolean result=false;
		while((i<length)&&(a[i][length-1]<num)){
			i++;
		}
		start=i;
		if(start==length)
			return false;
		while((i<length)&&(a[i][0]<=num)){
			i++;
		}
		end=i-1;
		for(int j=start;j<=end;j++){
			result=searchfor(a[j],0,length-1,num);
			if(result)
				return result;
		}
		return false;
	}
	 // 用二分法查找有序数列，复杂度O（log2N）
	private static boolean searchfor(int[] is,int beg,int end,int num) {
		// TODO Auto-generated method stub
		if(is[(end+beg)/2]>num){
			return (searchfor(is, beg, (end+beg)/2-1, num));
		}else if(is[(end+beg)/2]<num) {
			return (searchfor(is, (end+beg)/2+1, end, num));
		}else {
			return true;
		}
	}
}
