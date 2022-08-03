package flames;



import java.lang.*;
import java.util.*;

 class Flames {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner s= new Scanner(System.in);
   System.out.println("enter the first name");
   String s1=s.nextLine();
   System.out.println("enter the second name");
   String s2=s.nextLine();
   s1=s1.replaceAll("\\s1",  "");
   s2=s2.replaceAll("\\s",  "" );
   s1=s1.toLowerCase();
   s2=s2.toLowerCase();
   char a[]=s1.toCharArray();
   char b[]=s2.toCharArray();
   for(int i=0;i<a.length;i++)
   {
	   for(int j=0;j<b.length;j++)
	   {
		   if(a[i]==b[j])
		   {
			   a[i]=' ';
			   b[j]=' ';
			   break;
		   }
	   }
	}

   int count=0;
  for(int i=0;i<a.length;i++) { 
	  if(a[i]!=' ')
		  count++;
  }
  for(int i=0;i<b.length;i++) {
	  if(b[i]!=' ')
		  count++;
  }
  
  String word="Flames";
  
  char Flame[]=word.toCharArray();
  int value=0;
  int end=0;
  
  for(int i=0;i<count*10;i++) {
	  if(i==Flame.length) {
		  i=0;
	  }
	  if(Flame[i]!=' ') {
		  value++;
		  
	  }
	  if(count==value) {
		  Flame[i]=' ';
		  value=0;
		  end++;
	  }
	  if(end==5)
		  break;
  }
  char relationship=' ';
  for(int i=0;i<Flame.length;i++) {
	  if(Flame[i]!=' ') {
		  relationship=Flame[i];
	  }
  }
  switch(relationship) {
  case 'f': System.out.println("Relationship : Friends");
  break;
  case 'l': System.out.println("Relationship : Love");
  break;
  case 'a': System.out.println("Relationship : Affection");
  break;
  case 'm': System.out.println("Realtionship : Marriage");
  break;
  case 'e': System.out.println("Realtionship : Enemy");
  break;
  case 's': System.out.println("Relationship : Sister");
  break;
  }
}
 }
