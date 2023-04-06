/* Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements...
 * Eg 1: nums = [0, 3, 0, 1, 12]                      nums = [1, 3, 12, 0, 0]
 * Eg 2: nums = [0]                                   nums = [0]
 */
import java.util.*;
public class Zeros 
{
    public void MoveZeros(int nums[])
    {
        int p = 0;    // variable to check the number of zeros...
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
                p++;     // Incrementing per zero found...
        }
        int array[] = new int[nums.length - p];     // Array created to store non-zero elements...
        int j = 0;     // Variable for iteration...
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                array[j] = nums[i];     // If element is non-zero, store it in new array...
                j++;    // Incrementing the loop variable...
            }
        }
        Arrays.sort(array);      // Sorting the non-zero numbers...
        int ar[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            if(i < array.length)
                ar[i] = array[i];     // Storing the answer in the new array defined...
            else
                ar[i] = 0;      // Storing the zeros at the right side of the array...
        }
        System.out.println("The Array formed is : ");
        for(int i = 0; i < nums.length; i++)
            System.out.print(ar[i]+", ");
        return;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter the array size : ");
        x = sc.nextInt();
        int arr[] = new int[x];
        for(int i = 0; i < x; i++)
        {
            System.out.print("Enter data : ");
            arr[i] = sc.nextInt();
        }
        Zeros zeros = new Zeros();       // Object creation...
        zeros.MoveZeros(arr);       // Function calling...
        sc.close();
    }
}

// Time Complexity  - O(n log n) space...
// Space Complexity - O(n) space...