package visitor;

class Supermarket implements Store {
    private double totalSales;
    private int inventoryCount;

   
    public Supermarket(double totalSales, int inventoryCount) {
        this.totalSales = totalSales;
        this.inventoryCount = inventoryCount;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public int getInventoryCount() {
        return inventoryCount;
    }

    public void accept(StoreVisitor visitor) {
        visitor.visit(this);
    }
}


