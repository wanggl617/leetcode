package Map;
import java.util.*;
public class TreeMapTest {
    public static void main(String[] agrs){
        //创建TreeMap对象：
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        System.out.println("初始化后,TreeMap元素个数为：" + treeMap.size());
 
        //新增元素:
        treeMap.put(1,"hello");
        treeMap.put(6,"6666");
        treeMap.put(3,"who");
        treeMap.put(2,"world");
        treeMap.put(4,"are");
        treeMap.put(5,"you");
        treeMap.put(7,"77");
        System.out.println("添加元素后,TreeMap元素个数为：" + treeMap.size());
 
        //遍历元素：
        for(Integer key : treeMap.keySet()){
            System.out.println(key+":"+treeMap.get(key));
        }
 
        
 
        //获取元素：
        //获取集合内第一个元素
        Integer firstKey = treeMap.firstKey();
        //获取集合内最后一个元素
        Integer lastKey =treeMap.lastKey();
        //获取集合内的key小于"huangqiuping"的key
        Integer lowerKey =treeMap.lowerKey(3);
        //获取集合内的key大于等于"huangqiuping"的key
        Integer ceilingKey =treeMap.ceilingKey(4);
        //获取集合的key从"a"到"huangqiuping"的元素
        SortedMap<Integer,String> sortedMap =treeMap.subMap(2,6);
 
        //删除元素：
        //删除集合中key为"huangqiuping"的元素
        String removeValue = treeMap.remove(7);
        //清空集合元素：
        treeMap.clear(); 
 
        //判断方法：
        //判断集合是否为空
        boolean isEmpty = treeMap.isEmpty();
        //判断集合的key中是否包含"huangqiuping"
        boolean isContain = treeMap.containsKey(3);
    }
}
