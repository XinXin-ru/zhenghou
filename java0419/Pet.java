package java0419;


import java0416.dog.Dogs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pet {
        String name;
        String type;
        static Set petSet=new HashSet();
        //静态代码块
        static {
            Pet g1=new Pet();
            g1.name="欧欧";
            g1.type="雪纳瑞";

            Pet g2=new Pet();
            g2.name="亚亚";
            g2.type="拉布拉多";

            Pet g3=new Pet();
            g3.name="菲菲";
            g3.type="拉布拉多";

            Pet g4=new Pet();
            g4.name="美美";
            g4.type="雪纳瑞";

            petSet.add(g1);
            petSet.add(g2);
            petSet.add(g3);
            petSet.add(g4);
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
