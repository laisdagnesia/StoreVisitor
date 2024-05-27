package visitor;

class FinancialAuditVisitor implements StoreVisitor {
	
    @Override
    public void visit(Supermarket supermarket) {
        System.out.println("Auditoria Supermercado: Total de vendas = " + supermarket.getTotalSales());
    }

    @Override
    public void visit(ClothingStore clothingStore) {
        System.out.println("Auditoria Loja de Roupas: Total de vendas = " + clothingStore.getTotalSales());
    }

    @Override
    public void visit(ElectronicsStore electronicsStore) {
        System.out.println("Auditoria Loja de Eletronicos Store: Total de vendas = " + electronicsStore.getTotalSales());
    }
}
