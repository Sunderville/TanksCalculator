package sample.config;

import java.io.InputStream;
import java.util.Properties;


// Класс пока не используется

public class Config {

    public static final float ETC50 = Float.parseFloat("etc50");
    public static final float ETC100 = Float.parseFloat("etc100");
    public static final float ETC200 = Float.parseFloat("etc200");
    public static final float ETC300 = Float.parseFloat("etc300");
    public static final float ETC400 = Float.parseFloat("etc400");
    public static final float ETC500 = Float.parseFloat("etc500");
    public static final float ETC700 = Float.parseFloat("etc700");
    public static final float ETC1000 = Float.parseFloat("etc1000");
    public static final float ETC2000 = Float.parseFloat("etc2000");
    public static final float ETC3000 = Float.parseFloat("etc3000");
    public static final float ETC5000_12 = Float.parseFloat("etc5000_12");
    public static final float ETC5000_15 = Float.parseFloat("etc5000_15");
    public static final float ETC10000_12 = Float.parseFloat("etc10000_12");
    public static final float ETC10000_18 = Float.parseFloat("etc10000_18");
    public static final float ETC20000 = Float.parseFloat("etc20000");
    public static final float ETC30000 = Float.parseFloat("etc30000");
    public static final float ETC50000 = Float.parseFloat("etc50000");

    private static Properties properties = new Properties();

    public synchronized static String getProperty(String number) {
        if (properties.isEmpty()) {
            try (InputStream is = Config.class.getClassLoader()
                    .getResourceAsStream("Technical_data.properties")) {

                properties.load(is);

            } catch (Exception ex) {
                ex.printStackTrace();
                throw new RuntimeException(ex);
            }
        }
        return properties.getProperty(number);
    }

}
