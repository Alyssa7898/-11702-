/**
 * 产品组件
 * @author Administrator
 *
 */
public class Product {
	private String builderA="汉堡";
    private String builderB="薯条";
    private String builderC="可乐";
    private String builderD="鸡翅";
    public String getBuilderA() {
		return builderA;
	}
	public void setBuilderA(String builderA) {
		this.builderA = builderA;
	}
	public String getBuilderB() {
		return builderB;
	}
	public void setBuilderB(String builderB) {
		this.builderB = builderB;
	}
	public String getBuilderC() {
		return builderC;
	}
	public void setBuilderC(String builderC) {
		this.builderC = builderC;
	}
	public String getBuilderD() {
		return builderD;
	}
	public void setBuilderD(String builderD) {
		this.builderD = builderD;
	}
	
  @Override
public String toString() {
	// TODO Auto-generated method stub
	return "套餐为："+builderA+'\n'+builderB+'\n'+builderC+'\n'+builderD;
}
}
