package bilal;

import com.github.javafaker.Faker;

public class TC101 {

    public static void main(String[] args) {
        System.out.println("Helllo World again");


        Faker faker = new Faker();

        System.out.println("Recruiter phone number = " + faker.phoneNumber().cellPhone());
    }
}
