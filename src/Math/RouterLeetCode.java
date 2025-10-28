package Math;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

class Packet {
    int source;
    int destination;
    int timestamp;

    public Packet(int source, int destination, int timestamp) {
        this.source = source;
        this.destination = destination;
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Packet packet = (Packet) obj;
        return source == packet.source
                && destination == packet.destination
                && timestamp == packet.timestamp;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(source, destination, timestamp);
    }
}

public class RouterLeetCode {
    int memoryLimit;
    ArrayDeque<Packet> packetArrayDeque = new ArrayDeque<>();
    HashSet<Packet> packetHashSet = new HashSet<>();
    Map<Integer, TreeMap<Integer, Integer>> packetMap = new HashMap<>();

    public RouterLeetCode(int memoryLimit) {
        this.memoryLimit = memoryLimit;
    }

    public boolean addPacket(int source, int destination, int timestamp) {
        if (packetHashSet.contains(new Packet(source, destination, timestamp)))
            return false;
         if (packetArrayDeque.size() >= memoryLimit) {
            forwardPacket();
        }
        Packet packet = new Packet(source, destination, timestamp);
        packetArrayDeque.add(packet);
        packetHashSet.add(packet);
        TreeMap<Integer, Integer> timeMap = packetMap.computeIfAbsent(destination, k -> new TreeMap<>());
        timeMap.put(timestamp, timeMap.getOrDefault(timestamp, 0) + 1);
        return true;
    }

    public int[] forwardPacket() {
        int[] pollPacket = new int[3];
        if (packetArrayDeque.isEmpty()) {
            return new int[0];
        }
        Packet forwardPacket = packetArrayDeque.poll();
        packetHashSet.remove(forwardPacket);
        TreeMap<Integer, Integer> timeMap = packetMap.get(forwardPacket.destination);

        if (timeMap != null) {
            int count = timeMap.getOrDefault(forwardPacket.timestamp, 0);
            if (count <= 1) {
                timeMap.remove(forwardPacket.timestamp);
            } else {
                timeMap.put(forwardPacket.timestamp, count - 1);
            }
            if (timeMap.isEmpty()) {
                packetMap.remove(forwardPacket.destination);
            }
        }
        pollPacket[0] = forwardPacket.source;
        pollPacket[1] = forwardPacket.destination;
        pollPacket[2] = forwardPacket.timestamp;
        return pollPacket;
    }

    public int getCount(int destination, int startTime, int endTime) {
        int count = 0;
        if (!packetMap.containsKey(destination))
            return 0;
        TreeMap<Integer, Integer> timestamp = packetMap.get(destination);
        SortedMap<Integer, Integer> subTimestampMap = timestamp.subMap(Integer.valueOf(startTime), true,
                Integer.valueOf(endTime), true);
        for (int i : subTimestampMap.values()) {
            count += i;
        }
        return count;
    }
}
