package entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "notification_content")
public class NotificationContentEntity implements Serializable {
    private int id;
    private String content;

    @Id
    @Column(name = "no_content_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "no_content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
