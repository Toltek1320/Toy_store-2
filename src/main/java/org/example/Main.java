package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        ToyManager manager = new ToyManager();
        manager.put("1","Конструктор",2);
        manager.put("2","Робот",2);
        manager.put("3","Кукла",6);

        FileWriter writer = new FileWriter("output.txt");
        for (int i = 0; i < 10; i++) {
            String toyID = manager.get();
            writer.write(toyID);
        }
        writer.close();
    }
}
