/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bestcar;

/**
 *
 * @author adelz
 */
class CarComparisonEngine {
    public Car compareCars(Car[] cars)
    {
        Car bestCar = null;
        int highestScore = Integer.MIN_VALUE;

        for (Car car : cars) {
            int currentScore = car.score();
            if (currentScore > highestScore) {
                highestScore = currentScore;
                bestCar = car;
            }
        }

        return bestCar;
    }
}
