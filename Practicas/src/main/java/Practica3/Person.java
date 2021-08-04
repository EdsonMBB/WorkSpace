package Practica3;

class Person { }



class Student {

    int id;

    Student(int id) {

        this.id = id;

    }



    @Override

    public boolean equals(Object obj) {

        if(this == obj) return true;
        if(obj instanceof Student) {
            Student s = (Student)obj;
            return this.id == s.id;
        }
        return false;

    }

}





