// import org.junit.*;
// import static org.junit.Assert.*;
// import org.sql2o.*;
//
// public class AnimalTest{
//
//   @Rule
//   public DatabaseRule database = new DatabaseRule();
//
//   @Test
//   public void equals_returnsTrueIfNameAreTheSame(){
//     Animal newAnimal1 = new Animal("Batman");
//     Animal newAnimal2 = new Animal("Batman");
//     assertTrue(newAnimal1.equals(newAnimal2));
//   }
//   //
  // @Test
  // public void save_returnsSaveAnimalAreTheSame(){
  //   Animal newAnimal1 = new Animal("Batman");
  //   newAnimal1.save();
  //   assertTrue(Animal.all().get(0).equals(newAnimal1));
  // }
  //
  // @Test
  // public void all_returnsAllInstancesOfAnimal_true(){
  //   Animal newAnimal1 = new Animal("Batman");
  //   newAnimal1.save();
  //   Animal newAnimal2 = new Animal("Robbin");
  //   newAnimal2.save();
  //   assertEquals(true, Animal.all().get(0).equals(newAnimal1));
  //   assertEquals(true, Animal.all().get(1).equals(newAnimal2));
  // }
  //
  // @Test
  // public void save_assignsIdToObject(){
  //   Animal newAnimal1 = new Animal("Batman");
  //   newAnimal1.save();
  //   Animal saveAnimal = Animal.all().get(0);
  //   assertEquals(newAnimal1.getId(), saveAnimal.getId());
  // }
  //
  // @Test
  // public void getId_clientInstantiateWithId(){
  //   Animal newAnimal1 = new Animal("Batman");
  //   newAnimal1.save();
  //   assertTrue(newAnimal1.getId()>0);
  // }
  //
  // public void find_returnsAnimalWithSameId_newAnimal2(){
  //   Animal newAnimal1 = new Animal("Batman");
  //   newAnimal1.save();
  //   Animal newAnimal2 = new Animal("Robbin");
  //   newAnimal2.save();
  //   assertEquals(Animal.find(newAnimal2.getId()), newAnimal2);
  // }
