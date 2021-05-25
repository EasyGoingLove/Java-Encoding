# Java-Encoding
![image](https://user-images.githubusercontent.com/50263561/119373252-e2d0a780-bcc0-11eb-9424-6403f280fedb.png)
  
     if(subcode == "" ||subcode ==null ||message==""||message==null ){return null;}



        char[] ch  = message.toCharArray();
        int [] possition = new int[message.length()+1];
        int counter = 0;
        String finalString;
        char codedString[] = new char[50];

            for(char c : ch){
                int temp = (int)c;
                int temp_integer = 96; //for lower case
                if(temp<=122 & temp>=97)
                possition[counter] = temp-temp_integer - 1 ;
                counter++;
                
            }
            for (int i = 0; i < possition.length; i++) {
                codedString[i] = subcode.charAt(possition[i]);
            }

            finalString= String.valueOf(codedString);
            return finalString.toUpperCase();
    }
