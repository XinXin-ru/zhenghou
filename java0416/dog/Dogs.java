package java0416.dog;

import java.util.ArrayList;
import java.util.List;

public class Dogs {
    String name;
    String type;
    static List<Dogs> dogsLists=new ArrayList<Dogs>();
    //静态代码块
    static {
        Dogs g1=new Dogs();
        g1.name="欧欧";
        g1.type="雪纳瑞";

        Dogs g2=new Dogs();
        g2.name="亚亚";
        g2.type="拉布拉多";

        Dogs g3=new Dogs();
        g3.name="菲菲";
        g3.type="拉布拉多";

        Dogs g4=new Dogs();
        g4.name="美美";
        g4.type="雪纳瑞";

        dogsLists.add(g1);
        dogsLists.add(g2);
        dogsLists.add(g3);
        dogsLists.add(g4);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
