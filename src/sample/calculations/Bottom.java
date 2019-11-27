package sample.calculations;

public class Bottom {

    private static int thiknessCenter = 0;
    private static int thiknessRim = 0;

    private static final int rimWidth = 1330;

    public static int getThiknessCenter() {
        return thiknessCenter;
    }

    public static void setThiknessCenter(int thiknessCenter) {
        Bottom.thiknessCenter = thiknessCenter;
    }

    public static int getThiknessRim() {
        return thiknessRim;
    }

    public static void setThiknessRim(int thiknessRim) {
        Bottom.thiknessRim = thiknessRim;
    }

    public static int getRimWidth() {
        return rimWidth;
    }
}
