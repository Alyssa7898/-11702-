
public class SampleFactory {
  public static Actor CreateActor(String name) {
	if (name.equals("æÏ¶ğ")) {
		return new Change();
	}
	if (name.equals("ºóôà")) {
		return new Houyi();
	}
	return null;
	  
  }
}
