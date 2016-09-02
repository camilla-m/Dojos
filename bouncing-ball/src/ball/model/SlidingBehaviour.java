package ball.model;

import ball.ui.BallWorld;

/**
 * Created by yanzhang on 8/30/16.
 */
public class SlidingBehaviour implements Behaviour {

    public final int MOVEMENT_SPEED = 12;
    static final int LEFT = 1;
    static final int RIGHT = -1;

    private BallImpl ball;
    private int direction;

    public SlidingBehaviour(BallImpl ball,int direction) {
        this.direction = direction;
        this.ball = ball;
    }

    public int reverseDirectionIfNecessary() {
        if (movingTooRight() || movingTooLeft()) {
            return switchDirection();
        }
        return direction;
    }

    private boolean movingTooLeft() {
        return ball.center().getX() + ball.radius() >= BallWorld.BOX_WIDTH && movingLeft();
    }

    private boolean movingTooRight() {
        return ball.center().getX() - ball.radius() <= 0 && movingRight();
    }

    private int switchDirection() {
        direction = movingLeft() ? RIGHT : LEFT;
        return direction;
    }

    public int move(int x) {
        return x + (MOVEMENT_SPEED * direction);
    }

    private boolean movingLeft() {
        return direction == LEFT;
    }

    private boolean movingRight() {
        return direction == RIGHT;
    }
}
