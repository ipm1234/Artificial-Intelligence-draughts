package nl.tue.s2id90.group26;
import nl.tue.s2id90.game.GameState;
import org10x10.dam.game.Move;

/**
 *
 * @author s140562
 */
public class GameNode {
    private GameState gameState;
    private Move bestMove;
    
    GameNode(GameState gameState) {
        this.gameState = gameState;
    }
    
    GameState getGameState() {
        return this.gameState;
    }
    
    void setBestMove(Move BestMove) {
        this.bestMove = BestMove;
    }
    
    Move getBestMove() {
        return this.bestMove;
    }
}
