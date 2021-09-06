#include <iostream>

class Date{
    int year_;
    int month_; // 1부터 12까지
    int day_; // 1부터 31까지

    public:
    void SetDate(int year, int month, int day);
    void AddDay(int inc);
    void AddMonth(int inc);
    void AddYear(int inc);
    void ShowDate();
};