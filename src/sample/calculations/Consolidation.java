package sample.calculations;

public class Consolidation {

    private static float shell = 0;
    private static float bottom = 0;
    private static float roof = 0;
    private static float etc = 0;
    private static float steelType;



    public static float getResultMass() {
        float result = (shell + bottom + roof + etc) * steelType;


        return result;
    }





}
