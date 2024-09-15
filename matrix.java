import java.util.Scanner; //pro5

class matrix
{
    
    int [][] arr={{1,1,1},{2,2,2},{3,3,3}};
    int [][]arr1={{1,1,1},{2,2,2},{3,3,3}};

    void display()
    {
        System.out.println("first matrix:");
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Second matrix:");
        for (int i = 0; i<3; i++) {
            for (int j = 0; j<3; j++) {

                 System.out.print(arr[i][j]+" ");
              }
        System.out.println();
        }

    }
    void addition()
    {
        int [][]addMatrix=new int[3][3];
        System.out.println("Addition of Two matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 addMatrix[i][j]=arr[i][j]+arr1[i][j];
                 System.out.print(addMatrix[i][j]+" ");
            }
            System.out.println();
        }
       
        
    }
    void substraction()
    {
        int [][]addMatrix=new int[3][3];
        System.out.println("substraction of Two matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 addMatrix[i][j]=arr[i][j]-arr1[i][j];
                 System.out.print(addMatrix[i][j]+" ");
            }
            System.out.println();
        }
       
        
    }
    void multiplication()
    {
        int [][]addMatrix=new int[3][3];
        System.out.println("multiplication of Two matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                 addMatrix[i][j]+=arr[i][k]*arr1[k][j];
                }
             
            }
            
        }
      
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 System.out.print(addMatrix[i][j]+" ");
            }
            System.out.println();
   
        }   
    }

}

public class pro5 {
    public static void main(String[] args) {
        matrix mm=new matrix();
        Scanner obj = new Scanner(System.in);
        
        while (true) {

            System.out.println("1:Display Matrix");
            System.out.println("2:Addition Of Matrix");
            System.out.println("3:substraction Of Matrix");
            System.out.println("4:multiplication of Matrix");
            System.out.println("5:Exit");
            System.out.println("Enetr your choice");
            int choice = obj.nextInt();

            switch (choice) {
                case 1:mm.display();
                       break;
                case 2:mm.addition();
                       break;
                case 3:mm.substraction();
                      break;
                case 4:mm.multiplication();
                       break;
                case 5:System.exit(1);

                default:
                    break;
            }

        }
    }
}