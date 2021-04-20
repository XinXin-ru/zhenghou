package java0419;

import java.util.Iterator;

public class DogsHashSet {
    public static void main(String[] args) {
        System.out.println("共有"+ Pet.petSet.size()+"条狗");
        System.out.println("分别是：");

        Pet g;
        for (Object o:Pet.petSet
             ) {
            //强转，Pet中无泛型<>
            g = (Pet) o;
            System.out.println(g.getName()+"  "+g.getType());
        }
        System.out.println("******************************");
        Iterator iterator=Pet.petSet.iterator();
        while (iterator.hasNext()){
            g= (Pet) iterator.next();
            System.out.println(g.getName()+"  "+g.getType());
        }
    }
}
