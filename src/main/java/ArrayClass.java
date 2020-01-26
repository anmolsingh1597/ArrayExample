

public class ArrayClass {
    public static void main(String[] args) {
        int a[];
        int[] b;
        int c[] = new int[5];
        c[4] = 60;
        a = new int[2];
        a[0] = 100;
        a[1] = 200;
        int d[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(d.length);

        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }

        int[] x, y;// both x and y integers
        int x1, y1[]; // x1 int, y1 array
        // int x2,[]y2; //not allowed
        int x3[], y3; //x3 array y3 int
        int[] x4, y4[]; //x4 1D array,y4 2D array
        y4 = new int[3][3];
        System.out.println("Using Compat for(:)"); //compat method
        for (int p : d) {
            System.out.println(p);

        }
        exercise();
    }

    public static void exercise() {
        int array[] = new int[]{12, 15, 19, 15, 20};
        System.out.println(array[4]);
        int min = array[0];
        int max = array[0];
        int sum = array[0];
        for (int k = 0; k < array.length; k++) {
            System.out.println("ArrayElement: " + array[k]);
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
            sum = sum + array[i];
        }

        float avg = (float) sum / array.length;
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);
        int y = array.length - 1;
        for (int j = y; j >= 0; j--) {
            System.out.println("Reverse-array: " + array[j]);
        }

        String stringarray[] = new String[]{"Aman", "Anmol", "Ishant", "Ikroop", "Monica", "Kritima"};

        for (int g = 0; g < stringarray.length; g++) {
            System.out.println("String: " + stringarray[g]);
        }
        String str[];
        str = new String[10];
        str[0] = "Canada";
        str[1] = "India";
        str[2] = "Nepal";
        str[3] = "Toronto";
        str[4] = "New York";
        str[5] = "Patel";
        str[6] = "Raman";
        str[7] = "Inshantt";
        str[8] = "Scarborough";
        str[9] = "North York";

        for (int h = 0; h < str.length; h++) {
            System.out.println("Array: " + str[h]);
        }
        System.out.println("---------Reverse Strings----------");
        /*for (int k = 0; k < str.length - 1; k++) {

            System.out.println(str[k] + " <=> " + reverseString(str[k]));

        }*/
        for(int l=0;l<str.length-1;l++) {
            System.out.println(str[l] + " <=> " + reverseString(str[l])+" <=> "+stringManipulation(str[l]));
        }
    }

    public static String reverseString(String s) {
        char ch[] = s.toCharArray();
        String rev = "";
        for (int i = ch.length - 1; i >= 0; i--) {
            rev += ch[i];
        }
        return rev;
    }
        public static String stringManipulation(String s){
        int i=s.length();
        char temp;
        char temporary;
        char tempor;
        char ch[] = s.toCharArray();
        String str="";
         if (i%2==0){
            for(int j=0;j<i;j++){
                temp=ch[j];
                ch[j]=ch[j+1];
                ch[j+1]=temp;
                j++;
//              return s.charAt(s.length()-1)+s.substring(0, s.length()-1);
            } str=new String(ch);
             }else{

            /* temporary=s.charAt(s.length()-1);
             temp =ch[(s.length()/2)];
             tempor=temporary;
             temporary=temp;
             temp=tempor;*/
            temp=ch[s.length()-1];
            ch[s.length()-1]=ch[s.length()/2];
            ch[s.length()/2]=temp;
             str=new String(ch);
//             str=s.replace(s.charAt((s.length()-1)),temp);
//             str=s.replace(s.charAt((s.length()/2)),temporary);


//              ch[(s.length()/2)+1]=temporary;
//             str=s.replace()
             System.out.println(str);
             for(int k=0;k<i;k++){
                 /*if(k==(str.length()/2)+1){
                     k++;
//                     goto 126;
                 }
                 else{*/
                   temp=ch[k];
                   ch[k]=ch[k+1];
                   ch[k+1]=temp;
                   k++;
//                 }


             }
             str=new String(ch);
         /*   for(int k=0;k<i;k++){
                temporary=ch[k];
                ch[k]=ch[k+1];
                ch[k+1]=temporary;
                k++;
            } str=new String(ch);*/
// return s.charAt(s.length()-1)+s.substring(s.length()/2,s.length()-1);
        }
        return str;
//            return ch;
        }
}