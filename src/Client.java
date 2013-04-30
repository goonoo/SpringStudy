
public class Client {
	private Log log;
	
	public Client(Log log) {
		this.log = log;
	}
	
	public void bizLogic(String log) {
		this.log.write("loooooooooooog");
	}
}
