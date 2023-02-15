package projectA03;

import java.util.Arrays;

public class projectA0313 {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		
		int intArray2[];
		intArray2 = new int[10];
		
		float[] floatArray = new float[5];
		float[] floatArray2 = {0.1f, 0.2f, 0.3f}; // float임을 나타내기 위해 f 붙임
				
		System.out.println("intArray length="+intArray.length);
		System.out.println(Arrays.toString(floatArray2));
		
		System.out.println(intArray);
		System.out.println(intArray2);
		System.out.println(floatArray);
		System.out.println(floatArray2);
	}

}
