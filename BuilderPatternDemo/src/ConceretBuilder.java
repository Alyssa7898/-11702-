
public class ConceretBuilder implements Builder{
    private Product pro;
    public ConceretBuilder() {
		// TODO Auto-generated constructor stub
    	pro=new Product();
	}
	@Override
	public Builder bulidA(String name) {
		// TODO Auto-generated method stub
		pro.setBuilderA(name);
		return this;
	}

	@Override
	public Builder bulidB(String name) {
		// TODO Auto-generated method stub
		pro.setBuilderB(name);
		return this;
	}

	@Override
	public Builder bulidC(String name) {
		// TODO Auto-generated method stub
		pro.setBuilderC(name);
		return this;
	}

	@Override
	public Builder bulidD(String name) {
		pro.setBuilderD(name);
		return this;
	}
	@Override
	public Product build() {
		// TODO Auto-generated method stub
		return pro;
	}

}
