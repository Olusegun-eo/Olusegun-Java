package chapterSix;

import java.util.Scanner;

public class PhoneMenuApp {

    private static int userResponse;
    private static String menu;
    private static String subMenu;
    private static String phoneBook;


    public static void main(String... args) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Welcome To The List of Phone Functionalities");
        System.out.println("Enter a Number ");

        while (true) {
            String prompt = """
                                        
                    1 ––>Phone book
                    2 ––>Messages
                    3 ––>Chat
                    4 ––>Call register
                    5 ––>Tones
                    6 ––>Settings
                    7 ––>Call divert
                    8 ––>Games
                    9 ––>Calculator
                    10 ––>Reminders
                    11 ––>Clock
                    12 ––>Profiles
                    13 ––>Sim services
                    0 -->Exit the menu
                    """;
            System.out.println(prompt);

            System.out.println();
            System.out.println("Select an number:  ");
            userResponse = getInput.nextInt();

            switch (userResponse) {
                case 1:
                    menu = "Phone book";
                    System.out.println(menu);

                    System.out.println();
                    prompt = """
                            "Welcome to phone book menu" 
                                  
                            1 -->Search
                            2 -->Service number
                            3 -->Add name
                            4 -->Erase
                            5 -->Edit
                            6 -->Assign tone
                            7 -->Send b'card
                            8 -->Options
                            9 -->Speed dials
                            10 -->Voice tags
                            0 -->Back to previous menu
                            """;
                    System.out.println(prompt);

                    System.out.println();
                    System.out.println("Select a number:  ");
                    int subUserResponse = getInput.nextInt();

                    switch (subUserResponse) {
                        case 1:
                            subMenu = "Search";
                            break;

                        case 2:
                            subMenu = "Service number";
                            break;

                        case 3:
                            subMenu = "Add name";
                            break;

                        case 4:
                            subMenu = "Erase";
                            break;

                        case 5:
                            subMenu = "Edit";
                            break;

                        case 6:
                            subMenu = "Assign tones";
                            break;

                        case 7:
                            subMenu = "Send b'card";
                            break;

                        case 8:
                            subMenu = "Options";
                            prompt = """
                                    Options menu
                                                                            
                                    1 ––>Type of view
                                    2 ––>Memory status
                                    0 ––>To go back
                                    """;
                            System.out.println(prompt);
                            System.out.println();

                            System.out.println("Select an option:  ");
                            int select = getInput.nextInt();
                            switch (select) {
                                case 1:
                                    subMenu = "Type of view";
                                    break;
                                case 2:
                                    subMenu = "Memory status";
                                    break;
                                case 0:
                                    System.out.println("Select 0 to go back");
                                    break;
                                default:
                                    System.out.println("select a valid option between 1 and 2");
                            }
                            System.out.println(subMenu);
                            System.out.println();

                            System.out.println(prompt);
                            if (subUserResponse != 0) {
                                continue;
                            }
                            subUserResponse = getInput.nextInt();
//                                System.out.println(prompt);
                            break;
                        case 9:
                            subMenu = "Speed dials";
                            break;
                        case 10:
                            subMenu = "Voice tags";
                            break;
                        case 0:
                            System.out.println("Enter 0 to go back to main menu");
                            break;
                        default:
                            System.out.println("Supply a valid input");
                    }

                    System.out.println(subMenu);
                    System.out.println();

                    System.out.println("Do you want to perform another action? :");
                    if (subUserResponse != 0) {
                        continue;
                    }
                    System.out.println();
                    System.out.println(prompt);
                    subUserResponse = getInput.nextInt();
//                    System.out.println(prompt);
                    break;
                case 2:
                    menu = "Messages";
                    //Beginning of copy
                    System.out.println(menu);

                    System.out.println();
                    prompt = """
                            "Welcome to phone book menu" 
                                  
                            1 -->Write messages
                            2 -->Inbox
                            3 -->Outbox
                            4 -->Pictures messages
                            5 -->Templates
                            6 -->Smileys
                            7 -->Message settings
                            8 -->Info service
                            9 -->Voice mailbox number
                            10 -->Service command editor
                            0 -->Back to previous menu
                            """;
                    System.out.println(prompt);

                    System.out.println();
                    System.out.println("Select a number:  ");
                    subUserResponse = getInput.nextInt();

                    switch (subUserResponse) {
                        case 1:
                            subMenu = "Write messages";
                            break;

                        case 2:
                            subMenu = "Inbox";
                            break;

                        case 3:
                            subMenu = "Outbox";
                            break;

                        case 4:
                            subMenu = "Picture messages";

                            break;

                        case 5:
                            subMenu = "Templates";
                            break;

                        case 6:
                            subMenu = "Smileys";
                            break;

                        case 7:
                            subMenu = "Message settings";

                            prompt = """
                                    Options menu
                                                                            
                                    1 ––>Set
                                    2 ––>Common
                                    0 ––>To go back
                                    """;
                            System.out.println(prompt);
                            System.out.println();

                            System.out.println("Select an option:  ");
                            int select = getInput.nextInt();
                            switch (select) {
                                case 1:
                                    subMenu = "Set";
                                    prompt = """
                                            1 ––>Message center number
                                            2 ––>Messages sent as 
                                            3 ––>Message validity
                                            """;
                                    System.out.println(prompt);
                                    System.out.println();

                                    System.out.println("Select an option:  ");
                                    select = getInput.nextInt();
                                    switch (select) {
                                        case 1:
                                            subMenu = "Message center number";
                                            break;
                                        case 2:
                                            subMenu = "Messages sent as";
                                            break;
                                        case 3:
                                            subMenu = "Message validity";
                                            break;
                                        case 0:
                                            System.out.println("select 0 to go back");
                                            break;
                                        default:
                                            System.out.println("Suppla a valid option");
                                    }
                                    System.out.println(subMenu);
                                    System.out.println();

                                    subUserResponse = getInput.nextInt();
                                    System.out.println(prompt);
                                    break;
                                case 2:
                                    subMenu = "Common";
                                    System.out.println(menu);
                                    prompt = """
                                            1 ––>Delivery reports
                                            2 ––>Reply via same center
                                            3 ––>Character support
                                            """;
                                    System.out.println(prompt);
                                    System.out.println();

                                    System.out.println("select an option");
                                    select = getInput.nextInt();
                                    switch (select) {
                                        case 1:
                                            subMenu = "Delivery reports";
                                            break;
                                        case 2:
                                            subMenu = "Reply via same center";
                                            break;
                                        case 3:
                                            subMenu = "Character support";
                                            break;
                                        case 0:
                                            System.out.println("select 0 to go back");
                                            break;
                                    }
                                    break;
                                case 0:
                                    System.out.println("Select 0 to go back");
                                    break;
                                default:
                                    System.out.println("select a valid option between 1 and 2");
                            }
                            System.out.println(subMenu);
                            System.out.println();

                            System.out.println(prompt);
                            if (subUserResponse != 0) {
                                continue;
                            }
                            subUserResponse = getInput.nextInt();
//                                System.out.println(prompt);
                            break;
                        case 8:
                            subMenu = "Info service";
                            break;
                        case 9:
                            subMenu = "Voice mailbox number";
                            break;
                        case 10:
                            subMenu = "Service command editor";
                            break;
                        case 0:
                            System.out.println("Enter 0 to go back to previous menu");
                            break;
                        default:
                            System.out.println("Supply a valid input");
                    }

                    System.out.println(subMenu);
                    System.out.println();

                    System.out.println("Do you want to perform another action? :");
                    if (subUserResponse != 0) {
                        continue;
                    }
                    System.out.println();
                    System.out.println(prompt);
                    subUserResponse = getInput.nextInt();
//                    System.out.println(prompt);
                    break;
                //The End of copy
                case 3:
                    menu = "Chat";
                    System.out.println(menu);
                    break;
                case 4:
                    menu = "Call register";
                    System.out.println(menu);

                    System.out.println();
                    prompt = """
                            "Welcome to  call register menu" 
                                  
                            1 -->Missed calls
                            2 -->Received calls
                            3 -->Dialled numbers
                            4 -->Erased recent calls
                            5 -->Show call duration
                            6 -->Show call costs
                            7 -->Call cost settings
                            8 -->Prepaid credit
                            9 -->Voice mailbox number
                            10 -->Service command editor
                            0 -->Back to previous menu                             
                            """;
                    System.out.println(prompt);

                    System.out.println();
                    System.out.println("Select a number:  ");
                    subUserResponse = getInput.nextInt();

                    switch (subUserResponse) {
                        case 1:
                            subMenu = "Missed calls";
                            break;

                        case 2:
                            subMenu = "Received calls";
                            break;

                        case 3:
                            subMenu = "Dialled numbers";
                            break;
                        case 4:
                            subMenu = "Erase recent call lists";
                            break;

                        case 5:
                            subMenu = "Show call duration";
                            System.out.println(menu);
                            prompt = """
                                    Call duration option
                                                                        
                                    1.Last call duration
                                    2.All calls' duration
                                    3.Received calls' duration
                                    4.Dialled calls' duration
                                    5.Clear timers
                                    0 ––>
                                            """;
                            System.out.println(prompt);
                            System.out.println();

                            System.out.println("select an option");
                            subUserResponse = getInput.nextInt();
                            switch (subUserResponse) {
                                case 1:
                                    subMenu = "Last calls duration";
                                    break;
                                case 2:
                                    subMenu = "All calls' duration";
                                    break;
                                case 3:
                                    subMenu = "Received calls duration";
                                    break;
                                case 4:
                                    subMenu = "Dialled calls' duration";
                                    break;
                                case 5:
                                    subMenu = "Clear timers";
                                    break;
                                case 0:
                                    System.out.println("select 0 to go back");
                                    break;
                                default:
                                    System.out.println("select a valid option between 1 and 2");
                            }
                            System.out.println(subMenu);
                            System.out.println();

                            System.out.println(prompt);
                            if (subUserResponse != 0) {
                                continue;
                            }
                            subUserResponse = getInput.nextInt();
                            break;

                        case 6:
                            subMenu = "Show call costs";
                            System.out.println(menu);
                            prompt = """
                                    Call costs option
                                                                        
                                    1.Last call cost
                                    2.All calls' cost
                                    3.Clear counter
                                    0 ––>
                                            """;
                            System.out.println(prompt);
                            System.out.println();

                            System.out.println("select an option");
                            subUserResponse = getInput.nextInt();
                            switch (subUserResponse) {
                                case 1:
                                    subMenu = "Last calls' cost";
                                    break;
                                case 2:
                                    subMenu = "All calls' cost";
                                    break;
                                case 3:
                                    subMenu = "Clear counter";
                                    break;
                                case 0:
                                    System.out.println("select 0 to go back");
                                    break;
                                default:
                                    System.out.println("select a valid option between 1 and 2");
                            }
                            System.out.println(subMenu);
                            System.out.println();

                            System.out.println(prompt);
                            if (subUserResponse != 0) {
                                continue;
                            }
                            subUserResponse = getInput.nextInt();
//                  System.out.println(prompt);
                            break;

                        case 7:
                            subMenu = "Call cost settings";
                            System.out.println(menu);
                            prompt = """
                                    Call cost settings option
                                                                        
                                    1.  Call cost limit
                                    2.  Show call costs in
                                    0.  To go back 
                                            """;
                            System.out.println(prompt);
                            System.out.println();

                            System.out.println("select an option");
                            subUserResponse = getInput.nextInt();
                            switch (subUserResponse) {
                                case 1:
                                    subMenu = "Call cost limit";
                                    break;
                                case 2:
                                    subMenu = "Show call costs in";
                                    break;
                                case 0:
                                    System.out.println("select 0 to go back");
                                    break;
                                default:
                                    System.out.println("select a valid option between 1 and 2");
                            }
                            System.out.println(subMenu);
                            System.out.println();

                            System.out.println(prompt);
                            if (subUserResponse != 0) {
                                continue;
                            }
                            subUserResponse = getInput.nextInt();
                            break;

                        case 8:
                            subMenu = "Prepaid credit";
                            break;
                        case 9:
                            subMenu = "";
                            break;
                        case 10:
                            subMenu = "";
                        case 0:
                            System.out.println("select 0 to go back");
                            break;
                        //Ending
                    }
                    System.out.println(subMenu);
                    System.out.println();

                    System.out.println(prompt);
                    if (subUserResponse != 0) {
                        continue;
                    }
                    subUserResponse = getInput.nextInt();
                    break;
                    //
                        case 5:
                            menu = "Tones";
                            System.out.println(menu);

                            prompt = """
                                    Tone option
                                                                        
                                    1.  Ringing tone
                                    2.  Ringing volume
                                    3.  Incoming alert
                                    4.  Composer
                                    5.  Message alert tone
                                    6.  Keypad tones
                                    7.  Warning and game tones
                                    8.  Vibrating alert
                                    9.  Screen saver
                                    0 ––> To go back to the menu
                                            """;
                            System.out.println(prompt);
                            System.out.println();

                            System.out.println("select an option");
                            subUserResponse = getInput.nextInt();
                            switch (subUserResponse) {
                                case 1:
                                    subMenu = "Ringing tone";
                                    break;
                                case 2:
                                    subMenu = "Ringing volume";
                                    break;
                                case 3:
                                    subMenu = "Incoming call alert";
                                    break;
                                case 4:
                                    subMenu = "Composer";
                                    break;
                                case 5:
                                    subMenu = "Message alert tone";
                                    break;
                                case 6:
                                    subMenu = "Keypad tones";
                                    break;
                                case 7:
                                    subMenu = "Warning and game tones";
                                    break;
                                case 8:
                                    subMenu = "Vibrating alert";
                                    break;
                                case 9:
                                    subMenu = "Screen saver";
                                    break;
                                case 0:
                                    System.out.println("select 0 to go back");
                                    break;
                                default:
                                    System.out.println("select a valid option between 1 and 2");
                            }
                            System.out.println(subMenu);
                            System.out.println();

                            System.out.println(prompt);
                            if (subUserResponse != 0) {
                                continue;
                            }
                            subUserResponse = getInput.nextInt();

                            break;
                        case 6:
                            menu = "Settings";
                            System.out.println(menu);

                            prompt = """
                                    Settings option
                                                                        
                                    1.  Call settings
                                    2.  Phone settings
                                    3.  Security settings
                                    4.  Restore factory settings
                                    0.  To go back; 
                                    """;
                            System.out.println(prompt);
                            System.out.println();

                            System.out.println("select an option");
                            subUserResponse = getInput.nextInt();
                            switch (subUserResponse) {
                                case 1:
                                    subMenu = "Call settings";
                                    System.out.println(menu);

                                    prompt = """
                                    Call settings option 
                                                                        
                                    1.  Automatic dial
                                    2.  Speed dialling
                                    3.  Call waiting options
                                    4.  Own number sending
                                    5.  Phone line in use
                                    6.  Automatic answer
                                    0.  To go back
                                    """;
                                    System.out.println(prompt);
                                    System.out.println();

                                    System.out.println("select an option");
                                    subUserResponse = getInput.nextInt();
                                    switch (subUserResponse) {
                                        case 1:
                                            subMenu = "Automatic dial";
                                            break;
                                        case 2:
                                            subMenu = "Speed dialling";
                                            break;
                                        case 3:
                                            subMenu = "Call waiting options";
                                            break;
                                        case 4:
                                            subMenu = "Own number sending";
                                            break;
                                        case 5:
                                            subMenu = "Phone line in use";
                                            break;
                                        case 6:
                                            subMenu = "Automatic answer";
                                            break;
                                        case 0:
                                            System.out.println("select 0 to go back");
                                            break;
                                        default:
                                            System.out.println("select a valid option between 1 and 2");
                                    }
                                    System.out.println(subMenu);
                                    System.out.println();

                                    System.out.println(prompt);
                                    if (subUserResponse != 0) {
                                        continue;
                                    }
                                    subUserResponse = getInput.nextInt();
                                    break;
                                case 2:
                                    subMenu = "Phone settings";
                                    System.out.println(menu);

                                    prompt = """
                                    Phone settings option 
                                                                        
                                    1.  Language
                                    2.  Cell info service
                                    3.  Welcome note
                                    4.  Network selection
                                    5.  Lights
                                    6.  Confirm SIM service actions
                                    0.  To go back
                                    """;
                                    System.out.println(prompt);
                                    System.out.println();

                                    System.out.println("select an option");
                                    subUserResponse = getInput.nextInt();
                                    switch (subUserResponse) {
                                        case 1:
                                            subMenu = "Language";
                                            break;
                                        case 2:
                                            subMenu = "Cell info display";
                                            break;
                                        case 3:
                                            subMenu = "Welcome note";
                                            break;
                                        case 4:
                                            subMenu = "Network selection";
                                            break;
                                        case 5:
                                            subMenu = "Lights";
                                            break;
                                        case 6:
                                            subMenu = "Confirm SIM service actions";
                                            break;
                                        case 0:
                                            System.out.println("select 0 to go back");
                                            break;
                                        default:
                                            System.out.println("select a valid option between 1 and 2");
                                    }
                                    System.out.println(subMenu);
                                    System.out.println();

                                    System.out.println(prompt);
                                    if (subUserResponse != 0) {
                                        continue;
                                    }
                                    subUserResponse = getInput.nextInt();
                                    break;
                                case 3:
                                    subMenu = "Security settings";
                                    System.out.println(menu);

                                    prompt = """
                                    Security settings option 
                                                                        
                                    1.  PIN code request
                                    2.  Call barring service
                                    3.  Fixed dialling
                                    4.  Closed user group
                                    5.  Phone security
                                    6.  Change access codes
                                    0.  To go back
                                    """;
                                    System.out.println(prompt);
                                    System.out.println();

                                    System.out.println("select an option");
                                    subUserResponse = getInput.nextInt();
                                    switch (subUserResponse) {
                                        case 1:
                                            subMenu = "PIN code request";
                                            break;
                                        case 2:
                                            subMenu = "Call barring service";
                                            break;
                                        case 3:
                                            subMenu = "Fixed dialling";
                                            break;
                                        case 4:
                                            subMenu = "Closed user group";
                                            break;
                                        case 5:
                                            subMenu = "Phone security";
                                            break;
                                        case 6:
                                            subMenu = "Change access codes";
                                            break;
                                        case 0:
                                            System.out.println("select 0 to go back");
                                            break;
                                        default:
                                            System.out.println("select a valid option between 1 and 2");
                                    }
                                    System.out.println(subMenu);
                                    System.out.println();

                                    System.out.println(prompt);
                                    if (subUserResponse != 0) {
                                        continue;
                                    }
                                    subUserResponse = getInput.nextInt();
                                    break;
                                case 4:
                                    subMenu = "Restore factory setting";
                                    break;
                                case 0:
                                    System.out.println("Select 0 to go back to the previous menu");
                                    break;
                            }
                            System.out.println(subMenu);
                            System.out.println();

                            System.out.println(prompt);
                            if (subUserResponse != 0) {
                                continue;
                            }
                            subUserResponse = getInput.nextInt();
                            break;
                        case 7:
                            menu = "Call divert";
                            System.out.println(menu);
                            break;
                        case 8:
                            menu = "Games";
                            System.out.println(menu);
                            break;
                        case 9:
                            menu = "Calculator";
                            System.out.println(menu);
                            break;
                        case 10:
                            menu = "Reminders";
                            System.out.println(menu);
                            break;
                        case 11:
                            menu = "Clock";
                            System.out.println(menu);

                            prompt = """
                                    Clock option 
                                                                        
                                    1.  Alarm clock
                                    2.  Clocking settings
                                    3.  Date settings
                                    4.  Stopwatch
                                    5.  Countdown timer
                                    6.  Auto update of date and time
                                    0.  To go back
                                    """;
                            System.out.println(prompt);
                            System.out.println();

                            System.out.println("select an option");
                            subUserResponse = getInput.nextInt();
                            switch (subUserResponse) {
                                case 1:
                                    subMenu = "Alarm clock";
                                    break;
                                case 2:
                                    subMenu = "Clocking settings";
                                    break;
                                case 3:
                                    subMenu = "Date settings";
                                    break;
                                case 4:
                                    subMenu = "Stopwatch";
                                    break;
                                case 5:
                                    subMenu = "Countdown timer";
                                    break;
                                case 6:
                                    subMenu = "Auto update of date and time";
                                    break;
                                case 0:
                                    System.out.println("select 0 to go back");
                                    break;
                                default:
                                    System.out.println("select a valid option between 1 and 2");
                            }
                            System.out.println(subMenu);
                            System.out.println();

                            System.out.println(prompt);
                            if (subUserResponse != 0) {
                                continue;
                            }
                            subUserResponse = getInput.nextInt();
                            break;
                        case 12:
                            menu = "Profiles";
                            System.out.println(menu);
                            break;
                        case 13:
                            menu = "Sim services";
                            System.out.println(menu);
                            break;
                        case 0:
                            System.out.println("Thanks for checking from our App. Visit again");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Incorrect input!!! Please re-enter choice from our menu");
                    }
                    System.out.println(menu);
                    System.out.println();
                    main();

            }
        }
    }

