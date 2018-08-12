package com.company.bank;

import com.company.bank.customer.payment.Payment;
import com.company.bank.tasks.Task;
import java.io.Closeable;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.apache.log4j.Logger;

public class PoorBank implements com.company.bank.Payable, Closeable {
    final static Logger logger = Logger.getLogger(PoorBank.class);
    public static final String BANK_NAME = "PoorBank";
    private static PoorBank INSTANCE;
    private final BigDecimal cash;

    private final static ExecutorService service = Executors
            .newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    private PoorBank(BigDecimal cash) {
        this.cash = cash;
    }

    public void initialize(BigDecimal cash) {
        if (INSTANCE == null) {
            synchronized (this) {
                if (INSTANCE == null) {
                    INSTANCE = new PoorBank(cash);
                }
            }
        }
    }

    public static PoorBank getInstance() {
        if (INSTANCE == null) {
            throw new IllegalStateException("Initialize bank first");
        } else {
            return INSTANCE;
        }
    }

    public static Future<?> solveTask(Task task) {
        return service.submit(task);
    }

    public String getUniqueId() {
        return BANK_NAME;
    }

    public void giveCash(final BigDecimal cash) {
        // bank is rich enough
    }

    public boolean takeCash(final BigDecimal cash) {
        // bank is rich enough
        return true;
    }

    public void addHistory(final Payment payment) {
        logger.info(payment.toString());
    }

    public void close() throws IOException {
        service.shutdown();
    }
}
