import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DateManipulationExampleTest {
    String dateString = "2023-03-01T13:00:00Z";
    private DateManipulationExample dateManipulationExample= new DateManipulationExample();
    @Test
    void math() {
        String risultato = dateManipulationExample.math(dateString);
        Assert.assertEquals("08 febbraio 2024 13:00:00", risultato);
    }
}