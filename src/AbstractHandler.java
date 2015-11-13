/**
 * Created by javajiale on 2015/11/13.
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler(){
        return handler;
    }

    public void setHandler(Handler handler){
        this.handler = handler;
    }
}
