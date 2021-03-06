package csc207project.gamecentre.SlidingTiles;

import android.support.annotation.NonNull;

import java.io.Serializable;

import csc207project.gamecentre.R;

/**
 * A Tile in a sliding tiles puzzle.
 */
public class Tile implements Comparable<Tile>, Serializable {

    /**
     * The background id to find the tile image.
     */
    private int background;

    /**
     * The unique id.
     */
    private int id;

    /**
     * Return the background id.
     *
     * @return the background id
     */
    public int getBackground() {
        return background;
    }

    /**
     * Return the tile id.
     *
     * @return the tile id
     */
    public int getId() {
        return id;
    }

    /**
     * A Tile with id and background. The background may not have a corresponding image.
     *
     * @param id         the id
     * @param background the background
     */
    public Tile(int id, int background) {
        this.id = id;
        this.background = background;
    }

    /**
     * A tile with a background id; look up and set the id.
     *
     * @param id the id
     */
    public Tile(int id) {
        this.id = id;
        // This looks so ugly.
        // True, but I don't know how to fix it.
        switch (this.id) {
            case 0:
                this.background = R.drawable.tile_0;
                break;
            case 1:
                this.background = R.drawable.tile_1;
                break;
            case 2:
                this.background = R.drawable.tile_2;
                break;
            case 3:
                this.background = R.drawable.tile_3;
                break;
            case 4:
                this.background = R.drawable.tile_4;
                break;
            case 5:
                this.background = R.drawable.tile_5;
                break;
            case 6:
                this.background = R.drawable.tile_6;
                break;
            case 7:
                this.background = R.drawable.tile_7;
                break;
            case 8:
                this.background = R.drawable.tile_8;
                break;
            case 9:
                this.background = R.drawable.tile_9;
                break;
            case 10:
                this.background = R.drawable.tile_10;
                break;
            case 11:
                this.background = R.drawable.tile_11;
                break;
            case 12:
                this.background = R.drawable.tile_12;
                break;
            case 13:
                this.background = R.drawable.tile_13;
                break;
            case 14:
                this.background = R.drawable.tile_14;
                break;
            case 15:
                this.background = R.drawable.tile_15;
                break;
            case 16:
                this.background = R.drawable.tile_16;
                break;
            case 17:
                this.background = R.drawable.tile_17;
                break;
            case 18:
                this.background = R.drawable.tile_18;
                break;
            case 19:
                this.background = R.drawable.tile_19;
                break;
            case 20:
                this.background = R.drawable.tile_20;
                break;
            case 21:
                this.background = R.drawable.tile_21;
                break;
            case 22:
                this.background = R.drawable.tile_22;
                break;
            case 23:
                this.background = R.drawable.tile_23;
                break;
            case 24:
                this.background = R.drawable.tile_24;
                break;
            default:
                background = R.drawable.tile_0;
        }
    }

    @Override
    public int compareTo(@NonNull Tile o) {
        return o.id - this.id;
    }
}
