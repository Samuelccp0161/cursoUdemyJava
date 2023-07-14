package exercise9;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class WorkerTest {
    @Test
    public void testAddContractToWorker() throws ParseException {
        Worker worker = new Worker("Alex", LevelEnum.MID_LEVEL, 1320.00);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse("20/08/2018");

        Contract contract = new Contract(date, 50.0, 20);

        worker.addContract(contract);

        assertEquals(1, worker.contracts.size());
    }
    @Test
    public void testRemoveContractToWorker() throws ParseException {
        Worker worker = new Worker("Alex", LevelEnum.MID_LEVEL, 1320.00);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse("20/08/2018");

        Contract contract = new Contract(date, 50.0, 20);
        Contract contract2 = new Contract(date, 50.0, 30);

        worker.addContract(contract);
        worker.addContract(contract2);

        assertEquals(2, worker.contracts.size());

        worker.removeContract(contract2);

        assertEquals(1, worker.contracts.size());
    }
    @Test
    public void testWorkerIncome() throws ParseException {
        Worker worker = new Worker("Alex", LevelEnum.MID_LEVEL, 1200.00);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse("20/08/2018");
        Date dateA = dateFormat.parse("20/07/2018");


        Contract contract = new Contract(date, 50.0, 20);
        Contract contract2 = new Contract(date, 80.0, 10);
        Contract contract3 = new Contract(dateA, 50.0, 20);


        worker.addContract(contract);
        worker.addContract(contract2);
        worker.addContract(contract3);


        assertEquals(3000.00, worker.income(8, 2018), 0.005);
    }
}
