/**
 * 建造者
 * @author Administrator
 *
 */
public interface Builder {
    Builder bulidA(String name);
    Builder bulidB(String name);
    Builder bulidC(String name);
    Builder bulidD(String name);
    //获取套餐
    Product build();
}
