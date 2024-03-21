package core.basesyntax.strategy.handler;

import core.basesyntax.db.ProductStorage;
import core.basesyntax.dto.Transaction;

public abstract class OperationHandler {
    protected final ProductStorage productStorage;

    public OperationHandler(ProductStorage productStorage) {
        this.productStorage = productStorage;
    }

    public abstract void handle(Transaction transaction);
}
