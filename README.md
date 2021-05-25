# Java-Encoding
![image](https://user-images.githubusercontent.com/50263561/119373252-e2d0a780-bcc0-11eb-9424-6403f280fedb.png)
  
 
     if(subcode == "" ||subcode ==null){return null;}
        
        for (int i = 0; i < subcode.length(); i++) {
            char ch = subcode.charAt(i);
        if (Character.isLetter(ch) && subcode.indexOf(ch, i + 1) != -1  || !Character.isLetter(subcode.charAt(i)) || subcode.length()!=26) {
             return null; 
          }
        }

        char alphabet[] = new char[26];
        int[] correctPositions = new int[26];
        char output[] = new char[100];
        int arrayCounter = 0;
    
        for(char c = 'a'; c <= 'z'; c++){
            alphabet[arrayCounter] = c;
            arrayCounter++;
         }
    
        for (int i = 0; i < subcode.toLowerCase().length(); i++) {
            for (int j = 0; j < subcode.toLowerCase().length(); j++) {
                if(alphabet[i] == subcode.toLowerCase().charAt(j)){
                    correctPositions[i] = j;
                }
            }
        }
        for (int i = 0; i < correctPositions.length; i++) {
            output[i] = alphabet[correctPositions[i]] ;
        }
    
        String outputString = String.valueOf(output);
        System.out.println(outputString.toUpperCase());
        return outputString.toUpperCase();
