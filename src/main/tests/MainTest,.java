import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    void testGetCupSize() {
        assertEquals("3 Oz", Main.getCupSize("small"));
        assertEquals("5 Oz", Main.getCupSize("medium"));
        assertEquals("7 Oz", Main.getCupSize("large"));
        assertEquals("Invalid size", Main.getCupSize("extra large"));
    }

    @Test
    void testAddSugar() {
        assertEquals("1 spoon of sugar", Main.addSugar(1));
        assertEquals("2 spoons of sugar", Main.addSugar(2));
        assertEquals("Insufficient sugar", Main.addSugar(100));
    }

    @Test
    void testInsufficientResources() {
        // Simular agotamiento de recursos
        for (int i = 0; i < 10; i++) {
            Main.getCupSize("small");
        }
        assertEquals("Insufficient resources", Main.getCupSize("small"));
    }
}