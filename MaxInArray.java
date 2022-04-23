//Finding max in array using Bubble sort

public class MaxInArray{
	static void max(int[] arr){
		int temp=0;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		int a = arr[arr.length-1];
		System.out.println(a);
	}

	public static void main(String[] args){
		int[] arr = new int[] {10,50,60,70};
		max(arr);
	}
}