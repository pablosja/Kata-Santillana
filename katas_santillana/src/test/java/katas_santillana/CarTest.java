package katas_santillana;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    void testAccelerate() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.accelerate(100);
        assertEquals(100, car.getCurrentSpeed());

        car.accelerate(150);
        assertEquals(200, car.getCurrentSpeed());
        assertTrue(car.getTotalFines() > 0);
    }

    @Test
    void testBrake() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.setCurrentSpeed(100);
        car.brake();
        assertEquals(0, car.getCurrentSpeed());
    }

    @Test
    void testDecelerate() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.setCurrentSpeed(100);
        car.decelerate(50);
        assertEquals(50, car.getCurrentSpeed());

        car.decelerate(60);
        assertEquals(0, car.getCurrentSpeed());
    }

    @Test
    void testDisplayAttributes() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.displayAttributes();
    }

    @Test
    void testEstimatedArrivalTime() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.setCurrentSpeed(100);
        double time = car.estimatedArrivalTime(300);
        assertEquals(3.0, time, 0.01);
    }

    @Test
    void testGetBrand() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        assertEquals("Toyota", car.getBrand());
    }

    @Test
    void testGetCarType() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        assertEquals(CarType.SUV, car.getCarType());
    }

    @Test
    void testGetColor() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        assertEquals(Color.BLACK, car.getColor());
    }

    @Test
    void testGetCurrentSpeed() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.setCurrentSpeed(120);
        assertEquals(120, car.getCurrentSpeed());
    }

    @Test
    void testGetEngineVolume() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        assertEquals(2.0, car.getEngineVolume());
    }

    @Test
    void testGetFuelType() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        assertEquals(FuelType.GASOLINE, car.getFuelType());
    }

    @Test
    void testGetMaxSpeed() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        assertEquals(200, car.getMaxSpeed());
    }

    @Test
    void testGetModelYear() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        assertEquals(2022, car.getModelYear());
    }

    @Test
    void testGetNumberOfDoors() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        assertEquals(4, car.getNumberOfDoors());
    }

    @Test
    void testGetNumberOfSeats() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        assertEquals(5, car.getNumberOfSeats());
    }

    @Test
    void testGetTotalFines() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.accelerate(250);
        assertTrue(car.getTotalFines() > 0);
    }

    @Test
    void testHasFines() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.accelerate(250);
        assertTrue(car.hasFines());
    }

    @Test
    void testIsAutomatic() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        assertTrue(car.isAutomatic());
    }

    @Test
    void testSetAutomatic() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.setAutomatic(false);
        assertFalse(car.isAutomatic());
    }

    @Test
    void testSetBrand() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.setBrand("Honda");
        assertEquals("Honda", car.getBrand());
    }

    @Test
    void testSetCarType() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.setCarType(CarType.COMPACT);
        assertEquals(CarType.COMPACT, car.getCarType());
    }

    @Test
    void testSetColor() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.setColor(Color.RED);
        assertEquals(Color.RED, car.getColor());
    }

    @Test
    void testSetCurrentSpeed() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.setCurrentSpeed(150);
        assertEquals(150, car.getCurrentSpeed());
    }

    @Test
    void testSetEngineVolume() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.setEngineVolume(3.0);
        assertEquals(3.0, car.getEngineVolume());
    }

    @Test
    void testSetFuelType() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.setFuelType(FuelType.DIESEL);
        assertEquals(FuelType.DIESEL, car.getFuelType());
    }

    @Test
    void testSetMaxSpeed() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.setMaxSpeed(220);
        assertEquals(220, car.getMaxSpeed());
    }

    @Test
    void testSetModelYear() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.setModelYear(2023);
        assertEquals(2023, car.getModelYear());
    }

    @Test
    void testSetNumberOfDoors() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.setNumberOfDoors(2);
        assertEquals(2, car.getNumberOfDoors());
    }

    @Test
    void testSetNumberOfSeats() {
        Car car = new Car("Toyota", 2022, 2.0, FuelType.GASOLINE, CarType.SUV,
                4, 5, 200, Color.BLACK, true);
        car.setNumberOfSeats(4);
        assertEquals(4, car.getNumberOfSeats());
    }
}
