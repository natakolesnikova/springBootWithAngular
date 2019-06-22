package com.bee.controller;

import com.bee.model.Shipwreck;
import com.bee.model.ShipStub;
import com.bee.repository.ShipRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ShipController {

    @Autowired
    private ShipRepository shipRepository;

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> getShipList() {
        return shipRepository.findAll();
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipWreck) {
        return shipRepository.saveAndFlush(shipWreck);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.GET)
    public Shipwreck get(@PathVariable Long id) {
        return shipRepository.findOne(id);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
    public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipWreck) {
        Shipwreck existingShipwreck = shipRepository.findOne(id);
        BeanUtils.copyProperties(shipWreck, existingShipwreck);
        return shipRepository.saveAndFlush(shipWreck);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id) {
        Shipwreck existingShip = shipRepository.findOne(id);
        shipRepository.delete(existingShip);
    }
}
