package xyz.kandrac.practice20;

public class Tile {

    // hodnota policka 0-8 resp. -1 pre minu
    private int value;

    // stav policka - skryte, odkryte, oznacene
    private TileStatus status;

    public Tile(int value, TileStatus status) {
        this.value = value;
        this.status = status;
    }

    public Tile() { }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (this.value != -1) {
            this.value = value;
        }
    }

    public TileStatus getStatus() {
        return status;
    }

    public void setStatus(TileStatus status) {
        this.status = status;
    }

    enum TileStatus {
        HIDDEN, SHOWN, MARKED
    }
}
