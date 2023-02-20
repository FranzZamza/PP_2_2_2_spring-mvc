package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImp implements CarDao {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "111", true));
        cars.add(new Car("Mercedes", "222", false));
        cars.add(new Car("Kopeika", "777", false));
        cars.add(new Car("Moscvich", "333", false));
        cars.add(new Car("Lada", "432", true));
    }

    @Override
    public List<Car> index(Integer index) {
        return index >= 5 ? cars : cars.stream().limit(index).toList();
    }
}
