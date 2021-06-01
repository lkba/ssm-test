package com.lkb.test.za7za8;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//面试题
public class mstest {
    public static void main(String[] args) {
//        List<stu>
//        Stu:id name classid
//        Map
        Stu stu=new Stu("1","1","111");
        Stu stu2=new Stu("2","2","111");
        Stu stu3=new Stu("3","3","222");
        Stu stu4=new Stu("4","4","444");
        Stu stu5=new Stu("5","5","222");
        List<Stu>  list=new LinkedList<>();
        list.add(stu);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);

        Map<String ,List<Stu>> map =new HashMap<>();
        for (Stu st:list){
            List<Stu> stuList=map.get(st.getClassId());
            if(stuList!=null && !stuList.isEmpty()){
                stuList.add(st);
                map.put(st.getClassId(),stuList);
            }else {
                List<Stu> stuList2=new LinkedList<>();
                stuList2.add(st);
                map.put(st.getClassId(),stuList2);
            }
        }

        System.out.println(map.toString());
        System.out.println(getResult(map,list));

    }


    public static Map<String ,List<Stu>> getResult(Map<String ,List<Stu>> map,List<Stu> list){

        return map;
    }
}
