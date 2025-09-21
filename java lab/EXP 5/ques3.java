class Box {
    float width, height, depth;

        Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

   
    float volume() {
        return width * height * depth;
    }

    
    void displayDimensions() {
        System.out.println("Width: " + width + ", Height: " + height + ", Depth: " + depth);
    }
}

class BoxWeight extends Box {
    float weight;

    BoxWeight(float w, float h, float d, float m) {
        super(w, h, d); // call parent constructor
        weight = m;
    }

    void displayWeight() {
        System.out.println("Weight: " + weight);
    }
}

class Main {
    public static void main(String[] args) {
	System.out.println("RAGHAV 24CSU168");
        // Creating Box object
        Box b1 = new Box(2.5f, 3.0f, 4.0f);
        System.out.println("Box:");
        b1.displayDimensions();
        System.out.println("Volume: " + b1.volume());

        System.out.println();

        BoxWeight bw1 = new BoxWeight(2.5f, 3.0f, 4.0f, 10.5f);
        System.out.println("BoxWeight:");
        bw1.displayDimensions();
        System.out.println("Volume: " + bw1.volume());
        bw1.displayWeight();
    }
}
