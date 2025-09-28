package OOP;

class Shape {
    int getCorner() {
        return 0;
    }
}

class Rectangle extends Shape {
    int getCorner() {
        return 4;
    }

    int getParentCorner(){
        // Ini cara manggil yang dari parent dengan menggukanakan super
        return super.getCorner();
    }
}
