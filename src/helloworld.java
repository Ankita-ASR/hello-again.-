public class helloworld {
    private int roll;
    private String name;
    private boolean passed;
    public helloworld(){
        roll = 100;
        name = "CSE";
        passed = true;
    }
    public helloworld(int roll, String name, boolean passed){
        this.roll = roll;
        this.name = name;
        this.passed = passed;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setPassed(boolean passed) {
        this.passed = passed;
    }

    public int getRoll() {
        return roll;
    }

    public boolean isPassed() {
        return passed;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public static void main(String[] args) {
      helloworld helloWorld = new helloworld();
        helloworld helloWorld2 = new helloworld(300,"SHU", true);
        helloWorld.setName("ICE");
        helloWorld.setRoll(400);
        helloWorld.setPassed(false);
        System.out.println(helloWorld2.getName());
        System.out.println(helloWorld.getRoll());
        System.out.println(helloWorld2.isPassed());
    }
}