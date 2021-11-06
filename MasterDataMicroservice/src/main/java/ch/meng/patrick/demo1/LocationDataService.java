package ch.meng.patrick.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationDataService {
    @Autowired
    private LocationRepository locationRepository;

    public List<LocationEntity> list() {
        return locationRepository.findAll();
    }
    public void save(LocationEntity data) {
        locationRepository.save(data);
    }
}