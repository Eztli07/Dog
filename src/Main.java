class Main
{
    public static void main(String[] args)
    {
        Dog Fang = new Dog ("Fang", 5, "Husky", 80.0);

        System.out.println("Fang's breed is: " + Fang.getBreed());
        System.out.println("Fang's age is: " + Fang.getAge());

        Dog Piper = new Dog ("Piper", 3, "Australian Shepard", 45.0);

        System.out.println("Piper's weight is: " + Piper.converter());

        Dog Henry = new Dog ("Henry", 5, "Pomeranian", 13.0);

        System.out.println(Henry.toString());

        System.out.println("\nTotal Dogs: " + Dog.getCountDogs());

    }
}