package redirect.servlet.src;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 77855548887L;
	
	private String nick;
	private int footsize;
	
	public Person(){
		this.nick = "";
		this.footsize = 0;
	}
	
	public Person(String nick, int footsize){
		this.nick = nick;
		this.footsize = footsize;
	}
	
	public String getNick(){
		return nick;
	}
	
	public void setNick(String nick){
		this.nick = nick;
	}
	
	public int getFootsize(){
		return footsize;
	}
	
	public void setFootsize(int footsize){
		this.footsize = footsize;
	}
}
