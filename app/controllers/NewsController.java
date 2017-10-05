package controllers;

import play.mvc.*;
import views.html.News.index;

public class NewsController extends Controller {

    public Result index() {

        //セッションの設定
        session("connected", "hagezawavita@gmail.com");

        //セッションの取得
        String user = session("connected");

        if (user == null) {
            //承認失敗時のエラー
            return unauthorized("please set string");
        }

        if (user != null) {
            //セッションのクリア
            session().clear();
            user = "no session";
        }

        return ok(index.render(user));
    }
}
