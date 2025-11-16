	// ResizableCircle.java
public class ResizableCircle extends Circle implements Resizable {

    public ResizableCircle(double radius) {
        super(radius);  // DOD 3: Base class constructor invoked
    }

    @Override
    public void resize(int percent) {
        radius = radius * percent / 100.0; // modifies radius based on percent
    }
}
