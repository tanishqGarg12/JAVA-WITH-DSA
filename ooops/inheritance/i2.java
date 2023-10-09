// package ooops.inh    eritance;
class animal{
    void didp(){
        System.out.println("hello i m tiger");}
}
class tiger extends animal
{   
}
class baby_tiger extends tiger
{
}
public class i2 {
    public static void main(String[] args) 
    {
        baby_tiger d = new baby_tiger();
        d.didp();
    }
}
