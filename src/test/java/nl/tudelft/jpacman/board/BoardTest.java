package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * Test suite verifying that a Board can be constructed from a valid grid.
 *
 * @author Yok
 */
class BoardTest {

    /**
     * A 1x1 grid holding one BasicSquare is the smallest valid board,
     * so its dimensions and content must both come back as expected.
     */
    @Test
    void testBoard() {
        Square square = new BasicSquare();
        Square[][] grid = new Square[1][1];
        grid[0][0] = square;

        Board board = new Board(grid);

        assertThat(board.getWidth()).isEqualTo(1);
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.squareAt(0, 0)).isEqualTo(square);
    }

    @Test
    void testBoardWithNullSquare() {
        Square square = new BasicSquare();
        Square[][]
            grid = new Square[2][1];
        grid[0][0] = square;
        grid[1][0] = null;

        Board board = new Board(grid);

        assertThat(board.squareAt(0, 0)).isEqualTo(square);
    }

}
