public class Main {
    public static void main(String[] args) {

        // Задание 1

        String firstName = "Семён ";
        String  middleName = "Семёнович";
        String lastName = "Иванов ";
        String fullName = lastName + firstName + middleName;
        System.out.println(fullName);

        // Задание 2


        fullName = fullName.toUpperCase();
        System.out.println(fullName);

        // Задание 3



        fullName = fullName.replace('Ё','Е');
        System.out.println( "Данные ФИО сотрудника — " + fullName);


    }
}