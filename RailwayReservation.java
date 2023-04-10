package com.example.ticketbooking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;

public class RailwayReservation {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

    public void startReservationSystem()throws IOException
    {
        String base="Burdwan";

        String stations [] ={"Durgapur","Raniganj","Asansol","Gangpur","Memari","Boinchi","Bandel","Adisaptagram","Magra","Hoogly","Chinsurah",
                "Nabagram","Mosagram","Hind Motor","Belur","Bally","Bally Halt","Sealdah","Katwa","Saktigarh","Bagila","Dmurdaha","Howrah","Naihati"};

        double fares[] ={20.0,25,30,10,20,25,25,25,25,30,15,15,30,25,25,25,40,30,10,15,30,40,30,30};

        while(true){

            System.out.println("\f Welcome To Railway Reservation System");
            System.out.println("======================================================================");

            System.out.println("Press             Stations                  Fares");
            System.out.println("======================================================================");
            for(int i=0;i<stations.length;i++)
            {
                System.out.println((i+1)+"                  "+stations[i]+"                         "+fares[i]);

            }

            int option = Integer.parseInt(r.readLine());
            if(option>0 && option<=24)
            {
                System.out.println("Please enter the number of passengers: ");
                int p= Integer.parseInt(r.readLine());
                System.out.println("Press E for Express and L for Local/Passenger Ticket: ");
                int factor=1;String type;
                while(true)
                {
                    type = r.readLine();
                    if(type.equalsIgnoreCase("E"))
                    {factor=3;
                        break;
                    }

                    else if(!type.equalsIgnoreCase("L"))
                    {
                        System.out.println("Wrong Choice. Enter Again:: ");
                        continue;
                    }
                    else{
                        break;
                    }
                }
                type=type.toUpperCase();
                System.out.println("Do you want a RETURN ticket? Y for YES , Any other character for NO : ");
                String ret=r.readLine();
                boolean returnTkt=ret.equalsIgnoreCase("Y")|| ret.equalsIgnoreCase("Yes")?true:false;
                printTicket(stations[option-1],fares[option-1],p,factor,type,base,returnTkt);

                System.out.println("Do you want to continue to next reservation?  Y for YES , Any other character for NO : ");
                String choice=r.readLine();
                if(choice.equalsIgnoreCase("Y")|| choice.equalsIgnoreCase("Yes"))
                    continue;
                else
                    break;

            }

            else{
                System.out.println("Entered Wrong choice.Do you want to continue with correct choice? Press Y for YES , Any other character for Exiting : ");
                String choice=r.readLine();
                if(choice.equalsIgnoreCase("Y")|| choice.equalsIgnoreCase("Yes"))
                    continue;
                else
                    break;
            }


        }
    }

    private void  printTicket(String station,double fare,int p,int factor,String type,String base,boolean returnTkt){

        System.out.println("------------------------------------------------------------------");
        System.out.println("--------------------RAILWAY TICKET ------------------------------");
        System.out.println("Journey from : "+base+"\nJourney to : "+station+"\nNo of Passengers : "+p+"\nTicket Type :"+type);
        String ret=returnTkt==true?"Return Ticket":"Not Return Ticket";
        System.out.println("\nJourney Return Type? : "+ret+"\n");
        System.out.println("Date of Journey : "+ LocalDate.now());
        System.out.println("------------------------------------------------------------------");
        double totalFare= fare*factor*p;
        if(returnTkt)
            totalFare*=2;
        System.out.println(" Total Fare :: Rs "+totalFare);
        System.out.println("------------------------------------------------------------------");
    }
}
