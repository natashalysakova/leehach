package com.company.Lessons;

import com.company.Lessons.Garage.Car;
import com.company.Lessons.Marvel.Marvel;

/**
 * Created by natas on 25.08.2015.
 */
public class Lesson7 {

    public static void Start(){

        Car car1 = new Car();
        Car car2 = new Car("BMW");
        Car car3 = new Car("Audi", 60);

       /* car1.PrintState();
        car2.PrintState();
        car3.PrintState();*/

        for (int i = 0; i < 5; i++) {
            car1.SpeedUp(40);
            car1.PrintState();

            car2.SpeedUp(5);
            car2.PrintState();

            car3.SpeedDown(15);
            car3.PrintState();

        }
    }
}
