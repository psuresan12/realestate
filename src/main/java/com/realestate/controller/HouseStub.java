package com.realestate.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.realestate.model.House;

public class HouseStub {
	private static Map<Long, House> houses = new HashMap<Long, House>();
	private static Long idIndex = 3L;

	//populate initial wrecks
	/*static {
		House a = new House(1L, "A superb detached Victorian property on one of the town's finest roads, within easy reach of Barnes Village. The property has in excess of 6000 sq/ft of accommodation, a driveway and landscaped garden.", "12 Valley of Kings, Richmond", "Melbourne", 900000.00);
		houses.put(1L, a);
		House b = new House(2L, "This impressive family home, which dates back to approximately 1840, offers original period features throughout and is set back from the road with off street parking for up to six cars and an original Coach House, which has been incorporated into the main house to provide further accommodation.", "89 Road of Forks, Camberwell", "Melbourne", 85000.00);
		houses.put(2L, b);
		House c = new House(3L, "This house has been designed and built to an impeccable standard offering luxurious and elegant living. The accommodation is arranged over four floors comprising a large entrance hall, living room with tall sash windows, dining room, study and WC on the ground floor.", "Grote Hof 12, St. Kilda East", "Perth", 60000.00);
		houses.put(3L, c);
	}*/

	public static List<House> list() {
		return new ArrayList<House>(houses.values());
	}

	public static House create(House house) {
		idIndex += idIndex;
		house.setId(idIndex);
		houses.put(idIndex, house);
		return house;
	}

	public static House get(Long id) {
		return houses.get(id);
	}

	public static House update(Long id, House house) {
		houses.put(id, house);
		return house;
	}

	public static House delete(Long id) {
		return houses.remove(id);
	}
}

