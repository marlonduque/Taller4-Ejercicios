package ejercicio1;

public class Planet {

    private int id;
    private String name;
    private double mass;
    private double density;
    private double diameter;
    private double distanceSun;


    /**
     * constructor
     * @param id
     * @param name
     * @param mass
     * @param density
     * @param diameter
     * @param distanceSun
     */
    public Planet(int id, String name, double mass, double density, double diameter, double distanceSun) {
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
        this.distanceSun = distanceSun;
    }

    public Planet(int id, String name, double mass, double distanceSun) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.distanceSun = distanceSun;
    }

    /**
     *
     * @return
     */

    public int getId() { return id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) { this.mass = mass; }

    public double getDistanceSun() { return distanceSun; }

    public void setDistanceSun(double distanceSun) { this.distanceSun = distanceSun; }


    @Override

    public String toString() {
        return "Planet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mass=" + mass +
                ", density=" + density +
                ", diameter=" + diameter +
                ", distanceSun=" + distanceSun +
                '}';
    }
}
