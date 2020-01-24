

public class ArrayClass {
    public static void main(String[] args) {
        int a[];
        int []b;
        int c[] = new int[5];
        c[4]=60;
        a= new int [2];
        a[0]=100;
        a[1]=200;
        int d[]= new int []{1,2,3,4,5,6,7,8,9,10};
        System.out.println(d.length);

        for (int i=0;i<d.length;i++){
            System.out.println(d[i]);
        }

        int[] x,y;// both x and y integers
        int x1,y1[]; // x1 int, y1 array
        // int x2,[]y2; //not allowed
        int x3[],y3; //x3 array y3 int
        int[] x4, y4[]; //x4 1D array,y4 2D array
        y4 =new int [3][3];
        System.out.println("Using Compat for(:)"); //compat method
        for (int p:d){
            System.out.println(p);
            exercise();
        }

    }

    public static void exercise(){
        int array[]=new int[]{12,15,19,15,20};
         System.out.println(array[4]);
         int min= array[0];
         int max=array[0];
         int sum=array[0];
         for(int k=0;k<array.length;k++){
             System.out.println("ArrayElement: "+ array[k]);
         }
          for (int i=0;i<array.length;i++){
          if(array[i]<min){
            min=array[i];
         }
          if(array[i]>max){
              max=array[i];
          }
          sum=sum+array[i];

    }
float avg=(float)sum/array.length;
          System.out.println("Minimum: "+min);
          System.out.println("Maximum: "+max);
          System.out.println("Sum: "+sum);
          System.out.println("Average: "+avg);
          int y= array.length-1;
          for (int j=y;j>=0;j--)
          {
              System.out.println("Reverse-array: "+array[j]);
          }
        String stringarray[]=new String[]{"Aman","Anmol","Ishant","Ikroop","Monica","Kritima"};
          for(int g=0;g<stringarray.length;g++){
              System.out.println("String: "+stringarray[g]);
          }
    }

}

