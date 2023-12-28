package com.example.prac.Lv2;

import java.util.*;

public class OpenChatRoom {


      private static String ENTER_MSG = "%s님이 들어왔습니다.";
    private static String LEAVE_MSG = "%s님이 나갔습니다.";
    
    public String[] solution(String[] record) {
        
        Map<String,String> idNameMap = new HashMap<>();
        List<String> inOut = new ArrayList<>();
        
        for (String r : record){
            
            String[] parts = r.split(" ");
            String action = parts[0];
            String id = parts[1];

            if (parts.length > 2) {
                String name = parts[2];
                idNameMap.put(id, name);
            }

            if (!action.equals("Change")){
                inOut.add(action + " " + id);
            }

        }
        
        String[] answer = new String[inOut.size()];
        
        for (int i = 0; i < inOut.size(); i++){
            String[] parts = inOut.get(i).split(" ");

            String acitonMsg = "Enter".equals(parts[0]) ? ENTER_MSG : LEAVE_MSG;
            String id = parts[1];
            answer[i] = String.format(acitonMsg, idNameMap.get(id));
        }
        
        return answer;
    }
}
