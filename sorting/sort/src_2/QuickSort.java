
public class QuickSort {

	private static int[] a;

	public static void sort()
	{
		int left = 0;
		int right = a.length - 1;

		quickSort(left, right);
	}

	private static void quickSort(int left, int right) {
		if (left >= right)
			return;
		int pivot = a[right];
		int partition = partitionFunc(left, right, pivot);
		quickSort(left, partition - 1);
		quickSort(partition + 1, right);
	}

	private static int partitionFunc(int left, int right, int pivot) {
		int leftPointer = left - 1;
		int rightPointer = right;

		while (leftPointer < rightPointer) {
			while (a[++leftPointer] < pivot);

			while (rightPointer > 0 && a[--rightPointer] > pivot);

			if (leftPointer >= rightPointer) {
				break;
			}

			else {
				swap(leftPointer, rightPointer);
			}
		}

		swap(leftPointer, right);  //right=pivot

		return leftPointer;
	}

	public static void swap(int left, int right) {
		int temp = a[left];
		a[left] = a[right];
		a[right] = temp;
	}

	public static void printArray() {

		for (int i : a) {

			System.out.print(i + " ");
		}
	}

	public static int[] getArray() {

		int size = 10;

		int[] array = {2,6,3,8,4,7,9,45,5};

		int item = 0;

		for (int i = 0; i <array.length; i++) {
			
		}
		return array;
	}

	public static void main(String[] args) {
		a = getArray();
		printArray();
		sort();
		System.out.println(" ");
		printArray();
	}
}