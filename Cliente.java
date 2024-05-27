package visitor;

public class Cliente {
    public static void main(String[] args) {
        Store[] stores = {
            new Supermarket(50000, 3000),
            new ClothingStore(20000, 1500),
            new ElectronicsStore(40000, 800)
        };

        StoreVisitor financialAudit = new FinancialAuditVisitor();
        StoreVisitor inventoryInspection = new InventoryInspectionVisitor();

        System.out.println("Auditorias Financeiras: ");
        for (Store store : stores) {
            store.accept(financialAudit);
        }

        System.out.println("\nInspeções de estoque:");
        for (Store store : stores) {
            store.accept(inventoryInspection);
        }
    }
}




