package com.bee.controller;

import com.bee.model.Ship;
import com.bee.model.ShipStub;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ShipController {

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Ship> getShipList() {
        return ShipStub.list();
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public Ship create(@RequestBody Ship ship) {
        return ShipStub.create(ship);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
    public Ship get(@PathVariable Long id) {
        return ShipStub.get(id);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
    public Ship update(@PathVariable Long id, @RequestBody Ship ship) {
        return ShipStub.update(id, ship);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
    public Ship update(@PathVariable Long id) {
        return ShipStub.delete(id);
    }
}
