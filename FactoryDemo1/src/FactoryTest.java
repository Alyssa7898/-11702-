
public class FactoryTest {
   public static void main(String arg[]) {
	   Actor a1=SampleFactory.CreateActor("�϶�");
	   a1.speaking();
	   Actor a2=SampleFactory.CreateActor("����");
	  a2.speaking();
   }
}
