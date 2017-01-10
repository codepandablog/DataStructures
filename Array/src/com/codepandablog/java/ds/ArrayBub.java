package test1;

public class ArrayBub {

	private long[] a;
	private int nElems;

	// --------------------------------------------------------------
	public ArrayBub(int max) // constructor
	{
		a = new long[max];
		nElems = 0;
	}

	// --------------------------------------------------------------
	public void insert(long value) // put element into array
	{
		a[nElems] = value;
		nElems++;
	}

	// --------------------------------------------------------------
	public void display() {
		for (int j = 0; j < nElems; j++) // for each element,
			System.out.print(a[j] + " "); // display it
		System.out.println("");
	}

	// --------------------------------------------------------------
	public void bubbleSort() {

		int in,out;
		for (out = nElems-1; out >1; out--) {
			for (in = 0; in < out; in++) {
				if(a[in]>a[in+1])
					swap(in,in+1);
			}
		}
	}
	//---------------------------------------------------------------
	public void selectionSort() {
		int out,in,min;
		for (out = 0; out < nElems-1; out++) {
			min=out;
			for (in = out+1; in < nElems; in++) {
				if(a[in]<a[min]){
					min=in;
				}
				swap(out,min);
			}
		}
	}
	//---------------------------------------------------------------
	public void insertionSort() {
		int out,in;
		for (out = 1; out < nElems-1; out++) {
			long temp=a[out];
			in=out;
			while (in>0 && a[in-1]>=temp) {
				a[in]=a[in-1];
				--in;
			}
			a[in]=temp;
		}
	}
	// --------------------------------------------------------------
	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
