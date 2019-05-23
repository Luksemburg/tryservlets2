package redirect.servlet.src;


public class SessData{
	String str;
	int val;
	double kf;
	
	SessData(String s, int x, double d){
		this.str = s;
		this.val = x;
		this.kf = d;
	}
	
	public String getStr(){
		return str;
	}
	
	public int getVal(){
		return val;
	}
	
	public double getKF(){
		return kf;
	}
	
	public static double radical(double base, double exponent){
		return Math.round(Math.pow(base, 1.0 / exponent) * 100.0) / 100.0;
	}
}
