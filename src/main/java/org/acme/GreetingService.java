package org.acme;
import javax.enterprise.context.ApplicationScoped;


@ApplicationScoped
public class GreetingService {

public String greeting(String name){

    return "hello"  + " " +  name;
}

    public String firstService(String name) {
    return "My first service";
    }

    public String secondService(String name){
    return "My second service";
    }

}

