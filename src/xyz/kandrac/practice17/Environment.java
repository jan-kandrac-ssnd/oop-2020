package xyz.kandrac.practice17;

public enum Environment {
    DEV("dev.google.com/"), PROD("google.com/");

    private final String url;

    String getFullUrl(String path) {
        return url + path;
    }

    Environment(String url) {
        this.url = url;
    }
}
