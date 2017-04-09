package ipai;

public interface Interface {

	public void read();
}
interface Interface1 {
	public void write();
}

interface Interface2 extends Interface,Interface1{
	public void listent();
}

class TestInterface implements Interface2{
	@Override
	public void read() {
	
	}
	@Override
	public void write() {

	}

	@Override
	public void listent() {

	}
	
	
}
