
public class FactoryTest {
   public static void main(String arg[]) {
	   Actor a1=SampleFactory.CreateActor("æÏ¶ğ");
	   a1.speaking();
	   Actor a2=SampleFactory.CreateActor("ºóôà");
	  a2.speaking();
   }
}
