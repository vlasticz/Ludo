package org.mv.ludo.runtime;

public class Runtime {
	
	
	 private static Map map;
	
	
	public static void main(String[] args) {
		init();
		draw(map);

	}
	
	private static void init() {
		map = MapFactory.newMap(7, 7);
		MapFactory.putDot(map, 2, 2);
	}
	
	
	private static void draw(Map map) {
		
		
		
		for(int i = 0; i < map.sizeY(); i++) {
			for(int j = 0; j < map.sizeY(); j++) {
				
				if(map.getTile(i, j).isEmpty()) {
					System.out.printf("|   ");
				} else {
					System.out.printf("| * ");
				}
				System.out.printf("%s", map.getTile(i, j).toString());
			}
			System.out.printf("|\n");
		}
	}

}
