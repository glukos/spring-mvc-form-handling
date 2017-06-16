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

import java.util.Date;

/**
 *
 */
public class CarRentalRecord {
    Integer id;

    String carModel;

    Date startDate;

    Date endDate;

    String renterName;

    String licensePlateNumber;

    String startRentalOffice;

    String endRentalOffice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getRenterName() {
        return renterName;
    }

    public void setRenterName(String renterName) {
        this.renterName = renterName;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getStartRentalOffice() {
        return startRentalOffice;
    }

    public void setStartRentalOffice(String startRentalOffice) {
        this.startRentalOffice = startRentalOffice;
    }

    public String getEndRentalOffice() {
        return endRentalOffice;
    }

    public void setEndRentalOffice(String endRentalOffice) {
        this.endRentalOffice = endRentalOffice;
    }

    @Override
    public String toString() {
        return "CarRentalRecord{" +
                "id=" + id +
                ", carModel='" + carModel + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", renterName='" + renterName + '\'' +
                ", licensePlateNumber='" + licensePlateNumber + '\'' +
                '}';
    }
}
