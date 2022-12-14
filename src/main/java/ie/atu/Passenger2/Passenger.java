package ie.atu.Passenger2;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table
public class Passenger {
    private String title;
    private String name;
    private String id;
    private String phone;
    private int age;

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long count;

    public Passenger(String title, String name, String id, String phone, int age) {
        setTitle(title);
        setName(name);
        setId(id);
        setPhone(phone);
        setAge(age);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if("Mr".equalsIgnoreCase(title) || "Mrs".equalsIgnoreCase(title) || "Ms".equalsIgnoreCase(title)){
            this.title = title;
        }
        else {
            throw new IllegalArgumentException("This is not a valid name. Use Mr, Ms or Mrs.");
        }
    }

    public String getName() {
        if(name.length() >= 3){
            return name;
        }
        else{
            throw new IllegalArgumentException("This is not a valid name, must be three or more characters");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        if(id.length() < 10){
            throw new IllegalArgumentException("ID must be at least 10 characters long");
        }
        else{
            return id;
        }

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        if(!phone.matches("[0-9]+")){
            throw new IllegalArgumentException("Phone number must contain only digits");
        }
        else if(phone.length() < 7){
            throw new IllegalArgumentException("Phone number must be at least 7 digits");
        }
        else{
            return phone;
        }

    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        if(age > 16){
            return age;
        }
        else
            throw new IllegalArgumentException("Passenger must be over 16 to fly");
    }

    public void setAge(int age) {
        this.age = age;
    }
}


