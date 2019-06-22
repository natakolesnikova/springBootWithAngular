package com.bee.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShipStub {
    private static Map<Long, Ship> ships = new HashMap<Long, Ship>();
    private static Long idIndex = 1L;

    static {
        Ship a = new Ship(1L, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);
        ships.put(1L, a);
        Ship b = new Ship(2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994);
        ships.put(2L, b);
        Ship c = new Ship(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994);
        ships.put(3L, c);
    }

    public static List<Ship> list() {
        return new ArrayList<Ship>(ships.values());
    }

    public static Ship create(Ship ship) {
        idIndex += idIndex;
        ship.setId(idIndex);
        ships.put(idIndex, ship);
        return ship;
    }

    public static Ship get(Long id) {
        return ships.get(id);
    }

    public static Ship update(Long id, Ship ship) {
        ships.put(id, ship);
        return ship;
    }

    public static Ship delete(Long id) {
        return ships.remove(id);
    }
}
