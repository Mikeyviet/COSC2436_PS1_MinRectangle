# COSC2436_PS1_MinRectangle

Write a program that finds the minimal number of groupings in a matrix. The user will enter the size 
of the rows and columns in the range [2,8] from the keyboard. Error check input size. The program 
then will randomly fill the numbers 0 and 1 into the matrix and outputs to the screen the matrix and the 
minimum number of rectangles/squares that cover all the 1 values in the matrix. The size of a 
rectangle/square is defined by the number of 1's in it. Here are the rules in forming groups of ones

<img width="495" alt="image" src="https://user-images.githubusercontent.com/98675293/192648646-d786cfef-50b9-4796-99aa-5b343161419d.png">
<img width="485" alt="image" src="https://user-images.githubusercontent.com/98675293/192648724-0f430b0f-b278-42d3-b926-ec84fcdf35ea.png">
<img width="606" alt="image" src="https://user-images.githubusercontent.com/98675293/192648766-21600da2-c7a2-4546-83df-b719e92ebdc9.png">
<img width="591" alt="image" src="https://user-images.githubusercontent.com/98675293/192648788-efb159ce-1797-4348-918d-f8d07bd6fce7.png">
<img width="587" alt="image" src="https://user-images.githubusercontent.com/98675293/192648882-c99f596e-f734-4386-9db5-43517707b467.png">
<img width="609" alt="image" src="https://user-images.githubusercontent.com/98675293/192648905-6a59b83f-d134-4b98-9102-a2fcc4ed4c58.png">

• No Zeroes allowed
• No diagonals. 
• Only power of 2 number of cells in each group. 
• Groups should be as large as possible. 
• Every 1 must be in at least one group. 
• Overlapping and wrap around allowed. 
• Get the fewest number of groups possible.

Sample Run with output and pattern found
<img width="679" alt="image" src="https://user-images.githubusercontent.com/98675293/192649086-e2295888-571c-4624-a08e-51749b1e6556.png">
