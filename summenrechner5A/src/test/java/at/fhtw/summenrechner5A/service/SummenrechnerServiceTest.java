package at.fhtw.summenrechner5A.service;

import com.jayway.jsonpath.internal.function.numeric.Sum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// Erstellen einer Test Klasse:
// Shift + Strg + T
class SummenrechnerServiceTest {


    // Benötigen eine Instanz von dem Service den wir testen möchten
    private final SummenrechnerService sumService = new SummenrechnerService();

    @Test
    void testDefaultState() {
        // Given/Arrange
        // Zunächst Grundzustand angeben den wir haben möchten
        int summand = 23;
        // When/Act
        sumService.incrementSumBy(summand);
        // Then/Assert
        assertEquals(summand, sumService.getSum());
    }
}