package java0419.hashmap;

import java.util.Map;

public class HashMap {
    String zName;
    String sex;
    static Map<String,HashMap> hachMap=new java.util.HashMap();
    static {
        HashMap p1=new HashMap();
        p1.zName="拉拉";
        p1.sex="女";

        HashMap p2=new HashMap();
        p2.zName="哈哈";
        p2.sex="女";

        HashMap p3=new HashMap();
        p3.zName="发发";
        p3.sex="男";

        hachMap.put("lala",p1);
        hachMap.put("haha",p2);
        hachMap.put("fafa",p3);
    }

    public String getzName() {
        return zName;
    }

    public void setzName(String zName) {
        this.zName = zName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
