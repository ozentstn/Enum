package enumPlanet;

public enum Planet {

    MERCURY ("Mercury",1,123.4,1234,15),
    VENUS("Venus",2,234.5,2345,16),
    WORLD("World",3,345.6,3456,17),
    MARS("Mars",4,456.7,4567,18),
    JUPYTER("Jupyter",5,567.8,5678,20),
    SATURN("Saturn",6,678.9,6789,5),
    URANUS("Uranus",7,789.0,7890,12),
    NEPTUNE("Neptune",8,890.1,8901,16);

    private String planetName;
    private int orderToSun;
    private double distance;
    private int radius;
    private int spinTime;

    Planet(String planetName, int orderToSun, double distance, int radius, int spinTime) {
        this.planetName = planetName;
        this.orderToSun = orderToSun;
        this.distance = distance;
        this.radius = radius;
        this.spinTime = spinTime;
    }

    public int getSpinTime() {
        return spinTime;
    }

    public void setSpinTime(int spinTime) {
        this.spinTime = spinTime;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public int getOrderToSun() {
        return orderToSun;
    }

    public void setOrderToSun(int orderToSun) {
        this.orderToSun = orderToSun;
    }

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String ListOfPlanet (){
        String lop= (planetName + "-->"+
                " güneşe olan sırası: "+ orderToSun+ " / "+
                " güneşe olan uzaklığı: "+ distance+ " / "+
                " yarıçapı: " + radius+ " / "+
                " dönüş süresi: "+ spinTime);
                return lop;
    }

}










