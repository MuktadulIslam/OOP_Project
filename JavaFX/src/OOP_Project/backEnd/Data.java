package OOP_Project.backEnd;

import java.util.ArrayList;

public interface Data {
    Object search(String name, String contactNumber);
    ArrayList records();

    boolean delete(String str, String name, String contractNumber);
}
