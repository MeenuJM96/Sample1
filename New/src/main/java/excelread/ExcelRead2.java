package excelread;

import java.io.IOException;

public class ExcelRead2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String a=ExcelRead1.getStringData(1,0); //static method invoking
		System.out.println(a);
		String b=ExcelRead1.getIntegerData(1,1); //static method invoking
		System.out.println(b);
	}

}
