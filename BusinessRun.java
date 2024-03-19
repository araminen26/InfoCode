import java.util.Scanner;
import java.util.ArrayList;
public class BusinessRun
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Business> b = new ArrayList<Business>();
        
        //Culvers (1)
        b.add(new Business("Culvers", "Fast Food", "Food For Concessions", "847-383-5459 Culver's Phone", "405 Milwaukee Ave, Lincolnshire, IL 60069, USA", "$321.75"));
        //Marianos(2)
        b.add(new Business("Marianos", "Grocery Store", "Food/Ingredients in Cafeteria", "224-918-4623 Mariono's Phone", "450 W Half Day Rd, Buffalo Grove, IL 60089, USA", "$1,600.00")); 
        //Chipotle(3)
        b.add(new Business("Chipotle", "Fast Food","Food for Special Occasions", "847-478-3230 Chipotle Phone", "950 Milwaukee Ave A, Lincolnshire, IL 60069, USA", "$1,200.00"));
        //Starbucks(4)
        b.add(new Business("Starbucks", "Coffee Shop", "Options for Students During Late Arrival", "847-478-0671 Starbucks Phone", "1240 US-45, Vernon Hills, IL 60061, USA", "$0.00"));
        //BMO Harris Bank(5)
        b.add(new Business("BMO Harris Bank", "Bank", "Financial Loans", "847-465-0202 BMO Harris Bank Phone", "500 Half Day Rd, Buffalo Grove, IL 60089, USA", "Depends on Financial Situation"));
        //CVS(6)
        b.add(new Business("CVS Pharmacy", "Pharmacy", "Supplies For Nurse's Office", "847-478-5465 CVS Pharmacy Phone", "4186 IL-83 BLDG D, Long Grove, IL 60047, USA", "$800.00"));
        //Top Driver(7)
        b.add(new Business("Top Driver Driving School", "Driving school", "Drivers Ed for Students", "800-374-8373 Top Driver Driving School Phone", "1030 Weiland Rd, Buffalo Grove, IL 60089, USA", "$0.00"));
        //Chick Fil A(8)
        b.add(new Business("Chick-Fil-A", "Fast food", "Food for Special Occasions", "847-305-5475 Chick-Fil-A Phone", "268 McHenry Rd, Buffalo Grove, IL 60089, USA", "$725.00"));
        //McDonalds(9)
        b.add(new Business("McDonalds", "Fast food", "Closeby Food Option for Students", "847-913-1500 McDonalds Phone", "450 Milwaukee Ave, Lincolnshire, IL 60069, USA", "$0.00"));
        //Sky Fitness(10)
        b.add(new Business("Sky Fitness", "Gym", "Equipment for Weight Room", "847-229-0292 Sky Fitness Phone", "1501 Busch Pkwy, Buffalo Grove, IL 60089, USA", "$975.00"));
        //Woodmans(11)
        b.add(new Business("Woodman's Food Market", "Grocery store", "Food/Ingredients in Cafeteria", "847-243-4736 Woodman's Phone", "1550 Deerfield Pkwy, Buffalo Grove, IL 60089, USA", "$1,600.00"));
        //Marshalls(12)
        b.add(new Business("Marshalls", "Department store", "Miscellaneous Items", "847-793-8193 Marshalls Phone", "370 Half Day Rd, Buffalo Grove, IL 60089, USA", "$100.00"));
        //Life Time (13)
        b.add(new Business("Life Time", "Gym", "Equipment for Weight Room", "847-995-0670 Life Time Phone", "680 Woodlands Pkwy, Vernon Hills, IL 60061, USA", "$1000.00"));
        //Sushi Grove(14)
        b.add(new Business("Sushi Grove", "Restaurant", "Friday Sushi provider", "847-520-9988 Sushi Grove Phone", "312 McHenry Rd, Buffalo Grove, IL 60089, USA", "$5,000.00"));
        //Shell(15)
        b.add(new Business("Shell", "Gas station", "Gas for buses", "847-821-1342 Shell Phone", "1200 N Arlington Heights Rd, Buffalo Grove, IL 60089, USA", "$360.70"));
        //Marriott(16)
        b.add(new Business("Lincolnshire Marriott Resort", "Hotel", "Place to Stay for Visiting Athletes", "847-634-0100 Marriott Phone", "Ten, Marriott Dr, Lincolnshire, IL 60069, USA", "$0.00"));
        //Bowlero(17)
        b.add(new Business("Bowlero Buffalo Grove", "Entertainment", "Place for Fundraisers", "847-821-9000 Bowlero Phone", "350 McHenry Rd, Buffalo Grove, IL 60089, USA", "$800.00"));
        //Lincolnshire Police Department(18)
        b.add(new Business("Lincolnshire Police Department", "Police Station", "Protection for School", "847-883-9900 Police Station Phone", "1 Olde Half Day Rd, Lincolnshire, IL 60069, USA", "$0.00"));
        //UPS(19)
        b.add(new Business("The UPS Store", "Shipping and mailing service", "Postal Services for School", "847-913-0335 UPS Phone", "318 Half Day Rd, Buffalo Grove, IL 60089, USA", "$100.00"));
        //Domino's (20)
        b.add(new Business("Domino's Pizza", "Pizza delivery", "Food for Special Occasions", "224-900-1040","837 S Lake St, Mundelein, IL 60060, USA", "$1,000.00"));
        //Dunkin' (21)
        b.add(new Business("Dunkin' Donuts", "Coffee Shop", "Food for Special Occasions", "847-320-1174 Dunkin' Phone", "3980 IL-22, Long Grove, IL 60047, USA", "$160.00"));
        //Walgreens (22)
        b.add(new Business("Walgreens", "Pharmacy", "Supplies for Nurse's Office", "847-955-9361 Walgreens Phone", "1701 N Buffalo Grove Rd, Buffalo Grove, IL 60089, USA", "$800.00"));
        //Lou Malnati's (23)
        b.add(new Business("Lou Malnati's Pizzeria", "Pizza Delivery", "Food for Special Occasions", "847-215-7100 Lou Malnati's Phone", "85 S Buffalo Grove Rd, Buffalo Grove, IL 60089, USA", "$1,000.00"));
        //Jewel-Osco (24)
        b.add(new Business("Jewel-Osco", "Grocery Store", "Food for Cafeteria", "847-537-0845 Jewel-Osco Phone", "79 McHenry Rd, Buffalo Grove, IL 60089, USA", "$1,600.00"));
        //Costco (25)
        b.add(new Business("Costco Wholesale", "Warehouse Store", "Supplies/Ingredients for School", "847-235-1302 Costco Store", "25901 Riverwoods Rd, Mettawa, IL 60045, USA", "$2,000.00"));
        //No Manches (26)
        b.add(new Business("No Manches Mexican Grill", "Restaurant", "Place for Students to Eat", "847-383-6652 No Manches Phone", "1240 US-45 Ste 100, Vernon Hills, IL 60061, USA", "$0.00"));
        
        
        //running code
            //type in business you would like to search
        System.out.println("***Please type in searches carefully, no answer will be given if search is inaccurate***\n");
        String c ="What business would you like to search? (First letter in word is capital, type 'done' if search is over): ";
        System.out.println(c);
        String business = sc.nextLine();
        
        
            //info requested
        String n = "What information would you like? (First letter in word is capital, type done if search is over)\nOrganization Type\nResources\nContact Info\nLocation\nCost\n "; 
        System.out.println(n);
        String info = sc.nextLine();
        String y = "Would you like to add this business to your list?";
        
        int l = 0;
        int count = 0;
        ArrayList<String> list = new ArrayList<String>();
        
        //while loops - provides the user with the info requested
        while(!(business.equals("done")))
        {
            while(!(info.equals("done")))
            {
                while(l < 1)
                {
                for(int i = 0;i < b.size(); i++)
                {
                    if(business.equals(b.get(i).getName()))
                    {
                        if(info.equals("Organization Type"))
                        {
                            System.out.println();
                            System.out.println(b.get(i).getOrganizationType());
                            System.out.println();
                            System.out.println(n);
                            info = sc.nextLine();
                        }
                        else if(info.equals("Resources"))
                        {
                            System.out.println();
                            System.out.println(b.get(i).getResources());   
                            System.out.println();
                            System.out.println(n);
                            info = sc.nextLine();
                        }
                        else if(info.equals("Contact Info"))
                        {
                            System.out.println();
                            System.out.println(b.get(i).getContactInfo());
                            System.out.println();
                            System.out.println(n);
                            info = sc.nextLine();
                        }
                        else if(info.equals("Location"))
                        {
                            System.out.println();
                            System.out.println(b.get(i).getLocation());
                            System.out.println();
                            System.out.println(n);
                            info = sc.nextLine();
                        }
                        else if(info.equals("Cost"))
                        {
                            count++;
                            System.out.println();
                            System.out.println(b.get(i).getCost());
                            System.out.println();
                            System.out.println(y);
                            String answer = sc.nextLine();
                            if(answer.equals("Yes"))
                            {
                                list.add(b.get(i).getName());
                                
                            }
                            System.out.println();
                            System.out.println(n);
                            info = sc.nextLine();
                            
                        }
                        else if(info.equals("done"))
                        {
                            l = 1;
                        }
                        else
                        {
                            System.out.println();
                            System.out.println("Seems like your search didn't match one of the options, would you like to search again?");
                            System.out.println(n);
                            info = sc.nextLine();
                            if(info.equals("done"))
                            {
                                l = 1;
                            }
                            i--;
                        }     
                    }
                    
                }
                }
                System.out.println();
                System.out.println("Would you like to search another business?");
                System.out.println(c);
                business = sc.nextLine();
                if(!(business.equals("done")))
                {
                    System.out.println(n);
                    info = sc.nextLine();
                    l = 0;
                }
            } 
            
        }
            
            System.out.println("Thank you for utilizing our resources");
            System.out.println("Here is the list of your selected companies: ");
            for(int i=0; i<list.size(); i++)
            {
                System.out.println(list.get(i));
            }
    }
        
        
}
 
