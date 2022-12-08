import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> carList;

    public CarService() {
        this.carList = new ArrayList<>();
    }

    public void addCar(Car car) {
        this.carList.add(car);
    }

    public boolean deleteCar(Car car) {
        return carList.remove(car);
    }

    public List<Car> getAllCars() {
        return carList;
    }

}