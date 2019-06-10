public class Runner {

    public static void main(String[] args) {
        Planet mars = new Planet("Mars", 90873);
        String name = mars.getName();
        System.out.println(name);
        int size = mars.getSize();
        System.out.println(size);
        String explode = mars.explode();
        System.out.println(explode);

    }
}
