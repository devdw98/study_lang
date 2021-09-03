package ex06;

public class Student {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;
    Student(){}

    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }


    int getTotal(){
        return this.kor + this.eng + this.math;
    }
    float getAverage(){
        float result = Math.round((float)this.getTotal()*10 / 3);
        return result / 10;
    }
    String info(){
        return this.name + ","+this.ban+","+this.no+","+this.kor+","+this.eng+","+this.math+","+this.getTotal()+","+this.getAverage();
    }
}
