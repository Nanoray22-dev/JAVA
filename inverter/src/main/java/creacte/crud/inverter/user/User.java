package creacte.crud.inverter.user;

import jakarta.persistence.*;;

@Entity
@Table(name = "users")
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @Column(name = "country")
    private String country;

    @Column(name = "title")
    private String title;

    // get and set methods


    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
      return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
      }
  
      public void setEmail(String email){
          this.email = email;
      }

      public String getCountry(){
        return country;
      }
  
      public void setCountry(String country){
          this.country = country;
      }

      public String getTitle(){
        return title;
      }
  
      public void setTitle(String title){
          this.title = title;
      }



    
}
