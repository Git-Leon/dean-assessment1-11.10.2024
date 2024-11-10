# StringUtils
* Ensure each of the test cases in the class [StringUtils]() successfully passes upon completion of each of the method stubs in the class [StringUtilsTest]().
    * `String[] getWords(String sentence)`
    * `String getFirstWord(String sentence)`
    * `String reverseFirstWord(String sentence)` 
    * `String reverseFirstWordThenCamelCase(String sentence)`
    * `String removeCharacterAtIndex(String str, int index)`
    






<br><br><br><br>
## `String[] getWords(String sentence)`
* **Description**
    * Given a string containing words delimited by spaces, representative of a sentence, return an array of strings, each element representative of a respective word in the sentence.

### Example
* Sample Script

    ```
    // Given 
    String inputString = "Once upon a time there was a method";

    // When
    String[] outcome = StringUtils.getWords(inputString);

    // Then
    String outcomeStr = Arrays.toString(outcome);
    System.out.println(outcomeStr);
    ```

* Sample Output

    ```
    [Once, upon, a, time, there, was, a, method]
    ```
    
    
    
    
    
    
    


<br><br><br><br>
## `String getFirstWord(String sentence)`
* **Description**
    * given a string containing words delimited by spaces, representative of a sentence, return the first word of the sentence

### Example
* Sample Script

    ```
    // Given 
    String inputString = "Make sure to commit your code";

    // When
    String outcome = StringUtils.getFirstWord(inputString);

    // Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    Make
    ```
    

    

<br><br><br><br>
## `String reverseFirstWord(String sentence)`
* **Description**
    * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order.

### Example
* Sample Script

    ```
    // Given 
    String inputString = "Super class sea turtle";
    
    // When
    String outcome = StringUtils.reverseFirstWord(inputString);
    
    // Then
    System.out.println(outcome);
    ```



* Sample Output

    ```
    repuS
    ```
    
    
    
    

<br><br><br><br>
## `String reverseFirstWordThenCamelCase(String sentence)`
* **Description**
    * given a string containing words delimited by spaces, representative of a sentence, return the first word with identical contents in reverse order with the first character capitalized.

### Example
* Sample Script

    ```
   // Given
   String inputString = "Spoons are for scooping";
   
   // When
   String actual = StringUtils.reverseFirstWordThenCamelCase(inputString);

   // Then
   System.out.println(outcome);
    ```

* Sample Output

    ```
    Snoops
    ```



  
    

<br><br><br><br>
## `String removeCharacterAtIndex(String str, int index)`
* **Description**
    * given a string and index, return an identical string excluding the character at the specified index.

### Example
* Sample Script
    ```
   // Given
   String inputString = "Goal";
   Integer characterIndex = 2;
   
   // When
   String outcome = StringUtils.removeCharacterAtIndex(inputString, characterIndex);

   // Then
   System.out.println(outcome);
    ```



* Sample Output

    ```
    Gol
    ```

