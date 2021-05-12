import java.util.*;

public class LRUTest {


}

class LRUCache {

    private Map<Integer,Integer> resultMap = new HashMap<>();

    private List<Integer> useList = new LinkedList<>();

    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        Integer value = resultMap.get(key);
        if (value == null){
            return -1;
        }
        Iterator<Integer> iterator = useList.iterator();
        while (iterator.hasNext()){
            if (iterator.next().equals(key)){
                iterator.remove();
            }
        }
        useList.add(key);
        return value;
    }

    public void put(int key, int value) {
        //当前使用的列表大于等于容量，移除
        if (useList.size() >= capacity){
            if (useList.contains(key)){
                Iterator<Integer> iterator = useList.iterator();
                while (iterator.hasNext()){
                    if (iterator.next().equals(key)){
                        iterator.remove();
                    }
                }
            }else {//
                Integer removeKey = useList.get(0);
                useList.remove(0);
                resultMap.remove(removeKey);
            }
        }
        resultMap.remove(key);
        resultMap.put(key,value);
        useList.add(key);
    }


    /**
     * Your LRUCache object will be instantiated and called as such:
     * LRUCache obj = new LRUCache(capacity);
     * int param_1 = obj.get(key);
     * obj.put(key,value);
     */

}