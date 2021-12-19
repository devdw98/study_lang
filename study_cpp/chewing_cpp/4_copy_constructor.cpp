#include <iostream>
#include <string.h>

class Study_Copy_Con
{
    int a;

public:
    Study_Copy_Con();
    Study_Copy_Con(int tmp);
    // Study_Copy_Con(const Study_Copy_Con &scc);
    void show_status();
};
Study_Copy_Con::Study_Copy_Con()
{
    a = 0;
}
Study_Copy_Con::Study_Copy_Con(int tmp)
{
    a = tmp;
}
// Study_Copy_Con::Study_Copy_Con(const Study_Copy_Con &scc)
// {
//     std::cout << "복사 생성자 호출!" << this << std::endl;
//     a = scc.a;
// }
void Study_Copy_Con::show_status()
{
    std::cout << "주소: " << this << std::endl;
    std::cout << "a: " << a << std::endl;
}

class Test
{
    char *name;
    Test(char *n);
    Test(const Test &t);
};
Test::Test(char *n)
{
    name = new char[strlen(n) + 1];
    strcpy(name, n);
}
Test::Test(const Test &t)
{
    name = new char[strlen(t.name) + 1];
    strcpy(name, t.name);
}

int main()
{

    Study_Copy_Con scc1(1);
    Study_Copy_Con scc2(scc1);
    Study_Copy_Con scc3 = scc2;
    Study_Copy_Con scc4;
    scc4 = scc3;

    scc1.show_status();
    scc2.show_status();
    scc3.show_status();
    scc4.show_status();
}