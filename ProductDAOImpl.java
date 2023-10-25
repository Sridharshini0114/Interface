
public class ProductDAOImpl implements ProductDAO
{

	public void addProduct() {
		System.out.println("This is addProduct");
		
	}

	public void viewProduct(ProductModel p) {
		
		System.out.println("This is viewproduct"+p.getPid()+""+p.getPname());
		
	}
   
}
