package ball.model;

import ball.ui.BallWorld;

public class BouncingBehaviour implements Behaviour{

    public final int MOVEMENT_SPEED = 12;
    private final int DOWN = 1;
    private final int UP = -1;

    private BallImpl ball;
    private int direction;

    public BouncingBehaviour(BallImpl ball,int direction) {
        this.direction = direction;
        this.ball = ball;
    }

    public int reverseDirectionIfNecessary() {
        if (movingTooHigh() || movingTooLow()) {
            return switchDirection();
        }
        return direction;
    }

    private boolean movingTooLow() {
        return ball.center().getY() + ball.radius() >= BallWorld.BOX_HEIGHT && movingDown();
    }

    private boolean movingTooHigh() {
        return ball.center().getY() - ball.radius() <= 0 && movingUp();
    }

    private int switchDirection() {
        direction = movingDown() ? UP : DOWN;
        return direction;
    }

    public int move(int y) {
        return y + (MOVEMENT_SPEED * direction);
    }

    private boolean movingDown() {
        return direction == DOWN;
    }

    private boolean movingUp() {
        return direction == UP;
    }
}