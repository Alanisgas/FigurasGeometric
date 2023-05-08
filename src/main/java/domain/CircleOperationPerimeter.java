package domain;

public class CircleOperationPerimeter {
    public static double calculatePerimeter(IShape iShape){
        double totalPerimeterCir=(iShape.perimeter());
        System.out.println("totalPerimeterCir = " + totalPerimeterCir);
        return totalPerimeterCir;

    }
}
