package ball.model;

public class GeneralBall extends BallImpl {

    private int direction;
    private int growthDirection;
    private int slidDirection;

    private Behaviour bouncingBehaviour;
    private Behaviour elasticBehaviour;
    private Behaviour slidingBehaviour;

    public GeneralBall(int x, int y, int radius, int growthDirection, int direction, int slidDirection) {
        super(x, y,radius);
        this.growthDirection = growthDirection;
        this.direction = direction;
        this.slidDirection = slidDirection;

        addBehaviour();
    }

    private void addBehaviour() {
        addBouncingBehaviour();
        addElasticingBehavious();
        addSlidingBehaviour();
    }

    private void addBouncingBehaviour(){
        this.bouncingBehaviour = new BouncingBehaviour(this,this.direction);
    }

    private void addElasticingBehavious(){
        this.elasticBehaviour = new ElasticBehaviour(this,this.growthDirection);
    }

    private void addSlidingBehaviour(){
        this.slidingBehaviour = new SlidingBehaviour(this,this.slidDirection);
    }

    @Override
    public void update() {
        this.direction = ((BouncingBehaviour)bouncingBehaviour).reverseDirectionIfNecessary();
        this.y = ((BouncingBehaviour)bouncingBehaviour).move(this.y);

        this.growthDirection = ((ElasticBehaviour)elasticBehaviour).reverseGrowthDirectionIfNecessary();
        this.radius = ((ElasticBehaviour)elasticBehaviour).next();

        this.slidDirection = ((SlidingBehaviour)slidingBehaviour).reverseDirectionIfNecessary();
        this.x = ((SlidingBehaviour)slidingBehaviour).move(this.x);
    }
}