package ui;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.Layer;
import org.openstreetmap.gui.jmapviewer.MapMarkerCircle;
import org.openstreetmap.gui.jmapviewer.interfaces.MapObject;
import util.Util;

import java.awt.*;

public class MapMarkerColor extends MapMarkerCircle {
    public static final double defaultMarkerSize = 10.0;
    private String content;
    public MapMarkerColor(Layer layer, Coordinate coord, Color color, String content) {
        super(layer, null, coord, defaultMarkerSize, STYLE.FIXED, getDefaultStyle());
        layer.add((MapObject) Util.defaultImage);
        this.content = content;
        setBackColor(color);
        setColor(color);
    }

    public String getContent() {
        return content;
    }
}
