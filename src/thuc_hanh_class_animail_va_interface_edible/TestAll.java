package thuc_hanh_class_animail_va_interface_edible;

import thuc_hanh_class_animail_va_interface_edible.animal.Animal;
import thuc_hanh_class_animail_va_interface_edible.animal.Chicken;
import thuc_hanh_class_animail_va_interface_edible.animal.Tiger;
import thuc_hanh_class_animail_va_interface_edible.edible.Edible;
import thuc_hanh_class_animail_va_interface_edible.fruit.Apple;
import thuc_hanh_class_animail_va_interface_edible.fruit.Fruit;
import thuc_hanh_class_animail_va_interface_edible.fruit.Orange;

import javax.crypto.Cipher;

public class TestAll {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());

            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}

