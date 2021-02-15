package beans;

import java.util.*;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class Orders {
	List<Order> orders = new ArrayList<Order>();
	
	public Orders() {
		orders.add( new Order( "00001" , "Product 1" , (float)17.0,100 ) );
		orders.add(new Order("00002","Product 2",(float)1.3,15));
		orders.add(new Order("00003","Product 3",(float)300.1,28));
		orders.add(new Order("00004","Product 4",(float)15.5,167));
		orders.add(new Order("00005","Product 5",(float)4.9,32));
		orders.add(new Order("00006","Product 6",(float)9.0,1));
		orders.add(new Order("00007","Product 7",(float)30.0,56));
		orders.add(new Order("00008","Product 8",(float)42.5,4));
		orders.add(new Order("00009","Product 9",(float)171.8,78));
		orders.add(new Order("00010","Product 10",(float)10.0,90));
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
}
