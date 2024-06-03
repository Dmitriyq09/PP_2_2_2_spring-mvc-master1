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
        carLists.add(new Car("Volkswagen Touareg II", "серебристый", 2007));
        carLists.add(new Car("BMW e46 Coupe", "белый", 1999));
        carLists.add(new Car("Land Rover Range Rover Evoque I 6-speed", "белый", 2012));
        carLists.add(new Car("Peugeot 306", "крастный", 2017));
        carLists.add(new Car("Mercedes-Benz M-Класс II (W164) 350", "чёрный", 2013));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carLists;
        }
        return carLists.stream().limit(count).collect(Collectors.toList());
    }
}
