
public class PrettyLog implements Log {

	@Override
	public void write(String data) {
		// TODO Auto-generated method stub
		System.out.println("*************");
		System.out.println(data);
		System.out.println("*************");
	}

}
