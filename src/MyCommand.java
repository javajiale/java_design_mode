
/**
 * Created by javajiale on 2015/11/13.
 */
public class MyCommand implements Command{
    private People people;

    public MyCommand(People people){
        this.people = people;
    }

    @Override
    public void exe(int type){
        people.operator(type);
    }
    @Override
    public void exe(int type, int who){
        people.operator(type,who);
    }
}
