import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner whoareyou = new Scanner(System.in);
        Scanner name = new Scanner(System.in);

        System.out.println("Hello! Welcome to this RPG! Now, let's start with your name.");
        try{Thread.sleep(3500);}
        catch(InterruptedException e){
            e.printStackTrace();}
        String Name = name.next();
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
        switch (youare) {
            case 1:
                User_Character a = new User_Character(20, 20, 175, 60, 80, 70);
                a.settype("Mage");
                a.setmoney(100);
                System.out.println("Ah, so you're a " + a.gettype() + ", eh?");
                try { Thread.sleep(3500); }
                catch (InterruptedException e) {
                    e.printStackTrace();}
                Opponent_1 A = new Opponent_1();
                runGame(a, A);
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
        System.out.println("Geez, you should've just said so before!");
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You know, back in my day, I was quite a good " + x.gettype() + " myself!");
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
        System.out.println("| Please sign up at the kingdom's capital, Valentia, before the 44th  |");
        System.out.println("| of Floatsym. We hope to see you there!                              |");
        System.out.println("|                                                                     |");
        System.out.println("|                                                                     |");
        System.out.println("|                                                                     |");
        System.out.println("|                                                                     |");
        System.out.println("|                                  - The Royal Court of King Rudolf   |");
        System.out.println("|_____________________________________________________________________|");
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
                                //                               else {
                                //                                   System.out.println("Decided not to buy the supplement."); }
                                break;
                            case 2:
//                            System.out.println("Do you want to buy Super Magic Boost supplement for 500 gold coins?");
                                //                           String supplement = yesorno.next();
                                //                           if (supplement = "Yes" | supplement = "yes"){
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
                        int[][] dungeon;
                        dungeon = new int[5][5];
                        dungeon[0][0] = x.money += 0;

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
                        Scanner column = new Scanner(System.in);
                        System.out.println("Which dungeon row? Choose 0, 1, 2, 3, or 4.");
                        int r = row.nextInt();
                        System.out.println("Which dungeon column? Choose 0, 1, 2, 3, or 4.");
                        int c = column.nextInt();
                        x.money += dungeon[r][c];
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

                while(x.health>0 && opponent1.health>0){
                    System.out.println("Player" + " v.s " + opponent1.Nname);
                    System.out.println(x.health + " v.s " + opponent1.health);
                    x.attack(opponent1);
                    System.out.println("Player" + " attacked and dealt "+ opponent1.reattack(x) + " damage!");
                    opponent1.reattack(x);
                    System.out.println(opponent1.Nname+ " attacked and dealt "+ opponent1.reattack(x) + " damage!");
                }
                if (x.isAlive()) {
                    System.out.println ("Player wins!");
                }
                else if (opponent1.isAlive()){
                    System.out.println (opponent1.Nname + " wins!");
                }
                else {
                    System.out.println ("It's a draw!");
                }
            }
            else{
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

                  if (x.isAlive()) {
                  System.out.println (x.type+" wins!");
                  }
                  else if (opponent1.isAlive()){
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


