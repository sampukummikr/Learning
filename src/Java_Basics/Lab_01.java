package Java_Basics;

public class Lab_01
{
    public static void main(String[] args)
    {
        //int a = 10;
//        System.out.println ("Heloo adiyen let us run");
//        System.out.print ("Heloo adiyen let us run");
//        System.out.print ("2Heloo adiyen let us run");
//        System.out.printf ("Heloo adiyen let us run and a is %d",a);
        // Table of 9 using printf command only
        int c = 9;
        int i = 1;
        ninetables(c,i);

    }
    public static void ninetables(int c,int i)
   {
            System.out.printf("printing nine tables %d*%d=%d\n", c, i, (c * i));
           if (i<10)
           {
               i++;
               ninetables (c,i);
           }
          // else return;
   }



}
