public class HW3 {
	public static void main(String[] args) {
		int a[]={1,2,3,4};
		int length=a.length;
		int[] left = new int[length];
		int[] right = new int[length];
		System.out.println("原数组：");
		for(int i=0;i<length;i++)
			System.out.print(a[i]+" ");
		System.out.println("");
		System.out.println("更新后数组：");
		right[length-1]=left[0]=1;
		for(int i=1;i<length;i++)
		{
			right[length-i-1]=right[length-i]*a[length-i];
			left[i]=left[i-1]*a[i-1];	
		}		
		for(int i=0;i<length;i++){
			a[i]=left[i]*right[i];
			System.out.print(a[i]+" ");
		}		}			
}
