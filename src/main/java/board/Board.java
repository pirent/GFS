package board;

import java.util.ArrayList;
import java.util.List;

import unit.Unit;

public class Board
{
    private final int height;
    private final int weight;
    private List<List<Tile>> tiles;

    public Board(int height, int weight)
    {
        this.height = height;
        this.weight = weight;
        initialize();
    }
    
    private void initialize()
    {
        tiles = new ArrayList<List<Tile>>();
        for (int i = 0; i < weight; i++)
        {
            tiles.add(i, new ArrayList<Tile>());
            for (int j =0; j < height; j++)
            {
                tiles.get(i).add(new Tile());
            }
        }

    }
    
    public Tile getTile(int x, int y)
    {
        return tiles.get(x - 1).get(y - 1);
    }

    public void addUnit(int x, int y, Unit unit)
    {
        Tile tile = getTile(x, y);
        tile.addUnit(unit);
    }
    
    public void removeUnit(int x, int y,Unit unit)
    {
        Tile tile = getTile(x, y);
        tile.removeUnit(unit);
    }
    
    public List<Unit> getUnit(int x, int y)
    {
        Tile tile = getTile(x, y);
        return tile.getUnits();
    }
    
    public void removeUnits(int x, int y)
    {
        Tile tile = getTile(x, y);
        tile.removeUnits();
    }
}
