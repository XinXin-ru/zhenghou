package java0407.graph;

public class Square extends Graph {
    Double chang;
    Double kuan;
    Double area;
    @Override
    public final void squareWay() {
        super.squareWay();
        this.chang=6.0;
        this.kuan=3.0;
        area=chang*kuan;
        System.out.println("正方形的面积是"+area);
    }
}
