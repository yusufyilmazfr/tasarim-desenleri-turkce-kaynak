package Adapter;

public class App {
    public static void main(String[] args) {
        CustomOperation customOperation = new CustomOperation(new CustomSerializerAdapter());
        String serializedObject = customOperation.SerializeObject(new Object());

        System.out.println(serializedObject);
    }
}
