#include <iostream>
#include <string.h>

class Photon_Cannon
{
    int hp, shield;
    int coord_x, coord_y;
    int damage;

public:
    Photon_Cannon(int x, int y);
    Photon_Cannon(const Photon_Cannon &pc);

    void show_status();
};
