public class Main {

  public static void main(String[] args) {
    PersonServiceImpl personService = new PersonServiceImpl();
    System.out.println(personService.createPerson().toString());
    personService.makePersonMoan();
  }
}
