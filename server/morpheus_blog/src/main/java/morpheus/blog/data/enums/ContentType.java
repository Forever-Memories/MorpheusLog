package morpheus.blog.data.enums;


public enum ContentType {
    TECHNOLOGY(1, "techonology");

    private int value;

    private String name;

    ContentType(int value, String name) {
        this.value = value;
        this.name = name;
    }

}
