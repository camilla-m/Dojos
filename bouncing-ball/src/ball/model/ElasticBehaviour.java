package ball.model;

import ball.Ball;

public class ElasticBehaviour  implements Behaviour{


    public final int GROWTH_RATE = 2;

    final int GROW = 1;
    final int SHRINK = -1;

    private int growthDirection;
    private BallImpl ball;

    public ElasticBehaviour(BallImpl ball, int growthDirection) {
        this.ball = ball;
        this.growthDirection = growthDirection;
    }

    public int reverseGrowthDirectionIfNecessary() {
        if (growingTooBig() || shrinkingTooSmall()) {
            return switchDirection();
        }

        return growthDirection;
    }

    private boolean shrinkingTooSmall() {
        return this.ball.radius() <= 0 && shrinking();
    }

    private boolean growingTooBig() {
        return this.ball.radius() >= Ball.DEFAULT_RADIUS && growing();
    }

    private int switchDirection() {
        this.growthDirection = growing() ? SHRINK : GROW;
        return this.growthDirection;
    }

    public int next() {
        int radius = this.ball.radius() + (GROWTH_RATE * growthDirection);

        int s = radius;
        return radius;
    }

    private boolean shrinking() {
        return growthDirection == SHRINK;
    }

    private boolean growing() {
        return growthDirection == GROW;
    }
}
