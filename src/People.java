/**
 * Created by javajiale on 2015/11/13.
 */
public class People extends AbstractHandler implements Handler{
    private String id;
    private String name;
    private String position;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public People(String id,String name,String position){
        this.id = id;
        this.name = name;
        this.position = position;
    }

    @Override
    public void operator(int type){
        BehaveFactory i = BehaveFactory.getInstance();
        Behave b = i.produce(type);
        print();
        b.behave();
        if(getHandler()!=null&&type==3)
            getHandler().operator(3);
    }
    public void operator(int type, int who){
        BehaveFactory i = BehaveFactory.getInstance();
        Behave b = i.produce(type);
        if(getHandler()!=null&&!id.equals( String.valueOf("00"+String.valueOf(who))))
            getHandler().operator(2,who);
        else {
            System.out.println(name + position);
            print();
            b.behave();
        }
    }

    public void print(){
        System.out.print(id + name + position + "接受命令");
    }



}
