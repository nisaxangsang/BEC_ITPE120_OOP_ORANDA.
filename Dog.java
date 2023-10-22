class Dog extends Animal {
    String dogBreed;

    public Dog(String name, String breed) {
        super(name);
        this.dogBreed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " (a " + dogBreed + " dog) barks.");
    }

    public void fetchBall() {
        System.out.println(name + " fetches a ball.");
    }
}
