import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluationTest {
    @Test
    void calculatePenaltyRule1Horizontal() {
        assertEquals(3, Evaluation.calculatePenaltyRule1(new int[][]{{1,1,1,1,1,0}}));
        assertEquals(4, Evaluation.calculatePenaltyRule1(new int[][]{{1,1,1,1,1,1}}));
        assertEquals(5, Evaluation.calculatePenaltyRule1(new int[][]{{1,1,1,1,1,1,1}}));
        assertEquals(5, Evaluation.calculatePenaltyRule1(new int[][]{{0,1,1,1,1,1,1,1,0}}));
    }
    @Test
    void calculatePenaltyRule1Vertical() {
        assertEquals(3, Evaluation.calculatePenaltyRule1(new int[][]{{1},{1},{1},{1},{1},{0}}));
        assertEquals(4, Evaluation.calculatePenaltyRule1(new int[][]{{1},{1},{1},{1},{1},{1}}));
        assertEquals(5, Evaluation.calculatePenaltyRule1(new int[][]{{1},{1},{1},{1},{1},{1},{1}}));
        assertEquals(5, Evaluation.calculatePenaltyRule1(new int[][]{{0},{1},{1},{1},{1},{1},{1},{1},{0}}));
    }
    @Test
    void calculatePenaltyRule2() {
        assertEquals(3, Evaluation.calculatePenaltyRule2(new int[][]{{1,1,0}, {1,1,0}, {0,0,0}}));
        assertEquals(6, Evaluation.calculatePenaltyRule2(new int[][]{{1,0,0}, {1,0,0}, {0,0,0}}));
    }

    @Test
    void calculatePenaltyRule3() {
        assertEquals(40, Evaluation.calculatePenaltyRule3(new int[][]{{1,0,1,1,1,0,1,0,0,0,0}}));
        assertEquals(40, Evaluation.calculatePenaltyRule3(new int[][]{{0,0,0,0,1,0,1,1,1,0,1}}));
        assertEquals(40, Evaluation.calculatePenaltyRule3(new int[][]{{1},{0},{1},{1},{1},{0},{1},{0},{0},{0},{0}}));
        assertEquals(40, Evaluation.calculatePenaltyRule3(new int[][]{{0},{0},{0},{0},{1},{0},{1},{1},{1},{0},{1}}));
    }

    @Test
    void calculatePenaltyRule4() {
        assertEquals(90, Evaluation.calculatePenaltyRule4(new int[][]{{0,0,0,0,0,0,0,0,0,0}}));
        assertEquals(70, Evaluation.calculatePenaltyRule4(new int[][]{{1,0,0,0,0,0,0,0,0,0}}));
        assertEquals(50, Evaluation.calculatePenaltyRule4(new int[][]{{1,1,0,0,0,0,0,0,0,0}}));
        assertEquals(30, Evaluation.calculatePenaltyRule4(new int[][]{{1,1,1,0,0,0,0,0,0,0}}));
        assertEquals(10, Evaluation.calculatePenaltyRule4(new int[][]{{1,1,1,1,0,0,0,0,0,0}}));
        assertEquals(0, Evaluation.calculatePenaltyRule4(new int[][]{{1,1,1,1,1,0,0,0,0,0}}));
        assertEquals(20, Evaluation.calculatePenaltyRule4(new int[][]{{1,1,1,1,1,1,0,0,0,0}}));
        assertEquals(40, Evaluation.calculatePenaltyRule4(new int[][]{{1,1,1,1,1,1,1,0,0,0}}));
        assertEquals(60, Evaluation.calculatePenaltyRule4(new int[][]{{1,1,1,1,1,1,1,1,0,0}}));
        assertEquals(80, Evaluation.calculatePenaltyRule4(new int[][]{{1,1,1,1,1,1,1,1,1,0}}));
        assertEquals(100, Evaluation.calculatePenaltyRule4(new int[][]{{1,1,1,1,1,1,1,1,1,1}}));
    }
}
