public class Comparator {
	public int getMax(int n, int m) {
		return (int)getMax((double)n,(double)m);
	}

	public double getMax(double d1, double d2) {
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}

	public String getMax(String number1, String number2) {
		double n1 = Double.parseDouble(number1);
		double n2 = Double.parseDouble(number2);
		return String.valueOf(getMax(n1,n2));
	}
	
	public static void main(String[] args){
		Comparator comp = new Comparator();
		System.out.println(comp.getMax(1,2) + ": The largest of two int's");
		System.out.println(comp.getMax(3.0,4.0) + ": The largest of two double's");
		System.out.println(comp.getMax("5","6") + ": The largest of two string's");
	}
		
}
