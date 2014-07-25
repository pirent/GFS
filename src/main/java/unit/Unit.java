package unit;

import java.util.HashMap;
import java.util.Map;

public class Unit
{
    private final String type;
    private final Map<String, Object> properties;
    
    public Unit(String type)
    {
        this.type = type;
        properties = new HashMap<String, Object>();
    }
    
    public String getType()
    {
        return type;
    }
    
    public void setProperty(String name, Object value)
    {
        properties.put(name, value);
    }
    
    public Object getProperty(String name)
    {
        return properties.get(name);
    }
}
