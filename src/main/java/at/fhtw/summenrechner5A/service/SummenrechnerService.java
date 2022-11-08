package at.fhtw.summenrechner5A.service;

import at.fhtw.summenrechner5A.dto.Summe;
import org.springframework.stereotype.Service;

@Service
public class SummenrechnerService {
    private final Summe sum  = new Summe(); // sum.sum = 0

    public void incrementSumBy(long number) {
        sum.addToSum(number);
    }
    // addToSum() macht nichts anderes als das Attribut sum.sum welches initial 0 ist jedes Mal zu addieren wenn die Instanz
    // des Objektes neu aufgerufen wird.

    public Long getSum() {
        return sum.getSum();
    }

}
