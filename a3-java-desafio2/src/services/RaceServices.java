package services;

import java.util.ArrayList;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class RaceServices {
    public TreeMap<Integer, ArrayList<Integer>> raceList = new TreeMap<Integer, ArrayList<Integer>>();



    public RaceServices() {
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        raceList.put(1, emptyList);
        raceList.put(2, emptyList);
        raceList.put(3, emptyList);
    }

    public void insertParticipant(int personId, int corridaId) {
        ArrayList<Integer> participants = this.getParticipants(corridaId);
        participants.add(personId);

        raceList.put(corridaId, participants);
    }

    public void removeParticipant(int personId, int corridaId) {
        ArrayList<Integer> participants = this.getParticipants(corridaId);
        participants.remove(personId);

        raceList.put(corridaId, participants);
    }

    public ArrayList<Integer> getParticipants(int corridaId) {
       ArrayList<Integer> participants = raceList.get(corridaId);
       return participants;
    }

    public long calculateFee(int age, int corridaId) {
        return 10;
    }
}
