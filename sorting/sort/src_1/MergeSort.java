
public class MergeSort {

	 private static int[] a;
		public static void sort() {

			int[] arr = new int[a.length];

			mergeSort(arr, 0, a.length - 1);
		}

		public static void mergeSort(int[] arr, int left, int right) 
		{
			if (left == right) 
			{
				return;
			} 
			else 
			{
				int mid = (left + right) / 2;

				mergeSort(arr, left, mid);

				mergeSort(arr, mid + 1, right);

				merge(arr, left, mid + 1, right);
			}
		}

		public static void merge(int[] arr, int lowerIndexCursor, int higerIndex, int upperIndex) 
		{
			int tempIndex = 0;

			int lowerIndex = lowerIndexCursor;

			int midIndex = higerIndex - 1;

			int totalItems = upperIndex - lowerIndex + 1;

			while (lowerIndex <= midIndex && higerIndex <= upperIndex) {

				if (a[lowerIndex] > a[higerIndex]) {

					arr[tempIndex++] = a[lowerIndex++];

				} else {

					arr[tempIndex++] = a[higerIndex++];

				}
			}

			while (lowerIndex <= midIndex) {

				arr[tempIndex++] = a[lowerIndex++];

			}

			while (higerIndex <= upperIndex) {

				arr[tempIndex++] = a[higerIndex++];

			}

			for (int i = 0; i < totalItems; i++) {

				a[lowerIndexCursor + i] = arr[i];

			}
		}

		public static void printArray(int[] array) 
		{
			for (int i : array) {

				System.out.print(i + " ");
			}
		}

		public static int[] getArray() {

			int size = 10;

			int[] array = {12,32,8,38,14,75,16,55,46,25};

			int item = 0;

			for (int i = 0; i < array.length; i++) {
			}

			return array;
		}
		public static void main(String[] args) 
		{
			a = getArray();
			printArray(a);
			sort();
			System.out.println();
			printArray(a);
		}
}