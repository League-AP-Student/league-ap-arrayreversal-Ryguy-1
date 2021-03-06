import java.util.ArrayList;

public class ArrayUtil {
	
	/** Reverse elements of array arr
	*   Precondition: arr.length > 0.
	*   Postcondition: The elements of arr have been reversed
	*   @param arr the array to manipulate
	*/
	public static void reverseArray(int[] arr){
		
		ArrayList<Integer> integerAL = new ArrayList<Integer>();
		
		for (int i = arr.length-1; i>=0; i--) {
			integerAL.add(arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i]=integerAL.get(i);
		}
		
}
}

class Matrix{
	private int[][] mat;
	
	public Matrix(int[][] m){
		mat = m;
	}
	
	/** Revereses the elements in each row of mat.
	*   Postcondition: The elements in each row have been reversed
	*/
	public void reverseAllRows(){
		for (int[] arr: mat) {
			ArrayUtil.reverseArray(arr);
		}
		
	}
	
	/** Reverses the elements of mat.
	*   Postcondition:
	*   - The final elements of mat, when read in row-major order, 
	*     are the same as the original elements of mat when read
	*     from the bottom corner, right to left, going upward.
	*   - mat[0][0] contains what was originally the last element.
	*   - mat[mat.length - 1][mat[0].length -1] contains what was
	*     originally the first element.
	*/
	public void reverseMatrix(){
		
		ArrayList<Integer> ints = new ArrayList<Integer>();
		
		for (int[] arr: mat) {
			ArrayUtil.reverseArray(arr);
		}
		
		//NEED HELP PLEASE EXPLAIN
		
		
		
	}
	
	public int[][] getIntArray(){
		return mat;
	}
}

