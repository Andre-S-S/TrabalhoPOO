package br.com;



public class Person {
    
    String name;
    double weight;
    double height;
    double imcValue;
    double currentImc;
    double currentWeight;
    
        
    void calculateImc() {
        imcValue = weight / (Math.pow(height, 2));
        System.out.printf("Seu índice de massa corporal (IMC): %.2f", imcValue);
        System.out.println(" ");
    }
    
    void evaluatePerson() {
        if (imcValue < 17) {
            System.out.println("Muito abaixo do peso.");
        }
        if (imcValue >= 17 && imcValue < 18.5) {
            System.out.println("Abaixo do peso.");
        }
        if (imcValue >= 18.5 && imcValue < 25) {
            System.out.println("Peso ideal.");
        }
        if (imcValue >= 25 && imcValue < 30) {
            System.out.println("Acima do peso.");
        }
        if (imcValue >= 30 && imcValue < 35) {
            System.out.println("Obesidade.");
        }
        if (imcValue >= 35 && imcValue < 40) {
            System.out.println("Obesidade severa.");
        }
        if (imcValue >= 40) {
            System.out.println("Obesidade morbita.");
        }
    }
    
    void weightGain() {
        weight = currentWeight;
        calculateImc();
        evaluatePerson();
    }
    
    public static void main(String[] args) {
        
        Person person = new Person();
        
        person.name = "João";
        person.height = 1.75;
        person.weight = 80.00;
        person.currentWeight = 70.00;
        
        System.out.println(person.name);
        person.calculateImc();
        person.evaluatePerson();
        
        System.out.println("Peso atual:");
        person.weightGain();
    }
    
}
