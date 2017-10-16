package controllers;

import models.*;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Database.index;
import java.util.*;

public class DatabaseController extends Controller {

    public Result index() {

        List<Message> datas = Message.find.all();

        return ok(index.render("データベースのサンプル", datas));
    }
}
