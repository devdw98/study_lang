#include <iostream>

int change_val(int *p){
    *p = 3;

    return 0;
}

int change_val_ref(int &p){
    p = 3;
    return 0;
}

int function(){
    int a = 1;
    return a;
}

int main() {
    // 포인터로 변수 가져오기
    // int number = 5;
    // std::cout << number << std::endl;
    // change_val(&number);
    // std::cout << number << std::endl;
    // 참조자로 변수 가져오기
    // int a = 3;
    // int& another_a = a;

    // another_a = 5;
    // std::cout << "a: "<< a << std::endl;
    // std::cout << "another_a: "<<another_a << std::endl;

    // 함수
    int b = function();

    return 0;
}