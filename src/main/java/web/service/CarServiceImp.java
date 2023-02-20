package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private final CarDaoImp carDao;

    public CarServiceImp(CarDaoImp carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> index(int count) {
        return carDao.index(count);
    }
}
