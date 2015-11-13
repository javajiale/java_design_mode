import java.util.Random;

/**
 * Created by javajiale on 2015/11/13.
 */
public class Boss {
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

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    private Command command;
    public Boss(Command command,String id,String name,String position)
    {
        this.command = command;
        this.id = id;
        this.name = name;
        this.position = position;
    }

    public void action(){
        int type = new Random().nextInt(2);
        if(type == 0) { // 新项目
            int who =  new Random().nextInt(3) + 1;
            print(who);
            command.exe(2, who);
            command.exe(3);
        }else { // 新快递
            print();
            command.exe(1);
        }
    }

    private void print(int who){
        System.out.println("有新项目");
        System.out.println(id + name + position + "发出加班命令");
        System.out.print(id + name + position + "发出出差命令给00" + who);

    }

    private void print (){
        System.out.println("有新快递");
        System.out.println(id + name + position + "发出拿快递命令");

    }

}
