import java.util.*;
    public class multi_pattern {
        public static void main(String[] args)
        {
            Scanner obj=new Scanner(System.in);
            System.out.print("Enter a positive integer");
            int n=obj.nextInt();
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    System.out.print(i*j+" ");
                }
                System.out.println();
            }

        }
    }

