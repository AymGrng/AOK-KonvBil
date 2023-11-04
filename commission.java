public class commission {
    public static void main (String[]args){
        System.out.println("SalesAmount     Commission");
		System.out.println("-----------------------------");
		for (double salesAmount = 10000; salesAmount <= 100000; salesAmount += 5000) {
			System.out.printf(" %-16.0f", salesAmount);
			System.out.printf("%8.1f\n", computeCommission(salesAmount));

        }
	}

	//Buat menghitung komisi
	public static double computeCommission(double salesAmount) {
		double balance, 				
		       commission;				
		balance = commission = 0.0;	

        //Kalau penjualan $10.000.01 atau lebih komisinya 12%
		if (salesAmount >= 10000.01)
			commission += (balance = salesAmount - 10000) * 0.12;

		//Kalau penjualan $5000.01 - $10.000.00 komisinya 10%
		if (salesAmount >= 5000.01)
			commission += (balance -= balance - 5000) * 0.10;

		//Kalau penjualannya %0.01 - $5000.00 komisinya 8%
		if (salesAmount >= 0.01)
				commission += balance * 0.08;
			
		return commission;

    }
}
