import java.util.Random;

/**
 * Created by javajiale on 2015/11/13.
 */
public class BehaveFactory {

    private static BehaveFactory instance = null;

    public static BehaveFactory getInstance(){
        if(instance == null){
            instance = new BehaveFactory();
        }
        return instance;
    }

    private BehaveFactory(){}
    public Behave produce(int type){
        if(1 == type){
            return new ExpressBehave();
        }
        if(2 == type){ // 出差
            return new GoBehave();
        }
        else{
           return new WorkBehave();
        }
    }
}
