package com.company.task4to6;

interface Movable {
    void speedCheckPoint(double speed1, double speed2);

    void setPoint(double x1, double y1, double x2, double y2);

    void setSpeedPoint(double speed1, double speed2);

    void outputNewPoint(double x1, double y1, double x2, double y2, double speed1, double speed2);
}
