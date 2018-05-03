package org.mv.ludo.runtime;

public class MapFactory {
	
	
	public static Map newMap(int sizeX, int sizeY) {
		return new Map(sizeX, sizeY);
	}
	
	public static Map putDot(Map map, int x, int y) {
		map.getTile(x, y).setEmpty(false);
		return map;
	}

}
