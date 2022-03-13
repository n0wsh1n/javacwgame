package game;

import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.DynamicBody;
import city.cs.engine.Shape;
import city.cs.engine.World;

public class Dino extends DynamicBody {
    private static final Shape dinoShape = new BoxShape(1,2);

    private static final BodyImage image = new BodyImage("data/dino.png", 4);

    public Dino(World world){
        super(world, dinoShape);
        this.addImage(image);
    }

}
