package Managers;

public class PingManager {
    int pingLevel;

    void setPing() {
        pingLevel = Hack.distance;
        if (Hack.distance > 5)
            pingLevel = 5;
    }
}