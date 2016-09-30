// import java.util.List;
// import java.util.ArrayList;
// import org.sql2o.*;
//
// public class Animal {
//   private String name;
//   private int id;
//   private String health;
//   private String age;
//
//   public Animal(String _name, String _health, String _age){
//     name = _name;
//     health = _health;
//     age = _age;
//   }
//
//   public String getName(){
//     return name;
//   }
//
//   public int getId(){
//     return id;
//   }
//   // public void sethealth(String _health) {
//   //   this.health = _health;
//   // }
//   //
//   // public void setage(String _age) {
//   //   this.age = _age;
//   // }
//
//   public String getHealth() {
//     return health;
//   }
//
//   public String getAge() {
//     return age;
//   }
//
//   public static List<Animal> all() {
//     try(Connection con = DB.sql2o.open()){
//       String sql = "SELECT * FROM animals";
//       return con.createQuery(sql).executeAndFetch(Animal.class);
//     }
//   }
//
//   public List<Client> getClients(){
//     try(Connection con = DB.sql2o.open()){
//       String sql = "SELECT * FROM wildlife_tracker where animalId=:id";
//       return con.createQuery(sql)
//         .addParameter("id", this.id)
//         .executeAndFetch(Client.class);
//     }
//   }
//
//   public static Animal find (int _id){
//     try(Connection con = DB.sql2o.open()){
//       String sql = "SELECT * FROM animals where id=:id";
//       Animal animal = con.createQuery(sql)
//         .addParameter("id", _id)
//         .executeAndFetchFirst(Animal.class);
//         return animal;
//       }
//   }
//
//   public void save() {
//     try(Connection con = DB.sql2o.open()){
//       String sql = "INSERT INTO animals(name, health, age) VALUES(:name,:health, :age)";
//       this.id = (int) con.createQuery(sql, true)
//         .addParameter("name", this.name)
//         .addParameter("health", this.health)
//         .addParameter("age", this.age)
//         .executeUpdate()
//         .getKey();
//     }
//   }
//
//   public void updatehealth(String _health){
//     try(Connection con= DB.sql2o.open()){
//         String sql = "UPDATE animals SET health = :health WHERE id = :id ";
//         con.createQuery(sql)
//           .addParameter("health", _health)
//           .addParameter("id", this.id)
//           .executeUpdate();
//     }
//   }
//
//   public void updateage(String _age){
//     try(Connection con= DB.sql2o.open()){
//       String sql = "UPDATE Animals SET age=:age WHERE id=:id ";
//       con.createQuery(sql)
//         .addParameter("age", _age)
//         .addParameter("id", this.id)
//         .executeUpdate();
//     }
//   }
//
//   public void delete(){
//     try(Connection con = DB.sql2o.open()) {
//       String sql = "DELETE FROM animals WHERE id = :id";
//       con.createQuery(sql)
//         .addParameter("id", this.id)
//         .executeUpdate();
//     }
//   }
//
//   public void deleteClients(){
//     for(Client client : this.getClients()){
//       client.delete();
//       }
//   }
//
//   @Override
//   public boolean equals(Object otherAnimal){
//     if(!(otherAnimal instanceof Animal)){
//       return false;
//     }else {
//       Animal newAnimal = (Animal) otherAnimal;
//       return this.getName().equals(newAnimal.getName()) &&
//         this.getId() == newAnimal.getId();
//     }
//   }
// }
