/*
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements.  See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License.  You may obtain a copy of the License at
*
*      http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.mkyong.form.model;

/**
 *
 */
public class AggregatedRentalStats {
    String carModel;

    String rentalOffice;

    double averageRentDuration;

    public AggregatedRentalStats(String carModel, String rentalOffice, double averageRentDuration) {
        this.carModel = carModel;
        this.rentalOffice = rentalOffice;
        this.averageRentDuration = averageRentDuration;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getRentalOffice() {
        return rentalOffice;
    }

    public void setRentalOffice(String rentalOffice) {
        this.rentalOffice = rentalOffice;
    }

    public double getAverageRentDuration() {
        return averageRentDuration;
    }

    public void setAverageRentDuration(double averageRentDuration) {
        this.averageRentDuration = averageRentDuration;
    }
}
