import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StonewallTest {
    @Test
    void solution() {
        int[] H1 = {8,8,5,7,9,8,7,4,8};
        assertEquals(7,Stonewall.solution(H1));

        int[] H2 = {10,9,8,7,6,5,4,3,2,1,2,3,4,5,6,7,8,9,10};
        assertEquals(19,Stonewall.solution(H2));

        int[] H3 = {4};
        assertEquals(1,Stonewall.solution(H3));

        int[] H4 = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        assertEquals(1,Stonewall.solution(H4));

        int[] H5 = {1,2,3,4,5,6,7,8,9,10,9,8,7,6,5,4,3,2,1};
        assertEquals(10,Stonewall.solution(H5));
    }
}