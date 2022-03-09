package game;

import city.cs.engine.BodyImage;
import city.cs.engine.BoxShape;
import city.cs.engine.DynamicBody;
import city.cs.engine.Shape;
import city.cs.engine.World;

public class Student extends DynamicBody {
    private static final Shape studentShape = new BoxShape(1,2);

    private static final BodyImage image = new BodyImage("data/student.png", 4);

    public Student(World world){
        super(world, studentShape);
        this.addImage(image);
    }

}
