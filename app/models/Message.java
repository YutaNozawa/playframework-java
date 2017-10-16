package models;

import java.util.*;
import javax.persistence.*;
import play.db.ebean.*;
import com.avaje.ebean.*;

@Entity
public class Message extends Model {

    @Id
    public Long id;

    public String name;
    public String mail;
    public String message;
    public Date postdate;

    public static Finder<Long, Message> find =
            new Finder<Long, Message>(Long.class, Message.class);

    @Override
    public String toString() {
        return ("[id:" + id + ", name:" + name + ", mail:" + mail +
        ", message:" + message + ", date:" + postdate + "]");
    }


}
