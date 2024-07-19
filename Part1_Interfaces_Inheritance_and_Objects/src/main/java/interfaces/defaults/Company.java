package interfaces.defaults;

public interface Company {
    default String getName(){
        return "defaults.Company";
    }
    // default methods in java 8 enables interfaces
    // to add additional methods implementation
    // without
    //affecting the child classes
}
