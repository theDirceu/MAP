package br.uepb.edu.domain.facade;
import br.uepb.edu.domain.*;

public class EmprestimoCadastroFacade {
    private Catalog catalog;
    private Lending lending;
    private Inventory inventory;

    public EmprestimoCadastroFacade() {
        this.catalog = new Catalog();
        this.lending = new Lending();
        this.inventory = new Inventory();
    }

    public boolean borrowBook(String title) {
        String bookDetails = catalog.searchBook(title);

        if(inventory.isAvailable(bookDetails)) {
            lending.lendBook(bookDetails);
            return true;
        }
        return false;
    }
}

