package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> carLists = new ArrayList<>();

    {
        carLists.add(new Car("Mercedes-Benz M-Класс II (W164) 350", "чёрный", 2007));
        carLists.add(new Car("Hyundai ix35 I Рестайлинг", "белый", 2015));
        carLists.add(new Car("Land Rover Range Rover Evoque I 6-speed", "белый", 2012));
        carLists.add(new Car("Peugeot 408 I Рестайлинг", "чёрный", 2017));
        carLists.add(new Car("Volkswagen Touareg II", "серебристый", 2013));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carLists;
        }
        return carLists.stream().limit(count).collect(Collectors.toList());
    }
}
