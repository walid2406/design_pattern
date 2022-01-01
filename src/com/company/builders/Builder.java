package com.company.builders;

import com.company.cars.CarType;
import com.company.componenets.Engine;
import com.company.componenets.GPSNavigator;
import com.company.componenets.Transmission;
import com.company.componenets.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);

}
