
public class Dayname {

	/**
	 * Program for to write the Day Name in the month of January - 2016
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Array[]={"Mon","Tue","Wed","Thus","Fri","Sat","Sun"};

		int Date, DaySr=4;
		System.out.println("   Date  " + "\t" + "Date Name");
		System.out.println("---------\t---------");
		for(Date=1;Date<=31;Date++){
			System.out.println(Date+"-Jan-2016" + "\t" + Array[DaySr] );
			DaySr++;
			if (DaySr >6){
				DaySr=0;
			}
		}
		
	}

}
