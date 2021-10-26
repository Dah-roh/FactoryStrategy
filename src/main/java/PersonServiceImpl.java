public class PersonServiceImpl implements PersonService{

  public PersonServiceImpl() {
  }

  //factory
  @Override
  public Person createPerson() {
    Person daro = new Person("daro", "fara park estate", 15);
    return daro;
  }
  //strategy
  @Override
  public void makePersonMoan() {
    System.out.println("hmmmmm");
  }
}
