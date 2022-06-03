import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    private final SILab2 siLab2 = new SILab2();

    @Test
    void testEveryStatementMethod() {
        String[] test1 = new String[]{};
        List<String> list1 = Arrays.asList(test1);
        assertThrows(Exception.class, () -> siLab2.function(list1));

        String[] test2 = new String[]{"0", "#", "0", "0", "0", "#", "0", "#", "#","0"};
        List<String> list2 = Arrays.asList(test2);
        assertThrows(Exception.class, () -> siLab2.function(list2));

        String[] test3 = new String[]{"0", "#", "0", "#", "0", "#", "0", "#", "#"};
        String[] resultArrayTest3 = new String[]{"2", "#", "2", "#", "4", "#", "2", "#", "#"};
        List<String> list3 = Arrays.asList(test3);
        List<String> listResultTest3 = Arrays.asList(resultArrayTest3);
        assertEquals(listResultTest3, siLab2.function(list3));

    }

    @Test
    void testEveryBranchMethod() {
        String[] test1 = new String[]{};
        List<String> list1 = Arrays.asList(test1);
        assertThrows(Exception.class, () -> siLab2.function(list1));

        String[] test2 = new String[]{"0", "#", "0", "#", "0", "#", "#", "0"};
        List<String> list2 = Arrays.asList(test2);
        assertThrows(Exception.class, () -> siLab2.function(list2));

        String[] test3 = new String[]{"0", "#", "0", "#", "0", "#", "0", "#", "#"};
        String[] resultArrayTest3 = new String[]{"2", "#", "2", "#", "4", "#", "2", "#", "#"};
        List<String> list3 = Arrays.asList(test3);
        List<String> listResultTest3 = Arrays.asList(resultArrayTest3);
        assertEquals(listResultTest3, siLab2.function(list3));

        String[] test4 = new String[]{"0", "#", "0", "0", "0", "#", "0", "#", "#"};
        String[] resultArrayTest4 = new String[]{"1", "#", "2", "0", "3", "#", "1", "#", "#"};
        List<String> list4 = Arrays.asList(test4);
        List<String> listResultTest4 = Arrays.asList(resultArrayTest4);
        assertEquals(listResultTest4, siLab2.function(list4));
    }
}
