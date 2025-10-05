interface calc {
    void abstractcalc(int x,int y); //an abstract function
}
class myCalc{
    public static void main(String[] args) {
        calc add = (int x,int y) -> System.out.println(x+y);
        add.abstractcalc(3,9);
        calc mul = (int x,int y) -> System.out.println(x*y);
        mul.abstractcalc(3,9);
    }
}