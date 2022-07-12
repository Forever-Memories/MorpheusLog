package morpheus.blog.data.enums;

public enum ContentStatus {
    PENDING_REVIEW(1, "pending_review"),
    PUBLISHED(2,"published"),
    DENY(3, "deny"),
    DELETED(4, "deleted");


    private int value;

    private String name;

    ContentStatus(int value, String name) {
        this.value = value;
        this.name = name;
    }
}
