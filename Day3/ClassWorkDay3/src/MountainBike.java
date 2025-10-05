interface MountainParts {
    String TERRAIN = "off-road";
    void setSuspension(String newValue);
    String getSuspension();
    void setType(String newValue);
    String getType();
}

public class MountainBike implements MountainParts {
    private String suspension;
    private String type;

    public void setSuspension(String newValue) {
        suspension = newValue;
    }

    public String getSuspension() {
        return suspension;
    }

    public void setType(String newValue) {
        type = newValue;
    }

    public String getType() {
        return type;
    }

    public static void main(String[] args) {
        MountainBike bike = new MountainBike();
        bike.setSuspension("Dual");
        bike.setType("Trail");
        System.out.println("Terrain: " + MountainParts.TERRAIN);
        System.out.println("Suspension: " + bike.getSuspension());
        System.out.println("Type: " + bike.getType());
    }
}