import java.util.*;
public class sum2matrix{
    public static void main(String[] args) {
        int m1[][]={{1,2,3},{1,2,3},{1,1,1}};
        int m2[][]={{1,2,1},{1,1,1},{1,2,4}};
        int m3[][]=new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){           
                 m3[i][j]=m1[i][j]+m2[i][j];  
                 System.out.print(m3[i][j]);                 
         

        }
        System.out.println(" ");
    }
}}