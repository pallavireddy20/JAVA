public class Operatorpre{
    public static void main(String[] args) {
         // precedence & Associativity
        //int a = 6*5-34/2;
        /*
        highest precendence goes to * and /. they are then evaluated on the basis of left to right associativity
        =30-34/2
        =30-17
        =13
         */
       // int b = 60/5-34*2;
        /*

         =12-34*2
         =12-68
         =-56
         */
         // System.out.println(a);
        //System.out.println(b);
        // Quick Quiz
       /*int x =6;
       int y =1;
       
        int k = x*y/2;
        System.out.println(k);*/
       int a =1;
       int b =2;
       int c =3;
      int   k = (b*b - 4*a*c)/2*a*c;
System.out.println(k);

        




    }
}