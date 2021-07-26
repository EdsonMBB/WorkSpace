package Practica3;

class Person { }



class Student {

    int id;

    Student(int id) {

        this.id = id;

    }



    @Override

    public boolean equals(Object obj) {

    if(obj.equals(id)){
        return true;
    }else{
        return false;
    }
    }

}





