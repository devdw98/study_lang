#include <iostream>
#include <string.h>

class Marine
{
    int hp;               // 체력
    int coord_x, coord_y; // 위치
    int damage;           // 공격력
    bool is_dead;
    char *name; // 마린 이름

public:
    Marine();                                      //default constructor
    Marine(int x, int y);                          // x, y 좌표에 마린 생성
    Marine(int x, int y, const char *marine_name); // 마린 이름까지 지정
    ~Marine();                                     // 소멸자

    int attack();                      // 데이미 입히기
    void be_attacked(int damage_earn); //얻은 데미지
    void move(int x, int y);           // 위치 이동

    void show_status(); // 마린 상태 보여주기
};
Marine::Marine()
{
    hp = 50;
    coord_x = coord_y = 0;
    damage = 5;
    is_dead = false;
    name = NULL;
}
Marine::Marine(int x, int y)
{
    coord_x = x;
    coord_y = y;
    hp = 50;
    damage = 5;
    is_dead = false;
    name = NULL;
}
Marine::Marine(int x, int y, const char *marine_name)
{
    name = new char[strlen(marine_name) + 1];
    strcpy(name, marine_name);

    coord_x = x;
    coord_y = y;
    hp = 50;
    damage = 5;
    is_dead = false;
}
int Marine::attack()
{
    return damage;
}
void Marine::be_attacked(int damage_earn)
{
    hp -= damage_earn;
    if (hp <= 0)
        is_dead = true;
}
void Marine::move(int x, int y)
{
    coord_x = x;
    coord_y = y;
}
void Marine::show_status()
{
    std::cout << "*** Marine : " << name << " ***" << std::endl;
    std::cout << "Location : ( " << coord_x << ", " << coord_y << " ) " << std::endl;
    std::cout << "HP: " << hp << std::endl;
}
Marine::~Marine()
{
    std::cout << name << " 의 소멸자 호출!" << std::endl;
    if (name != NULL)
    {
        delete[] name; // 이름 메모리도 소멸
    }
}

int main()
{
    Marine *marines[100];

    // 동적으로 메모리 할당
    marines[0] = new Marine(2, 3, "marine1");
    marines[1] = new Marine(3, 5, "marine2");

    marines[0]->show_status();
    marines[1]->show_status();

    std::cout << std::endl
              << "마린 1이 마린 2ㅣ 공격!" << std::endl;
    marines[1]->be_attacked(marines[0]->attack());
    marines[0]->show_status();
    marines[1]->show_status();

    // 동적 할당한 메모리 해제
    delete marines[0];
    delete marines[1];
}