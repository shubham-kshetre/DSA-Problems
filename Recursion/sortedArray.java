
class sortedArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		boolean sorted = checkSorted(arr, 0);
		if (sorted){
			System.out.println("Array is Sorted");
		}
		else {
			System.out.println("Array is not Sorted");
		}
	}

	public static boolean checkSorted(int[] arr,int i){
		if (i == arr.length-1){
			return true;
		}
		return arr[i] < arr[i+1] && checkSorted(arr, i+1);

	}
}
