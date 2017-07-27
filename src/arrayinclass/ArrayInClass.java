package arrayinclass;

import java.lang.reflect.Array;

public class ArrayInClass {
	
		public static void main( String[] args )
		{
			int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };
			int temp=0;
		
			// Display the original (unsorted values)
			System.out.print("before: ");
			for ( int i=0; i<arr.length; i++ )
				System.out.print( arr[i] + " " );
			System.out.println();
			
			
			// Swap the values around to put them ascending order.
			/*
			for ( ; ; )
			{
				for ( ; ; )
				{
					if ( )
					{
						// swap the values in two slots
					}
				}
			}
			*/

			// Display the values again, now (hopefully) sorted.
			
			for (int i=0; i < arr.length; i++){
				for (int j=i+1; j<arr.length; j++){
					if (arr[i]>arr[j]){
						temp=arr[j];
						arr[j]=arr[i];
						arr[i]=temp;
					}
				}
				
			}
		 
			System.out.print("after : ");
			for ( int i=0; i<arr.length; i++ )
				System.out.print( arr[i] + " " );
			System.out.println();
		}
	
}
