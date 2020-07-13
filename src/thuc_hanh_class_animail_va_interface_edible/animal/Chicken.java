package thuc_hanh_class_animail_va_interface_edible.animal;

import thuc_hanh_class_animail_va_interface_edible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return " Chicken : cluck - cluck !";
    }

    @Override
    public String howToEat() {
        return " Could be fried ";
    }
}
