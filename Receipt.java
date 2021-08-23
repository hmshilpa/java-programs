
public class Receipt {
	String product_name;
	String product_id;
	long transaction_id;
	double product_price;
	int num_of_units;
	double amount_cust_paid;
	
	Receipt(){
		
	}
	Receipt(String product_name,String product_id,long transaction_id,
			double product_price,int num_of_units,double amount_cust_paid){
		this.product_name=product_name;
		this.product_id=product_id;
		this.transaction_id=transaction_id;
		this.product_price=product_price;
		this.num_of_units=num_of_units;
		this.amount_cust_paid=amount_cust_paid;
	}
	public void calculate() {
		double subtotal=product_price*num_of_units;
		double sales_tax=subtotal*0.0825;
		double total= subtotal +sales_tax;
	    double balance=amount_cust_paid-total;
	    System.out.println("                     "+product_name+"                           "+num_of_units);
	    System.out.println("                     Unit price:                     "+product_price);
	    System.out.println("                     Sub total:                      "+subtotal);
	    System.out.println("                     Tax (18.25%):                   "+sales_tax);
	    System.out.println("                     Total:                          "+total);
	    System.out.println("------------------------------------------------------------------------");
	    System.out.println("                     Cash:                           "+amount_cust_paid);
	    System.out.println("                     Change:                         "+balance);


		
	}
	
	
}
