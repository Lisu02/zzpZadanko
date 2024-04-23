import org.example.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StandardTest {

    @Test
    @DisplayName("Custom test name")
    void testAdding1(){
        int a = 5;
        int b = 4;
        assert Main.add(a,b) == 9;
    }

    @Test
    @DisplayName("Custom test name2")
    void testAdding2(){
        int a = 18;
        int b = 12;
        assert Main.add(a,b) == 30;
    }
}
