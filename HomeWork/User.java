public class User{
	private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
		
	@Override
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append(name);
		return res.toString();
	}
}