public class Main {


public static void main(String[] args) {
//test
   var dog = 8.0 ;
   System.out.println(dog);
   var cat = 3.6;
   System.out.println(cat);
   var paper = 763789 ;
   System.out.println(paper);

   dog = dog + 2;
   System.out.println(dog );
   cat = cat + 2;
   System.out.println(cat);
   paper = paper + 2;
   System.out.println(paper);

   dog = dog - 3.5;
   System.out.println(dog);
   cat = cat - 1.6;
   System.out.println(cat);
   paper = paper - 7639;
   System.out.println(paper);

   var friend = 19;
   System.out.println(friend);
   friend = friend + 2;
   System.out.println(friend);
   friend = friend / 7;
   System.out.println(friend);

   var frog = 3.5;
   System.out.println(frog);
   frog = frog * 10;
   System.out.println(frog);
   frog = frog / 3.5;
   System.out.println(frog);
   frog = frog + 4;
   System.out.println(frog);

   var ferstWeight = 78.2;
   System.out.println(ferstWeight);
   var secondWeight = 82.7;
   System.out.println(secondWeight);
   var totalWeight = ferstWeight + secondWeight;
   System.out.println("Общая масса " + totalWeight + " кг!");
   var diffeerenceWeight = ferstWeight - secondWeight;
   System.out.println("Разница в весе " + diffeerenceWeight + " кг!");

   var overLoad =secondWeight % ferstWeight;
   System.out.println("Разница между бойцами " + overLoad + " кг!");

   var time = 640;
   System.out.println(time);
   var timeOfOneEmployee = 8;
   System.out.println(timeOfOneEmployee);
   var numberOfEmployees = time / timeOfOneEmployee;
   System.out.println("Всего в компании " + numberOfEmployees + " человек");
   var morePeople = numberOfEmployees + 94;
   System.out.println(morePeople);
   var openingHours = morePeople * timeOfOneEmployee;
   System.out.println(openingHours);
   System.out.println("Если в компании работает " + morePeople + " человека,то всего " + openingHours + " часов работы может быть поделено между сотрудниками ");

   }
}