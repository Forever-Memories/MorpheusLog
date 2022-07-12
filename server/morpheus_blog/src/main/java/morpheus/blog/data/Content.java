package morpheus.blog.data;

import lombok.Data;
import morpheus.blog.data.enums.ContentStatus;
import morpheus.blog.data.enums.ContentType;

import java.util.List;

@Data
public class Content {
    private Long cid;
    private String title;
    private Long authorId;
    private String text;
    private List<Tag> tags;
    private ContentType type;
    private ContentStatus status;
    private Long createTime;
    private Long updateTime;
}
