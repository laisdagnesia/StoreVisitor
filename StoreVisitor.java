package visitor;

public interface StoreVisitor {
	
	  void visit(Supermarket supermarket);
	  void visit(ClothingStore clothingStore);
	  void visit(ElectronicsStore electronicsStore);

}


