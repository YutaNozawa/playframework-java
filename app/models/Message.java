package models;

import java.util.Date;
import java.util.List;

import javax.persistance.*;
import javax.validation.*;

import com.sun.javafx.beans.IDProperty;
import play.db.ebean.*;
import play.data.validation.*;

@Entity
public class Message extends Model {

    @Id
    public Long id;
    public String name;
    public String mail;
    public String message;
    public Date postdate;
}
