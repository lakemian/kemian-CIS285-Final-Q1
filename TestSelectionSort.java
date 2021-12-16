
class SelectionSortTest {

	@Test
	void test() {
		testPositive();
		testNegative();
		testMixed();
	}

	void testPositive()
	{
		int arr[] = {3,1,7,5,0};
		int correct[] = {0,1,3,5,7};

		SelectionSort.sort(arr);
		for(int x=0;x<arr.length;x++)
		{
			System.out.println(arr[x]);
		}
	}
	void testNegative()
	{
		int arr[] = {-3,-1,-7,-5,-9};
		int correct[] = {-9,-7,-5,-3,-1};

		SelectionSort.sort(arr);
		for(int x=0;x<arr.length;x++)
		{
			assert(arr[x]==correct[x]);
		}
	}
	void testMixed()
	{
		int arr[] = {-3,1,-7,5,0};
		int correct[] = {-7,-3,0,1,5};

		SelectionSort.sort(arr);
		for(int x=0;x<arr.length;x++)
		{
			assert(arr[x]==correct[x]);
		}
	}

}
