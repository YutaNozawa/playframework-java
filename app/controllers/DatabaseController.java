package controllers;


import play.mvc.Controller;
import play.mvc.Result;
import views.html.Database.index;
import views.html.Database.add;
import java.util.*;
import services.*;
import models.*;
import play.data.Form;

public class DatabaseController extends Controller {

    public Result index() {

        List<Message> datas = Message.find.all();

        return ok(index.render("データベースのサンプル", datas));
    }

    public Result create() {
        //フォームで入力したデータを取得
        Form<Message> f = Form.form(Message.class).bindFromRequest();

        if (!f.hasErrors()) {

            //fからデータを取得
            Message data = f.get();

            //フォームのデータを保存
            data.save();

            //リダイレクト
            return redirect("/");
        } else {
            //エラーが起きたら、ERRORメッセージとfの内容を出力
            return badRequest(add.render("ERROR", f));
        }
    }

    public Result add() {
        Form<Message> f = Form.form(Message.class);

        return ok(add.render("投稿フォーム", f));
    }
}
