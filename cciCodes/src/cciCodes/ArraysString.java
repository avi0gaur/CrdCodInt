package cciCodes;

public class ArraysString {
  public boolean isUniqueChars2(String str){
	  //this is so cool
	  //256 is the max limit if all are unique character including spcl char
	  if(str.length() > 256)
		  return false;
	  boolean[] char_set = new boolean[256]; //creating a boolean array
	  for(int i = 0;i<str.length();i++)
	  {
		  //Using ASCII value of character we will store in boolean array at Ascii value place 
		  //eg a(ASCII-97) we will store true at 97 index of array
		  int val = str.charAt(i);
		  if(char_set[val]){
			  return false;
	  }
		  char_set[val]=true;
	  }
	  return true;
  }
}
