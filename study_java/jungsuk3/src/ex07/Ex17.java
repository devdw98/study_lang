package ex07;

public class Ex17 {
}

class Unit{
    int x, y;
    Unit(){
        this.x = 0;
        this.y = 0;
    }
    void move(int x, int y){}
    void stop(){}
}
class Marine extends Unit{ //보병
    Marine(){
        super();
    }
    void stimPack(){}
}

class Tank extends Unit{ // 탱크
    Tank(){
        super();
    }
    void changeMode(){}
}

class DropShip extends Unit{ // 수송선
    DropShip(){
        super();
    }
    void load(){}
    void unload(){}
}