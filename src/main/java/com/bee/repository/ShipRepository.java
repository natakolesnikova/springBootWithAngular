package com.bee.repository;

import com.bee.model.Shipwreck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShipRepository  extends JpaRepository<Shipwreck, Long> {

}
