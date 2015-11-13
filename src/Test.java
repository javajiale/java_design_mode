/**
 * Created by javajiale on 2015/11/13.
 */
public class Test {

    public static void main(String[] args){
        People people1 = new People("001","李四","员工");
        People people2 = new People("002","王五","员工");
        People people3 = new People("003","麻子六","员工");
        Command cmd = new MyCommand(people1);
        Boss boss = new Boss(cmd,"000","张三","CEO");
        people1.setHandler(people2);
        people2.setHandler(people3);
        boss.action();
    }
}
