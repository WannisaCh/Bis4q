package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }
    public  static Result About() {
        return ok(About.render());
    }
    public  static Result More() {
        return ok(More.render());
    }
    public  static Result Home() {
        return ok(index.render());
    }

}
