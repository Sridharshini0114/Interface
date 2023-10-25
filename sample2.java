
public class sample2 {

	public static void main(String[] args) {
		
		ProductModel p=new ProductModel();
		p.setPid(1001);
		p.setPname("mobile");
		
		ProductDAOImpl p1=new ProductDAOImpl();
		p1.addProduct();
		p1.viewProduct(p);

	}

}

