package lessons;

public class Object {

    int lenght;
    int weght;
    int height;

  /*  Object() {
        this.lenght = 0;
        this.weght = 0;
        this.height = 0;
    }*/

    Object(int lenght, int weght, int height) {
        this.lenght = lenght;
        this.weght = weght;
        this.height = height;
    }

    Object(Object ob) {
        this.lenght = ob.lenght;
        this.weght = ob.weght;
        this.height = ob.height;
    }
}

class ObjectColor extends Object {

    String color;

    ObjectColor(int lenght, int weght, int height, String color) {
        super(lenght, weght, height);
        this.color = color;
    }

    ObjectColor(ObjectColor ob) {
        super(ob);
        this.color = ob.color;
    }

    @Override
    public String toString() {
        return "ObjectColor{" +
                "lenght=" + lenght +
                ", weght=" + weght +
                ", height=" + height +
                ", color='" + color + '\'' +
                '}';
    }
}

class ObjectWeight extends Object {

    int weight;

    ObjectWeight(int lenght, int weght, int height, int weight) {
        super(lenght, weght, height);
        this.weight = weight;
    }

    ObjectWeight(ObjectColor ob) {
        super(ob);
        this.weight = 0;
    }
}

class ObjectWithColorAndWeight extends Object {

    double weight;

    ObjectWithColorAndWeight(int lenght, int weght, int height, int weight) {
        super(lenght, weght, height);
        this.weight = weight;
    }
}

class Fu {
    public static void main(String[] args) {
        ObjectColor objectColor = new ObjectColor(3, 3, 3, "белый");
        ObjectColor objectColor1 = new ObjectColor(objectColor);

        System.out.println(objectColor1);
        System.out.println(objectColor);
    }
}

