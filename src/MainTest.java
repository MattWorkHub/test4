import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
        String day = "1";
        String month = "MARCH";
        String year = "2023";
        String dayWeek = "WEDNSDAY";
        assertEquals("1",day,"Day");
        assertEquals("MARCH",month,"Month");
        assertEquals("2023",year,"Year");
        assertEquals("WEDNSDAY",dayWeek,"Day of the week");
    }

}