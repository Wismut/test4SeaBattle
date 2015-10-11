public class Field {
    final int SIZE = 10;
    char[][] cells = new char[SIZE][SIZE];
    Ship ship;

    void init() {
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells.length; j++) {
                cells[i][j] = '.';
            }
        }
    }

    void setShip(Ship ship) {
        this.ship = ship;
        cells[ship.verticalPosition][ship.horizontalPosition] = 'X';
    }

    void doShoot(int shootVertical, int shootHorizontal) {
        switch (cells[shootVertical][shootHorizontal]) {
            case '.':
                System.out.println("Промах");
                cells[shootVertical][shootHorizontal] = '*';
                break;
            case 'X':
                System.out.println("Супер! Корабль потоплен");
                cells[shootVertical][shootHorizontal] = '-';
                show();
                break;
            case '*':
                System.out.println("Уже стреляли!");
                break;
            default:
                System.out.println("ERROR");
                break;
        }
    }

    void show() {
        for (char[] cell : cells) {
            for (int j = 0; j < cells.length; j++) {
                System.out.print(cell[j]);
            }
            System.out.println();
        }
    }

    boolean isNotGameOver() {
        return cells[ship.verticalPosition][ship.horizontalPosition] == 'X';
    }
}
