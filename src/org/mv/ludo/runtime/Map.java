package org.mv.ludo.runtime;



public class Map {
	
	private Tile[][] map;
	
	
	public Map(int sizeX, int sizeY) {
		map = new Tile[sizeX][sizeY];
		init();
	}
	
	private void init() {
		for(int i = 0; i < sizeX(); i++) {
			for(int j = 0; j < sizeY(); j++) {
				map[i][j] = new Tile(i + "-" + j);
			}
		}
	}
	
	
	// Getters & setters
	public Tile getTile(int x, int y) {
		return map[x][y];
	}
	
	public int sizeX() {
		return map.length;
	}
	
	public int sizeY() {
		return map[0].length;
	}

}
