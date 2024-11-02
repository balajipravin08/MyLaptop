import java.util.Scanner;
class Ap7
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter a size of row : ");
int row = sc.nextInt();
System.out.print("Enter a size of col : ");
int col = sc.nextInt();

int matrix[][]=new int[row][col];
int matrix1[][]=new int[row][col];
System.out.print("Enter a element for 1st : ");
for (int i=0;i<row;i++)
{
for (int j=0;j<col;j++)
{
matrix[i][j]=sc.nextInt();
}
}
System.out.println("Before transpose");
for (int i=0;i<row;i++)
{
for (int j=0;j<col;j++)
{
System.out.print(matrix[i][j]+" ");
}System.out.println();
}
System.out.println("After transpose");
for (int i=0;i<row;i++)
{
for (int j=0;j<col;j++)
{
System.out.print(matrix[j][i]+" ");
}System.out.println();
}

}
}
