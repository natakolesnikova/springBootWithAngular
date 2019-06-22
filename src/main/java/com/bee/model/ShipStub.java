package com.bee.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShipStub {
    private static Map<Long, Shipwreck> ships = new HashMap<Long, Shipwreck>();
    private static Long idIndex = 1L;

    static {
        Shipwreck a = new Shipwreck(1L, "U869", "A very deep German UBoat", "FAIR", 200, 44.12, 138.44, 1994);
        ships.put(1L, a);
        Shipwreck b = new Shipwreck(2L, "Thistlegorm", "British merchant boat in the Red Sea", "GOOD", 80, 44.12, 138.44, 1994);
        ships.put(2L, b);
        Shipwreck c = new Shipwreck(3L, "S.S. Yongala", "A luxury passenger ship wrecked on the great barrier reef", "FAIR", 50, 44.12, 138.44, 1994);
        ships.put(3L, c);
    }

    public static List<Shipwreck> list() {
        return new ArrayList<Shipwreck>(ships.values());
    }

    public static Shipwreck create(Shipwreck shipWreck) {
        idIndex += idIndex;
        shipWreck.setId(idIndex);
        ships.put(idIndex, shipWreck);
        return shipWreck;
    }

    public static Shipwreck get(Long id) {
        return ships.get(id);
    }

    public static Shipwreck update(Long id, Shipwreck shipWreck) {
        ships.put(id, shipWreck);
        return shipWreck;
    }

    public static Shipwreck delete(Long id) {
        return ships.remove(id);
    }
}
