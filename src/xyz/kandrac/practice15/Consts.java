package xyz.kandrac.practice15;

public class Consts {

    public static final Environment environment = Environment.PROD;


    private static final String devUrl = "dev.google.com";
    private static final String intUrl = "int.google.com";
    private static final String uatUrl = "uat.google.com";
    private static final String prodUrl = "google.com";

    public static final boolean isDebug = environment != Environment.PROD;
    public static final String url = environment.url;

    enum Environment {
        DEV(devUrl), INT(intUrl), UAT(uatUrl), PROD(prodUrl);

        public final String url;

        Environment(String url) {
            this.url = url;
        }
    }
}
