
public class SampleFactory {
  public static Actor CreateActor(String name) {
	if (name.equals("�϶�")) {
		return new Change();
	}
	if (name.equals("����")) {
		return new Houyi();
	}
	return null;
	  
  }
}
