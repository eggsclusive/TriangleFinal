package HW4.TriangleProblem;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Verifier {

	@Test void shouldReturnNotTriangleFor1_2_5() {
        assertEquals("Nottriangle", Triangle_classification.classifyTriangle(1, 2, 5));
        System.out.println("Test: Input (1, 2, 5) -> Expected: Nottriangle");
    }
	@Test void shouldReturnNotTriangleFor5_2_3() {
        assertEquals("Nottriangle", Triangle_classification.classifyTriangle(5, 2, 3));
        System.out.println("Test: Input (5, 2, 3) -> Expected: Nottriangle");
    }
	@Test void shouldReturnNotTriangleFor1_4_2() {
        assertEquals("Nottriangle", Triangle_classification.classifyTriangle(1, 4, 2));
        System.out.println("Test: Input (1, 4, 2) -> Expected: Nottriangle");
    }
	@Test void shouldReturnEquilateralFor5_5_5() {
        assertEquals("equilateral", Triangle_classification.classifyTriangle(5, 5, 5));
        System.out.println("Test: Input (5, 5, 5) -> Expected: equilateral");
    }
	@Test void shouldReturnIsoscelesFor5_5_2() {
        assertEquals("isosceles", Triangle_classification.classifyTriangle(5, 5, 2));
        System.out.println("Test: Input (5, 5, 2) -> Expected: isosceles");
    }
	@Test void shouldReturnIsoscelesFor4_3_3() {
        assertEquals("isosceles", Triangle_classification.classifyTriangle(4, 3, 3));
        System.out.println("Test: Input (4, 3, 3) -> Expected: isosceles");
    }
	@Test void shouldReturnIsoscelesFor3_4_3() {
        assertEquals("isosceles", Triangle_classification.classifyTriangle(3, 4, 3));
        System.out.println("Test: Input (3, 4, 3) -> Expected: isosceles");
    }
	@Test void shouldReturnScaleneFor6_9_7() {
        assertEquals("Scalene", Triangle_classification.classifyTriangle(6, 9, 7));
        System.out.println("Test: Input (6, 9, 7) -> Expected: Scalene");
    }
}