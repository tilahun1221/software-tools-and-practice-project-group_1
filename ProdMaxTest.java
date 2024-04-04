

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProdMaxTest {

    @Test
    public void testFindMaxProductPair() {
        ProdMax maxProduct = new ProdMax();
        int[] nums1 = {-1, -3, -4, 2, 0, -5};
        int[] maxProductPair1 = maxProduct.findMaxProductPair(nums1);
        Assertions.assertArrayEquals(new int[] {-4,-5}, maxProductPair1);

        
    }
}