class MathOper3 {

    public MathOper3(){
        N1=125;
        N2=75;
}

        int N1=0;
        int N2=0;

     int Sum(){return N1+N2;}
     int Diff(){return N1-N2;}
     int Prod(){return N1*N2;}
     int Quot(){return N1/N2;}
     int Rem(){return N1%N2;}  

       void dispSummary(){
       System.out.println("Sum = " + Sum());
       System.out.println("Difference = " + Diff());
       System.out.println("Product = " + Prod());
       System.out.println("Quotient = " + Quot());
       System.out.println("Remainder = " + Rem());
  }
}
