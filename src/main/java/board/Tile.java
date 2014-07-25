package board;

import java.util.LinkedList;
import java.util.List;

import unit.Unit;

public class Tile
{
    private List<Unit> units;
    
    public Tile()
    {
        units = new LinkedList<Unit>();
    }
    
    protected void addUnit(Unit unit)
    {
        units.add(unit);
    }
    
    protected void removeUnit(Unit unit)
    {
        units.remove(unit);
    }
    
    public List<Unit> getUnits()
    {
        // TODO
        return null;
    }
    
    public void removeUnits()
    {
        // TODO
    }
}
