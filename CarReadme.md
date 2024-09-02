+----------------------------------+
|               Car                |
+----------------------------------+
| - brand: String                  |
| - modelYear: int                 |
| - engineVolume: double           |
| - fuelType: FuelType             |
| - carType: CarType               |
| - numberOfDoors: int             |
| - numberOfSeats: int             |
| - maxSpeed: int                  |
| - color: Color                   |
| - currentSpeed: int              |
| - isAutomatic: boolean           |
| - totalFines: double             |
| - fineCount: int                 |
+----------------------------------+
| + Car(brand: String, modelYear: int, engineVolume: double, fuelType: FuelType, carType: CarType, |
|       numberOfDoors: int, numberOfSeats: int, maxSpeed: int, color: Color, isAutomatic: boolean) |
| + getBrand(): String             |
| + setBrand(brand: String): void  |
| + getModelYear(): int            |
| + setModelYear(modelYear: int): void |
| + getEngineVolume(): double      |
| + setEngineVolume(engineVolume: double): void |
| + getFuelType(): FuelType        |
| + setFuelType(fuelType: FuelType): void |
| + getCarType(): CarType          |
| + setCarType(carType: CarType): void |
| + getNumberOfDoors(): int        |
| + setNumberOfDoors(numberOfDoors: int): void |
| + getNumberOfSeats(): int        |
| + setNumberOfSeats(numberOfSeats: int): void |
| + getMaxSpeed(): int             |
| + setMaxSpeed(maxSpeed: int): void |
| + getColor(): Color              |
| + setColor(color: Color): void   |
| + getCurrentSpeed(): int         |
| + setCurrentSpeed(currentSpeed: int): void |
| + isAutomatic(): boolean         |
| + setAutomatic(isAutomatic: boolean): void |
| + accelerate(increment: int): void |
| + decelerate(decrement: int): void |
| + brake(): void                  |
| + estimatedArrivalTime(distance: double): double |
| + displayAttributes(): void      |
| + hasFines(): boolean            |
| + getTotalFines(): double        |
| + main(args: String[]): void     |
+----------------------------------+

+----------------------------------+
|              CarType              |
+----------------------------------+
| <<enumeration>>                  |
| + CITY_CAR                       |
| + SUBCOMPACT                     |
| + COMPACT                        |
| + FAMILY                         |
| + EXECUTIVE                      |
| + SUV                            |
+----------------------------------+

+----------------------------------+
|              FuelType            |
+----------------------------------+
| <<enumeration>>                  |
| + GASOLINE                       |
| + BIOETHANOL                     |
| + DIESEL                         |
| + BIODIESEL                      |
| + NATURAL_GAS                    |
+----------------------------------+

+-------------------------------+
|            Color              |
+-------------------------------+
| <<enumeration>>               |
| + WHITE                       |
| + BLACK                       |
| + RED                         |
| + ORANGE                      |
| + YELLOW                      |
| + GREEN                       |
| + BLUE                        |
| + VIOLET                      |
+-------------------------------+
