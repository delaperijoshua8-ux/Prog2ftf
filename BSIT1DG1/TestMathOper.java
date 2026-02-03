class TestMathOper {
    public static void main(String Owen[]){
        MathOper3 object1, object2;
        object1= new MathOper3();
        System.out.println(object1.N1);
        System.out.println(object1.N2);
        object1.N1=25;
        object1.N2=75;
        System.out.println(object1.N1);
        System.out.println(object1.N2);

        object1.dispSummary();
       
    object2=new MathOper3(75,85);
    object2.dispSummary();

     
           
}

}
