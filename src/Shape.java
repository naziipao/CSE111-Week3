public class Shape {
    public String name;
    public double area;

    public void setParameters(String name, double radius) {
        this.name = name;
        area = 3.14* Math.pow(radius, 2);
    }
    public void setParameters(String name, double a, double b) {
        this.name = name;
        if(name == "Triangle") {
            area = 0.5 * a * b;
        }
        else if(name == "Rectangle"){
            area = a*b;
        }
    }
    public String details(){
        return "Shape Name: " + name  + "\nArea: " + area;
    }

}

