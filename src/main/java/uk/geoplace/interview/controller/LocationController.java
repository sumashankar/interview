package uk.geoplace.interview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uk.geoplace.interview.model.Location;
import uk.geoplace.interview.repository.LocationRepository;

@RestController
@RequestMapping("/api")
public class LocationController {

    @Autowired
    LocationRepository locationRepository;


    // TODO - is race conditions covered - check error response
    @PostMapping("/locations")
    public ResponseEntity<Location> createLocation(@RequestBody Location location) {
        try {
            Location loc = locationRepository
                    .save(new Location(location.getUprn(), location.getAuthcode(), location.getBuilding_description()));
            return new ResponseEntity<>(loc, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null);
        }
    }

}
