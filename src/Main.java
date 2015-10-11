public class Main {
    public static void main(String[] args) {
        Field field = new Field();
        Player player = new Player();
        Ship ship = new Ship(4, 6);

        field.init();
        field.setShip(ship);

        System.out.println("Game start");

        do {
            field.show();
            int shootVertical = player.getShootVertical();
            int shootHorizontal = player.getShootHorizotal();
            field.doShoot(shootVertical, shootHorizontal);
        } while (field.isNotGameOver());
    }
}