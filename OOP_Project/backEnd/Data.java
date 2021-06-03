package OOP_Project.backEnd;

import java.io.FileNotFoundException;

public interface Data {
//    boolean add() throws FileNotFoundException;
    Object search(String name, String contactNumber);
    void editInfo(String name, String contactNumber);
}
