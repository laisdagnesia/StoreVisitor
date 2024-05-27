package visitor;

class InventoryInspectionVisitor implements StoreVisitor {
    @Override
    public void visit(Supermarket supermarket) {
        System.out.println("Inspecionando o estoque do supermercado: Itens em estoque =" + supermarket.getInventoryCount());
    }

    @Override
    public void visit(ClothingStore clothingStore) {
        System.out.println("Inspecionando o estoque da loja de roupas: itens em estoque = " + clothingStore.getInventoryCount());
    }

    @Override
    public void visit(ElectronicsStore electronicsStore) {
        System.out.println("Inspecionando o estoque da loja de eletrônicos: itens em estoque = " + electronicsStore.getInventoryCount());
    }
}

