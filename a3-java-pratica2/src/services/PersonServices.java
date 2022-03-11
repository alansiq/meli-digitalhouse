package services;

import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class PersonServices {

    private TreeMap<Integer, ArrayList<Object>> personList = new TreeMap<Integer, ArrayList<Object>>();

    public int createPerson(String nome, int idade) {
        Integer lastId = this.getLastId();
        ArrayList<Object> person = new ArrayList<>();
        person.add(nome);
        person.add(idade);
        personList.put(lastId + 1, person);

        return lastId + 1;
    }

    public boolean deletePerson(Integer id) {

        try {
            personList.remove(id);
            return true;
        } catch(Error e) {
            return false;
        }

    }

    public void listPerson(Integer id) {
        personList.get(id);

        System.out.println(id + personList.get(id).toString());
    }

    public int getLastId() {
        try {
            if(personList.isEmpty()) {
                return 0;
            }
            return personList.lastKey();


        } catch (Error e) {
            return 0;
        }
    }

}
