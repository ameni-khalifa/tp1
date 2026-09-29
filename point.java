public class point {
    private  int abs;
    private  int ord;
    point(int x,int y)
    {
       abs=x;
       ord=y;


    }
    point(int a){
        abs=a;
        ord=2*a;
    }
    public void afficher(){
        System.out.println("abs=" + abs);
        System.out.println("ord=" + ord);
    }
    void translationhorizontale(int d){
        abs=abs+d;
    }
    void translationverticale(int d){
        ord=ord+d;
    }
    void translation(int d,int d1){
        abs+=d;
        ord+=d1;
    }
    public static void main(String[] args){
        point p=new point(2,3);
        //p.initialise(3,5);
        point p1=new point(2);
        //p1.initialise(2,2);
        p.afficher();
        p1.afficher();
        System.out.println("**********");

        p.translation(2,3);
        p.translationhorizontale(4);
        p.translationverticale(3);
        p.afficher();
        p1.afficher();


        
        
    }

}