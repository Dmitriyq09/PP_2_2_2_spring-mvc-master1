package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> carLists = new ArrayList<>();

    {
        carLists.add(new Car("325", "BMW", 1));
        carLists.add(new Car("19", "Renaut", 2));
        carLists.add(new Car("500", "Mersedes", 3));
        carLists.add(new Car("6", "Audi", 4));
        carLists.add(new Car("Sierra", "Ford", 5));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carLists;
        }
        return carLists.stream().limit(count).collect(Collectors.toList());
    }
}
