package java0407.graph;

public class Round extends Graph {
    int r;
    Double area;
    @Override
    public final void roundWay() {
        super.roundWay();
        this.r=3;
        area=Math.PI*(r*r);
        System.out.println("圆形的面积是"+area);
    }
}
