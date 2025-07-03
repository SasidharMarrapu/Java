package Metro;

import java.util.Scanner;

public class metrotickets {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        String User_name = "";
        String Password = "";
        String User_name1 = "";
        String Password1 = "";
        int Current_balance = 0;
        int totalTickets = 0;
        String lastSource = "";
        String lastDestination = "";
        int lastDistance = 0;
        int lastFare = 0;

        while (true) {
            System.out.println("\n1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = Sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter User_name: ");
                User_name = Sc.next();
                System.out.print("Enter Password: ");
                Password = Sc.next();
                System.out.println("Registered Successfully!");
            }
            else if (choice == 2) {
                System.out.print("Enter User_name: ");
                User_name1 = Sc.next();
                System.out.print("Enter Password: ");
                Password1 = Sc.next();

                if (User_name.equals(User_name1) && Password.equals(Password1)) {
                    System.out.println("Login Successful!");

                    while (true) {
                        System.out.println("\n1. Recharge Metro card");
                        System.out.println("2. Book Tickets");
                        System.out.println("3. View Balance");
                        System.out.println("4. View Last Ticket Details");
                        System.out.println("5. Logout");
                        System.out.print("Enter Your Choice: ");
                        int choice2 = Sc.nextInt();

                        if (choice2 == 1) {
                            System.out.println("Current balance: ₹" + Current_balance);
                            System.out.print("Enter amount to add into the card: ");
                            int amount = Sc.nextInt();
                            Current_balance += amount;
                            System.out.println("Recharge successful! Current balance: ₹" + Current_balance);
                        }
                        else if (choice2 == 2) {
                            System.out.print("How many tickets you want to book: ");
                            int persons = Sc.nextInt();

                            for (int t = 0; t < persons; t++) {
                                System.out.println("\n1. Red Line: L.B.Nagar – Miyapur");
                                System.out.println("2. Blue Line: Nagole – Raidurg");
                                System.out.println("3. Green Line: JBS – MGBS");
                                System.out.print("Enter your choice: ");
                                int choice3 = Sc.nextInt();

                                String[] stations = {};
                                if (choice3 == 1) {
                                    stations = new String[] {
                                        "L.B.Nagar", "Victoria Memorial", "Chaithanyapuri", "Dilshuknagar",
                                        "Musarambagh", "New Market", "Malakpet", "M.G.Bus station",
                                        "Usmania Medical College", "Nampally", "Miyapur"
                                    };
                                } else if (choice3 == 2) {
                                    stations = new String[] {
                                        "Nagole", "Habsiguda", "Tarnaka", "Secunderabad",
                                        "Parade Ground", "Ameerpet", "Raidurg"
                                    };
                                } else if (choice3 == 3) {
                                    stations = new String[] {
                                        "JBS", "Parade Ground", "MGBS"
                                    };
                                } else {
                                    System.out.println("Invalid line choice. Skipping this ticket.");
                                    t--; // retry this ticket
                                    continue;
                                }

                                // Show stations
                                System.out.println("Stations:");
                                for (int i = 0; i < stations.length; i++) {
                                    System.out.println((i + 1) + ". " + stations[i]);
                                }

                                System.out.print("Select Source station number: ");
                                int sourceIndex = Sc.nextInt() - 1;
                                System.out.print("Select Destination station number: ");
                                int destIndex = Sc.nextInt() - 1;

                                if (sourceIndex < 0 || sourceIndex >= stations.length ||
                                    destIndex < 0 || destIndex >= stations.length ||
                                    sourceIndex == destIndex) {
                                    System.out.println("Invalid source or destination. Try again.");
                                    t--; // retry this ticket
                                    continue;
                                }

                                int distance = Math.abs(destIndex - sourceIndex);
                                int fare = 0;
                                if (distance == 1) fare = 10;
                                else if (distance == 2) fare = 15;
                                else if (distance == 3) fare = 20;
                                else if (distance == 4) fare = 25;
                                else if (distance == 5) fare = 30;
                                else fare = 35;

                                if (Current_balance >= fare) {
                                    Current_balance -= fare;
                                    totalTickets++;
                                    lastSource = stations[sourceIndex];
                                    lastDestination = stations[destIndex];
                                    lastDistance = distance;
                                    lastFare = fare;

                                    System.out.println("Ticket booked: From " + lastSource + " to " + lastDestination);
                                    System.out.println("Stations: " + lastDistance + ", Fare: ₹" + lastFare);
                                    System.out.println("Remaining balance: ₹" + Current_balance);
                                } else {
                                    System.out.println("Insufficient balance. Please recharge.");
                                    t--; // retry this ticket
                                }
                            }

                            System.out.print("Do you want to book more tickets? (yes/no): ");
                            String more = Sc.next();
                            if (more.equalsIgnoreCase("no")) {
                                continue;
                            }
                        }
                        else if (choice2 == 3) {
                            System.out.println("Current balance: ₹" + Current_balance);
                            System.out.println("Total tickets booked: " + totalTickets);
                        }
                        else if (choice2 == 4) {
                            if (totalTickets == 0) {
                                System.out.println("No tickets booked yet.");
                            } else {
                                System.out.println("Last Ticket: From " + lastSource + " to " + lastDestination);
                                System.out.println("Stations: " + lastDistance + ", Fare: ₹" + lastFare);
                            }
                        }
                        else if (choice2 == 5) {
                            System.out.println("Logged out successfully.");
                            break;
                        }
                        else {
                            System.out.println("Invalid choice. Try again.");
                        }
                    }
                } else {
                    System.out.println("Invalid Username or Password. Try again.");
                }
            }
            else if (choice == 3) {
                System.out.println("Exiting the system. Thank you!");
                break;
            }
            else {
                System.out.println("Invalid choice. Please select 1, 2, or 3.");
            }
        }
        Sc.close();
    }
}
