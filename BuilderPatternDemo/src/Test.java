
public class Test {
 public static void main(String[] args) {
	 ConceretBuilder conceretBuilder=new ConceretBuilder();
	 Product pro=conceretBuilder.bulidA("����").bulidB("������").bulidC("����").bulidD("����").build();
	 System.out.println(pro.toString());
	 }
}
