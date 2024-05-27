package visitor;

class ElectronicsStore implements Store {
    private double totalSales;
    private int inventoryCount;

    
    public ElectronicsStore(double totalSales, int inventoryCount) {
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

