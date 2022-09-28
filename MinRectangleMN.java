/**------------------------------------------------------------------------
 * ABOUT
 * @author         :  Michael Nguyen
 * @email          :  michael.nguyen136448@my.tccd.edu
 * @repo           :  
 * @createdOn      :  September 12, 2022
 * @description    :  Write a program that finds the minimal number of 
 *  groupings in a matrix. The user will enter the size of the rows and 
 *  columns in the range [2,8] from the keyboard. Error check input size. 
 *  The program then will randomly fill the numbers 0 and 1 into the matrix 
 *  and outputs to the screen the matrix and the minimum number of 
 *  rectangles/squares that cover all the 1 values in the matrix. The size 
 *  of a rectangle/square is defined by the number of 1's in it. Here are 
 *  the rules in forming groups of ones: 
 *------------------------------------------------------------------------**/
// package programset_1_1;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MinRectangleMN {
    /**
     * @param args
     */
    public static void main(String[] args) {

        // Create a Scanner object for input
        var input = new Scanner(System.in);

        char choice = 'y';
        int rows = 0;
        int columns = 0;
        int total = 0;
        int countOfOnes = 0;   // Count of elements in row to check if all cells are 1



        do{
            // Prompt user for input
            System.out.println("This is a program that does something.");
            System.out.print("Enter the number of rows (2-8): ");
            // read in the number of rows
            rows = input.nextInt();
            System.out.print("Enter the number of columns (2-8): ");
            // read in the number of columns
            columns = input.nextInt();

            System.out.println();

            // Create a 2D array
            int[][] matrix = new int[rows][columns];

            // Create a 2D array to flag the columns if a 1 is found so that
            // the column is not counted again and the 1 found in column will
            // be grouped with the one directly above it
            boolean[][]flag = new boolean[rows][columns];

            // Fill the array with random 0's and 1'size
            for (int i = 0; i < matrix.length; i++) 
            {
                for (int j = 0; j < matrix[i].length; j++) 
                {
                    matrix[i][j] = (int) (Math.random() * 2);
                }
            }
            // Print the array in matrix form
            for (int i = 0; i < matrix.length; i++) 
            {
                for (int j = 0; j < matrix[i].length; j++) 
                {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();

            // Print out the array values in MATRIX FORM with indices to find pattern
            for(int i = 0; i < matrix.length; i++)
            {
                for(int j = 0; j < matrix[i].length; j++) 
                {
                    System.out.print("matrix[" + i + "][" + j + "] = " + matrix[i][j] + " ");
                }
                System.out.println();
            }

            System.out.println();

            // Print out the array values in 1 row with indices to find pattern
            // for(int i = 0; i < matrix.length; i++)
            // {
            //     for(int j = 0; j < matrix[i].length; j++) 
            //     {
            //         System.out.println("matrix[" + i + "][" + j + "] = " + matrix[i][j] + " ");
            //     }
            //     System.out.println();
            // }

            // Traverse the array and find all the 1's in the array
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[i].length; j++) 
                {
                    if(matrix[i][j] == 1) 
                    {
                        // 1 found, ready for vertical grouping
                        countOfOnes++;
                        flag[i][j] = true; 
                        if(j == 0)
                        {
                            total++;
                            System.out.println("Second Step: adding 1 found in 1st column. Total is now " + total);

                        } 
                        else if(matrix[i][j-1] == 0) 
                        {
                            total++;
                            System.out.println("Third Step: adding one found in column. The total is now " + total); 
                        }

                        // if(i > 0)
                        // {
                        //     if(matrix[i-1][j] == matrix[i][j])
                        //     {
                        //         total--;
                        //     }
                        // }


                    

                        // For the last cell in the column, if it has value of 1, need to check for value of 1 in first
                        // in the first column of current row
                        if(j == matrix[i].length - 1 && matrix[i][0] == 1) 
                        {
                            // 1 found in last column and 1 was also found in the first column so the total is reduced by 1
                            // because the grouping will wrap around to the first column
                            if(countOfOnes != columns)
                            {
                                total--;
                                System.out.println("Fourth Step: 1 Found in last column but subtracting previous one: " + total);
                            }
                            System.out.println("The number of columns is: " + columns);
                            System.out.println("The total is now " + total);

                            countOfOnes = 0;


                        }


                    }

                }
            }

            // Test print the total of 1's found horizontally grouped only in array
            System.out.println("The total number of 1's found grouped horizontally is: " + total);
            // Reset total to 0 for next run
            total = 0;

            System.out.println();
            // Ask user if they want to continue
            System.out.print("Do you want to continue? (y/n): ");
            choice = input.next().charAt(0);
            System.out.println();

        }while(choice != 'n');
    }
}