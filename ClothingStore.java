package visitor;

class ClothingStore implements Store {
    private double totalSales;
    private int inventoryCount;

    
    public ClothingStore(double totalSales, int inventoryCount) {
        this.totalSales = totalSales;
        this.inventoryCount = inventoryCount;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public int getInventoryCount() {
        return inventoryCount;
    }

    @Override
    public void accept(StoreVisitor visitor) {
        visitor.visit(this);
    }
}

