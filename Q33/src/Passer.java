public class Passer {
	int TD;
	int YD;
	int INT;
	int COMP;
	int ATT;

	public Passer(int TD, int YD, int INT, int COMP, int ATT) {
		this.TD = TD;
		this.YD = YD;
		this.INT = INT;
		this.COMP = COMP;
		this.ATT = ATT;
	}
	public double a(){
		return (this.COMP/this.ATT-.3)*5;
	}
	public double b(){
		return (this.YD/this.ATT-3)*.25;
	}
	public double c(){
		return (this.TD/this.ATT)*20;
	}
	public double d(){
		return 2.375-((this.INT/this.ATT)*25);
	}
	public double passerRating(){
		return (a()+b()+c()+d())/6;
	}
}
