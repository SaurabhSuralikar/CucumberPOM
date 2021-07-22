package Implementation;

public class Search {
public String displayProd(Product prod) {
	if(prod.getProductList().contains(prod.getProductName()))
	{
		return prod.getProductName();
	}
	else return null;
	
	
}
}
