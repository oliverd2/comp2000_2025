public class Stage {
    Grid g;
    Actor[] actors;

    public Stage(Grid g) {
        this.g = g;
        actors = new Actor[3];
        actors[0] = new Cat(g.cells[5][5]);
        actors[1] = new Dog(g.cells[10][10]);
        actors[2] = new Bird(g.cells[15][15]);
    }
}
