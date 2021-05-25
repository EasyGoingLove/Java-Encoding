# Java-Encoding
![image](https://user-images.githubusercontent.com/50263561/119373252-e2d0a780-bcc0-11eb-9424-6403f280fedb.png)
  
        if(subcode=="" || subcode ==null){return false;}
        for (int i = 0; i < subcode.length(); i++) {
             char ch = subcode.charAt(i);
            if (Character.isLetter(ch) && subcode.indexOf(ch, i + 1) != -1  || !Character.isLetter(subcode.charAt(i)) || subcode.length()!=26) {
                System.out.println("flase");  return false;
             }
         }
         System.out.println("True");
          return true;
     }
