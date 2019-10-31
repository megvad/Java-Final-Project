import java.util.Scanner;
// To import the Scanner class to ask the player questions
import java.util.Random;
// To import the Random class to obtain random numbers

public class Main {

    public static void main(String[] args) {
        Scanner whoareyou = new Scanner(System.in);
        // To ask the user what type of character they are
        Scanner name = new Scanner(System.in);
        // To ask the user their name

        System.out.println("Hello! Welcome to this RPG! Now, let's start with your name.");
        // Printing out dialogue on the screen
        try{Thread.sleep(3500);}
        catch(InterruptedException e){
            e.printStackTrace();}
        // This thread ensures that the function waits for 3500 milliseconds. This gives enough time for the player to read
        // the dialogue.
        String Name = name.next();
        // Asks for the user's name and stores it as a String variable
        System.out.println("Ah, so you're "+Name+", right?");
        try { Thread.sleep(3500); }
        catch (InterruptedException e) {
            e.printStackTrace(); }
        System.out.println("Well, "+Name+", let's set the scene...");
        try { Thread.sleep(3500); }
        catch (InterruptedException e) {
            e.printStackTrace(); }
        System.out.println("It's a dark and stormy night. The wind is howling, the trees are rattling, and you're all alone in your tiny hut...");
        try{Thread.sleep(3500);}
        catch(InterruptedException e){
            e.printStackTrace();}
        System.out.println("Huh? You don't like that? What do you mean you don't live in a hut?");
        try{Thread.sleep(3500);}
        catch(InterruptedException e){
            e.printStackTrace();}
        System.out.println("Okay, FINE. I guess you don't have to be poor. Or whatever.");
        try{Thread.sleep(3500);}
        catch(InterruptedException e){
            e.printStackTrace();}
        System.out.println("(Loser.)");
        try{Thread.sleep(3500);}
        catch(InterruptedException e){
            e.printStackTrace();}
        System.out.println("Alright, so if you're not an underprivileged peasant, then what are you?");
        System.out.println("Type 1 for Mage, 2 for Knight, 3 for Rouge, 4 for Mercenary, or 5 for Healer");
        int youare = whoareyou.nextInt();
        // Asks the user to types in a number that will determine what type of character they will play as
        // The number is stores as an int variable
        switch (youare) {
        // The switch statement will call upon the value of int youare. That value will determine the case that the program will follow
        // This switch statement assigns the stats for the character
        // The case number is determined by int youare (i.e, if the user types in 2 when prompted for what type of character
        // they want, 2 is stored in int youare and is then called upon to see which type of case it will lead to.
            case 1:
                User_Character a = new User_Character(20, 20, 175, 60, 80, 70);
                // Class Character has established the stats for strength, defense, health, speed, magic, and magic defense.
                // Inuptting thhe numbers right into the User_Character class automatically assigns these numbers to their
                // corresponding int variables.
                a.settype("Mage");
                // Setting the type of character as the string "Mage"
                a.setmoney(100);
                // Setting the amount of money the character has. This is constant for all types of characters.
                // Money will help in buying objects to increase stats.
                System.out.println("Ah, so you're a " + a.gettype() + ", eh?");
                // The a.gettype() calls the type of character from User_Character a. 
                try { Thread.sleep(3500); }
                catch (InterruptedException e) {
                    e.printStackTrace();}
                Opponent_1 A = new Opponent_1();
                // Later in the game, the player must face off against an opponent. This establishes the opponent and their
                // stats in the Opponent_1 class.
                runGame(a, A);
                // As the game requires a large number of variables to optimize player input and keep track of how desicions
                // made by the player can effect gameplay, it would be easier to have the game itself run as its own separate
                // program, and the classes are what store the variables. The various iterations of runGame (i.e, runGame (a, A),
                // (b, B), (c, C), etc.) are already set with the possible character types and their corresponding stats.
                // Now, all the player must do is select which version of runGame they want.
                break;
            case 2:
                User_Character b = new User_Character(70, 60, 150, 50, 0, 20);
                b. settype("Knight");
                b.setmoney(100);
                System.out.println("Ah, so you're a " + b.gettype() + ", eh?");
                try { Thread.sleep(3500); }
                catch (InterruptedException e) {
                    e.printStackTrace();}
                Opponent_1 B = new Opponent_1();
                runGame(b, B);
                break;

            case 3:
                User_Character c = new User_Character(50, 50, 150, 80, 10, 20);
                c.settype("Rouge");
                c.setmoney(100);
                System.out.println("Ah, so you're a " + c.gettype() + ", eh?");
                try { Thread.sleep(3500); }
                catch (InterruptedException e) {
                    e.printStackTrace();}
                Opponent_1 C = new Opponent_1();
                runGame(c,C);
                break;
            case 4:
                User_Character d = new User_Character(70, 70, 160, 35, 0, 15);
                d.settype("Mercenary");
                d.setmoney(100);
                System.out.println("Ah, so you're a " + d.gettype() + ", eh?");
                try { Thread.sleep(3500); }
                catch (InterruptedException e) {
                    e.printStackTrace();}
                Opponent_1 D = new Opponent_1();
                runGame(d,D);
                break;
            case 5:
                User_Character f = new User_Character(10, 100, 250, 50, 20, 100);
                f.setmoney(100);
                f.settype("Healer");
                System.out.println("Ah, so you're a " + f.gettype() + ", eh?");
                try { Thread.sleep(3500); }
                catch (InterruptedException e) {
                    e.printStackTrace();}
                Opponent_1 F = new Opponent_1();
                runGame(f, F);
                break;
        }
    }

    public static void runGame (User_Character x, Opponent_1 opponent1) {
        // User_Character x is indication in this runGame function that it is a class we'll be using, and x is the variable
        // that will be substituted for by a, b, c, d, etc., depending on the class chosen. I.e, if the user choses the mage
        // class, they set the User_Character class as all stats for the mage, making it User_Character a. The function runGame
        // needs to be told to call upon the stats within User_Class a.
        // Keeping pertinent variables under a class makes the program more organized and shorter
        System.out.println("Geez, you should've just said so before!");
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You know, back in my day, I was quite a good " + x.gettype() + " myself!");
        // x.gettype: calls upon the type of character from whatever was chosen.
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Ah, whatever. Doesn't matter now. You know, I think you and I are going to get along great.");
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("That is, if you'd JUST LET ME FINISH.");
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Capiche? Alright, let's start the story again:");
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You're a " + x.gettype() + ", living in a palace or house or whatever. Anyways, that very night, you hear a knock on the door.");
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You open it, but - surprise! - no one's there, except for a crumpled up letter.");
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("______________________________________________________________________");
        System.out.println("|                                                                     |");
        System.out.println("|                                                                     |");
        System.out.println("| Hello, to all whom this may concern:                                |");
        System.out.println("|        You are cordially invited to the kingdom's grand tournament! |");
        System.out.println("| This ultimate competition of the brains and the brawn shall prove   |");
        System.out.println("| who in this kingdom is the strongest! The winner will receive a lif-|");
        System.out.println("| etime's supply of gold and riches, along with the greatest prestige |");
        System.out.println("| and renown. All are welcome to enter and magical items are allowed. |");
        //       System.out.println("| You are even allowed a team of up to 5 others of any type.          |");
        //        ^^ This part is was removed in the final version of the game, as I have yet to implement recruiting others to your team.
        System.out.println("| Please sign up at the kingdom's capital, Valentia, before the 44th  |");
        System.out.println("| of Floatsym. We hope to see you there!                              |");
        System.out.println("|                                                                     |");
        System.out.println("|                                                                     |");
        System.out.println("|                                                                     |");
        System.out.println("|                                                                     |");
        System.out.println("|                                  - The Royal Court of King Rudolf   |");
        System.out.println("|_____________________________________________________________________|");
        // An attempt as ASCII art!
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hey, aren't you pretty strong? Strong enough to WIN?");
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Wait, whaddya mean you don't think so? I mean, yeah, I GUESS that there are only 7 days to train...");
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        System.out.println("And, well, sure you're the only person on your team...");
 //       try {
 //           Thread.sleep(3500);
 //       } catch (InterruptedException e) {
 //           e.printStackTrace();
 //       }
        System.out.println("But hey! 7 days! You can do anything in that time period! So hop to it! Your training starts tomorrow!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <= 7; i++) {
            // The for loop begins! the integer variable i will the used to keep track of the progressing days.
            // i++ adds 1 to the previous value of i (in this case, 1 becomes 2), for every loop
            // i must not exceed (but can be equal to) 7, as this is the number of days
            System.out.println("====================================");
            System.out.println("DAY " + i);
            System.out.println("====================================");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Rise and shine, you darn " + x.gettype() + "!");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("How do you want to spend today?");
            Scanner whattodo = new Scanner(System.in);
            System.out.println("1. Training");
            System.out.println("2. Shopping");
            System.out.println("3. Sleeping");
            System.out.println("4. Exploring Dungeons");
            int firstchoice = whattodo.nextInt();
            // This asks the player what they'd like to do. 1, 2, 3, and 4 gives a value for int firstchoice, and this variable
            // ends up in the switch statement. It determines which case the program will follow
            switch (firstchoice) {
                case 1:
                    System.out.println("Let's train!");
                    try {
                        Thread.sleep(3500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("What would you like to train?");
                    System.out.println("1. Strength");
                    System.out.println("2. Defense");
                    System.out.println("3. Speed");
                    System.out.println("4. Magic");
                    System.out.println("5. Magical Defense");
                    Scanner whattotrain = new Scanner(System.in);
                    int training = whattotrain.nextInt();
                    // Another switch case to see which stat the player would like to increase
                    switch (training) {
                        case 1:
                            System.out.println("You threw plenty of punches at a punching bag! Strength + 7!");
                            try {
                                Thread.sleep(3500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            x.strength += 7;
                            break;
                     // break will end the switch statement, thereby causing the loop to restart
                        case 2:
                            System.out.println("You pretended to be a punching bag! Defense + 7!");
                            try {
                                Thread.sleep(3500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            x.defense += 7;
                            break;
                        case 3:
                            System.out.println("Who knew running track would do you good? Speed + 7!");
                            try {
                                Thread.sleep(3500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            x.speed += 7;
                            break;
                        case 4:
                            System.out.println("Well, you wouldn't call yourself a magician, but /wow/, you do know how to throw a good fireball! Magic + 7!");
                            try {
                                Thread.sleep(3500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            x.magic += 7;
                            break;
                        case 5:
                            System.out.println("Whoa! You can make magical shields! Those darn wizards get all the cool stuff... Magical Defense + 7!");
                            try {
                                Thread.sleep(3500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            x.magicaldefense += 7;
                            break;
                    }
                    System.out.println("Phew! All that training must have made you tired! Time for bed. Goodnight!");
                    try {
                        Thread.sleep(3500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    System.out.println("Let's go to the store and buy some magic items!");
                    try {
                        Thread.sleep(3500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("====================================");
                    System.out.println("                 SHOP               ");
                    System.out.println("====================================");
                    System.out.println("You have " + x.money + " gold coins.");
                    // since money is a variable in the User_Character class, it is being called upon over here
                    if (x.money < 500) {
                        try {
                            Thread.sleep(3500);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("You can't buy anything here! Go dungeon exploring for more money.");
                    } else {
                        System.out.println("What would you like to do?");
                        System.out.println("1. Buy health boost");
                        System.out.println("2. Buy magic boost");
                        System.out.println("3. Buy strength boost");
                        System.out.println("4. Buy defense boost");
                        System.out.println("5. Buy speed boost");
                        System.out.println("6. Buy magical defense boost");
                        System.out.println("7. Exit");
                        Scanner whattobuy = new Scanner(System.in);
                        //                       Scanner yesorno = new Scanner (System.in);
                        int buy = whattobuy.nextInt();
                        switch (buy) {
                            case 1:
//                                System.out.println("Do you want to buy Super Health Boost supplement for 500 gold coins?");
//                                String supplement = yesorno.next();
//                                if (supplement = "Yes" | supplement = "yes"){
                                x.money -= 500;
                                System.out.println("You got the Super Health Boost! +50 health!");
                                x.health += 50;
                                //  else {
                                //         System.out.println("Decided not to buy the supplement."); }
                                break;
                            case 2:
//                            System.out.println("Do you want to buy Super Magic Boost supplement for 500 gold coins?");
                                //  String supplement = yesorno.next();
                                //  if (supplement = "Yes" | supplement = "yes"){
                                x.money -= 500;
                                System.out.println("You got the Super Magic Boost! +50 health!");
                                x.magic += 50;
//                            else {
//                                System.out.println("Decided not to buy the supplement."); }
                                break;
                            case 3:
                                x.money -= 500;
                                System.out.println("You got the Super Strength Boost! +50 strength!");
                                x.strength += 50;
                                break;
                            case 4:
                                x.money -= 500;
                                System.out.println("You got the Super Defense Boost! +50 health!");
                                x.defense += 50;
                                break;
                            case 5:
                                x.money -= 500;
                                System.out.println("You got the Super Speed Boost! +50 health!");
                                x.speed += 50;
                                break;
                            case 6:
                                x.money -= 500;
                                System.out.println("You got the Super Magical Defense Boost! +50 health!");
                                x.magicaldefense += 50;
                                break;
                            case 7:
                                System.out.println("Decided to leave.");
                                break;
                        }
                    }
                    System.out.println("Phew! That trip to the store was draining! Time for bed! Goodnight!");
                    try {
                        Thread.sleep(3500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.println("You...uh...decide to stay in and sleep.");
                    try {
                        Thread.sleep(3500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("(Lame.)");
                    try {
                        Thread.sleep(3500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    System.out.println("Let's go dungeon exploring! You only have 3 chances!");
                    try {
                        Thread.sleep(3500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    for (int q = 0; q < 3; q++) {
                        // int q will keep track of the number of times the player is allowed to explore.
                        // Like int i for the days, this increases for every consecutive run of the loop, but will break
                        // upon reaching three
                        int[][] dungeon;
                        // creating a two-dimensional array!
                        dungeon = new int[5][5];
                        // this array will have 5 rows and 5 columns, thereby having 25 boxes
                        dungeon[0][0] = x.money += 0;
                        // each coordinate in the array will contain some amount of money. By setting each coordinate to a 
                        // specific numerical value, the player can choose their coordinates and gain money from it
                        dungeon[0][1] = 30;
                        dungeon[0][2] = 50;
                        dungeon[0][3] = 0;
                        dungeon[0][4] = 90;
                        dungeon[1][0] = 15;
                        dungeon[1][1] = 30;
                        dungeon[1][2] = 45;
                        dungeon[1][3] = 60;
                        dungeon[1][4] = 75;
                        dungeon[2][0] = 20;
                        dungeon[2][1] = 40;
                        dungeon[2][2] = 0;
                        dungeon[2][3] = 60;
                        dungeon[2][4] = 80;
                        dungeon[3][0] = 5;
                        dungeon[3][1] = 0;
                        dungeon[3][2] = 20;
                        dungeon[3][3] = 25;
                        dungeon[3][4] = 100;
                        dungeon[4][0] = 30;
                        dungeon[4][1] = 60;
                        dungeon[4][2] = 75;
                        dungeon[4][3] = 90;
                        dungeon[4][4] = 100;
                        Scanner row = new Scanner(System.in);
                        // this will be used to ask the user for the row in which they'd like to search (aka, x value of coordinate)
                        Scanner column = new Scanner(System.in);
                        // this will be used to ask the user for the column in which they'd like to search (aka, y value of coordinate)
                        System.out.println("Which dungeon row? Choose 0, 1, 2, 3, or 4.");
                        int r = row.nextInt();
                        System.out.println("Which dungeon column? Choose 0, 1, 2, 3, or 4.");
                        int c = column.nextInt();
                        x.money += dungeon[r][c];
                        // the value of money from the User_Character class is changed by adding the value of the dungeon square
                        // chosen to the initial amount. dungeon [r][c] is a two dimensional array. The values of r and c inputted
                        // by the user are substituted in. For example, if the user types in 3 for r and 2 for c, the program
                        // searches through the arrays for dungeon [3][2], which has a value of of 20.
                        System.out.println("You found " + dungeon[r][c] + " gold!");
                    }
                    System.out.println("Phew! All that exploring must have made you tired! Time for bed. Goodnight!");
                    try {
                        Thread.sleep(3500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }

        }

            System.out.println("====================================");
            System.out.println("      THE DAY OF THE TOURNAMENT     ");
            System.out.println("====================================");
            System.out.println("Good morning, " + x.gettype() + "! You remember what today is, right?");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("RIGHT?????");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("It's time to head to the tournament in Valentia!");
            try {
                Thread.sleep(3500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           System.out.println("But before we go, do you have any last things you'd like to go over?");
            //   System.out.println("1. Check inventory.");
            //          System.out.println("2. Check teammates.");
            System.out.println("1. Check stats.");
            System.out.println("2. Nah, I'm good.");

            Scanner lastday = new Scanner(System.in);
            int lastchance = lastday.nextInt();
            if (lastchance != 2) {
                System.out.println("Strength: "+x.strength);
                System.out.println("Defense: "+x.defense);
                System.out.println("Speed: "+x.speed);
                System.out.println("Health: "+x.health);
                System.out.println("Magic: "+x.magic);
                System.out.println("Magical Defense: "+x.magicaldefense);
                System.out.println("Okay, I guess that's it!");
                try {
                    Thread.sleep(3500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Our big day!");
                try {
                    Thread.sleep(3500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("It's time to head to the colosseum!!");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("====================================");
                System.out.println("           TOURNAMENT TIME          ");
                System.out.println("====================================");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();}
                System.out.println("Time for the first round!");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace(); }
                System.out.println("====================================");
                System.out.println("           FIRST BATTLE             ");
                System.out.println("====================================");
                opponent1.getNname ("Kronk");
                // Opponent1 from the Opponent_1 class
                while(x.health>0 && opponent1.health>0){
                    System.out.println("Player" + " v.s " + opponent1.Nname);
                    System.out.println(x.health + " v.s " + opponent1.health);
                    x.attack(opponent1);
                    // Opponent 1's attacks have already been established in its respective class.
                    // x.attack for opponent1 decreases the health of the player depending on the player's defense.
                    // x.attack subtracts the player's defense stat from the opponent's attack stat. This difference is then
                    // subtracted from the player's health.
                    
                    System.out.println("Player" + " attacked and dealt "+ opponent1.reattack(x) + " damage!");
                    opponent1.reattack(x);
                    // x.reattack for the player decreases the health of the opponent depending on the opponent's defense. 
                    // x.reattack subtracts the opponent's defense stat from the player's attack stat. This difference is then
                    // subtracted from the opponent's health.
                    
                    System.out.println(opponent1.Nname+ " attacked and dealt "+ opponent1.reattack(x) + " damage!");
                }
                // This loop continues until either the player or the opponent has 0 or less than 0 health.
                // I would have liked to add more options and more randomness in this battle. For example, I would have liked
                // to have given the player the chance to use magical attacks, and that whoever has higher speed will go first.
                // In addition, I would have also added a set of values that would be randmonly chosen from to determine
                // if the opponent would do a regular attack or a magic attack.
                if (x.health>0) {
                    // If the player is the last one standing, they win!
                    System.out.println ("Player wins!");
                }
                else if (opponent.health>0){
                    System.out.println (opponent1.Nname + " wins!");
                    // If the opponent is the last one standing, they win!
                }
                else {
                    System.out.println ("It's a draw!");
                }
            }
            else{
                // This is the else statement to the if statement earlier, when the player was prompted whether or not they
                // wanted to check their stats.
                System.out.println("Okay, I guess that's it!");
                try {
                    Thread.sleep(3500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Our big day!");
                try {
                    Thread.sleep(3500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("It's time to head to the colosseum!!");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("====================================");
                System.out.println("           TOURNAMENT TIME          ");
                System.out.println("====================================");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();}
                System.out.println("Time for the first round!");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace(); }
                System.out.println("====================================");
                System.out.println("           FIRST BATTLE             ");
                System.out.println("====================================");
                opponent1.getNname ("Kronk");
                while(x.isAlive()&&opponent1.isAlive()){
                System.out.println(x.type + " v.s " + opponent1.Nname);
                System.out.println(x.health + " v.s " + opponent1.health);
                x.attack(opponent1);
                System.out.println(x.type + " attacked and dealt "+ opponent1.reattack(x) + " damage!");
                opponent1.reattack(x);
               System.out.println(opponent1.Nname+ " attacked and dealt "+ opponent1.reattack(x) + " damage!");
          }

                  if (x.health>0) {
                  System.out.println (x.type+" wins!");
                  }
                  else if (opponent1.health>0){
                      System.out.println (opponent1.Nname + " wins!");
                  }
                  else {
                      System.out.println ("It's a draw!");
 //               while (x.health>0 && opponent1.health>0){
 //                   System.out.println("Player" + " v.s " + opponent1.Nname);
 //                   System.out.println(x.health + " v.s " + opponent1.health);
   //                 try {Thread.sleep(2000);
     //               } catch (InterruptedException e) {
       //             e.printStackTrace(); }
         //           System.out.println("What type of attack should we use?");
           //         System.out.println("1. Regular attack");
             //       System.out.println("2. Magic attack");
               //     Scanner typeofattack = new Scanner(System.in);
                 //   int attacktype = typeofattack.nextInt();
                   // if (attacktype == 1){
                     //   System.out.println("You used a physical attack!");
                       // try {
                         //   Thread.sleep(3000);
//                        } catch (InterruptedException e) {
  //                          e.printStackTrace(); }
    //
      //              }
        //            else{
          //              System.out.println("You used a magical attack!");
            //            try {
              //              Thread.sleep(3000);
                //        } catch (InterruptedException e) {
                  //          e.printStackTrace(); }
                    //}
                }
                }
            }}


