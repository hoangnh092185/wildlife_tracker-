import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.sql2o.*;

public class Animal {
  private String name;
  private int id;

  public Animal(String _name){
    name = _name;
  }

  public String getName(){
    return name;
  }

  public int getId() {
    return id;
  }

  public static List<Animal> all() {
  String sql = "SELECT * FROM animals";
  try(Connection con = DB.sql2o.open()) {
    return con.createQuery(sql).executeAndFetch(Animal.class);
    }
  }

  public void save() {
    try(Connection con= DB.sql2o.open()){
      String sql = "INSERT INTO animals(name) VALUES (:name)";
      this.id = (int) con.createQuery(sql, true)
        .addParameter("name", this.name)
        .executeUpdate()
        .getKey();
    }
  }

  public static Animal find(int _id) {
    try(Connection con = DB.sql2o.open()) {
      String sql = "SELECT * FROM animals WHERE id=:id";
      Animal animal = con.createQuery(sql)
        .addParameter("id", _id)
        .executeAndFetchFirst(Animal.class);
      return animal;
    }
  }

  public void delete(){
    try(Connection con = DB.sql2o.open()) {
      String sql = "DELETE FROM animals WHERE id = :id";
      con.createQuery(sql)
        .addParameter("id", this.id)
        .executeUpdate();
    }
  }

  @Override
  public boolean equals(Object otherAnimal){
    if(!(otherAnimal instanceof Animal)){
      return false;
    }else {
      Animal newAnimal = (Animal) otherAnimal;
      return this.getName().equals(newAnimal.getName());
    }
  }
}
