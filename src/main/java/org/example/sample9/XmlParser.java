package org.example.sample9;


//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.Unmarshaller;
//import javax.xml.bind.annotation.XmlElement;
//import javax.xml.bind.annotation.XmlRootElement;
import java.io.File;

public class XmlParser {
    public static void main(String[] args) {
        try {
//            JAXBContext context = JAXBContext.newInstance(Person.class);
//            Unmarshaller unmarshaller = context.createUnmarshaller();
//
//            File file = new File("D:\\Software\\java-xsd-jar\\person.xml");
//            Person person = (Person) unmarshaller.unmarshal(file);
//            System.out.println(person.getName()+ " - "+ person.getAge());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*
@XmlRootElement
class Person{
    private String name;
    private int age;

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}*/
