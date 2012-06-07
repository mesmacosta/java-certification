/*
 * The Exam Lab explanation said I should study this program the day prior
 * to the exam.
 *
 * Result: It's allowed to redifine a property with the same name as
 * the parent's.
 * The one that gets called is the referenced by the type of the variable. In
 * other words, there's no such thing as "property polymorphism".
 */
public class Greek{

    int i=1;

    public int getI(){
        System.out.print("Super");
        return i;
    }

    public static void main(String arhs[]){
        Greek ga=new Arabik();
        System.out.print(ga.i+" "+ga.getI());
    }
}


class Arabik extends Greek{

    int i=2;

    public int getI(){
        System.out.print("Sub");
        return i;
    }

}
