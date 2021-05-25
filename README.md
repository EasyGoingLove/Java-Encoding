# Java-Encoding
![image](https://user-images.githubusercontent.com/50263561/119373252-e2d0a780-bcc0-11eb-9424-6403f280fedb.png)
  

 if(subcode == "" ||subcode ==null){return null;}
        
        
        
        if(largeamountoftext=="" || largeamountoftext ==null){return null;}
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> charCountMap = new HashMap<>();

        int len = largeamountoftext.length();
         for(int i = 0; i < len; i++) {
              char ch = largeamountoftext.charAt(i);
              charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
         }
         charCountMap.entrySet().stream()
                     .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
                    .forEach(record -> {
                       Character key = record.getKey();
                       for(int i = 0; i < 1; i++) {
                             sb.append(key);
                        }
           });
           return sb.toString();
