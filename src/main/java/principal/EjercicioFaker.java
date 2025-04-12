package principal;

import net.datafaker.Faker;

public class EjercicioFaker {

    public static void main(String[] args) {
        Logs.info("nivel informativo");
        final var faker = new Faker(); // instanciando el objeto faker

        final var nombre = faker.name().firstName();
        final var apellido = faker.name().lastName();
        final var correo = faker.internet().emailAddress();
        final var edad = faker.number().numberBetween(20, 50);
        final var peso = faker.number().randomDouble(3, 50, 80);
        final var escasado = faker.bool().bool();
        final var fraseCompleta = faker.backToTheFuture().quote();

        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(correo);
        System.out.println(edad);
        System.out.println(peso);
        System.out.println(escasado);
        System.out.println(fraseCompleta);
    }
}
