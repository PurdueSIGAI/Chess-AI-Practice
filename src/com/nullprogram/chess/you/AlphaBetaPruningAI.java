package com.nullprogram.chess.you;

import com.nullprogram.chess.*;

public class AlphaBetaPruningAI implements Player {
    private Game game;

    public AlphaBetaPruningAI(Game game) {
        this.game = game;
    }

    @Override
    public Move takeTurn(Board board, Piece.Side side) {
        return predictBestMove(0, 5, board, side).getMove();
    }

    public MoveScore predictBestMove(int ply, int finalPly, Board board, Piece.Side side) {
        // If we are on the finalPly
            // Return an evaluation of the board
        // else
            // For each possible move for the current player
                // Make the move
                // Recursively call predictBestMove(...)
                // Undo the move
            // Return the best move found (for the current player).

        // Hints:
            // Be sure to reverse the score when you return the MoveScore in the 'else' statmente
            // Be sure to increment the ply and switch sides when you recursively call predictBestMove(...)
            // Add the code to keep track of the best MoveScore within the foreach loop.

        return null;
    }
}
