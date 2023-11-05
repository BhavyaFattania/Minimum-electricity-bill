import java.util.Scanner;

import javax.swing.SpinnerDateModel;
public class Project{
////////////////////////////////TV//////////////////////////////////////////////////////////////////////////////
static double unitsUsed;
static double TV(double powerTV,int timeTV,double[] unitsCost){
 double usageTV= powerTV*timeTV/(1000);
 double costTV=1000,TV;
for(int i=0;i<3;i++)
{
    TV=unitsCost[i]*usageTV;
costTV=Math.min(TV,costTV );
}
System.out.println("\t\t\t-----TV-----\n");
System.out.println("\tUnits consumed in a day "+usageTV);
System.out.println("\tUnits consumed in a Week "+usageTV*7);
System.out.println("\tUnits consumed in a Month "+usageTV*30);

System.out.println("\tMinimum cost of TV "+ costTV);
for(int i=0;i<4;i++)
    {
        if(costTV/usageTV==unitsCost[i]){                                                           //TV    
            System.out.println("\tOperate in slot "+i+1);
            System.out.println();
        break;
        }
        else {}
    }    
    unitsUsed+=usageTV;
    return costTV;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////
static double Fridge(double powerFridge,int timeFridge,double[] unitsCost){
    double usageFridge= powerFridge*timeFridge/(1000);
 double costFridge=0,Fridge;
for(int i=0;i<4;i++)
{
    Fridge=unitsCost[i]*usageFridge;
    costFridge+=Fridge;
}
System.out.println("\t\t\t-----Fridge-----\n");
System.out.println("\tMinimum cost of Fridge "+ costFridge);
System.out.println("\tUnits consumed ny fridge in a day "+usageFridge);
System.out.println("\tUnits consumed in a Week "+usageFridge*7);
System.out.println("\tUnits consumed in a Month "+usageFridge*30);

System.out.println("\tFridge operates full day\n");
unitsUsed+=usageFridge;
return costFridge;
}
/////////////////////////////////////////////////////////////////////////////////////////////////////
static double Washing(double powerWashing,int timeWashing,double[] unitsCost){
 double usageWashing= powerWashing*timeWashing/(1000);
 double costWashing=unitsCost[0]*usageWashing;
 System.out.println("\t\t\t-----Washing machine-----\n");
 System.out.println("\tUnits consumed in a day "+usageWashing);
 System.out.println("\tUnits consumed in a Week "+usageWashing*7);
System.out.println("\tUnits consumed in a Month "+usageWashing*30);

 System.out.println("\tMinimum cost Washing "+ costWashing);
 System.out.println("\tOperate in slot 1\n");                                            //Washing machine  
unitsUsed+=usageWashing;
return costWashing;
}
///////////////////////////////////////////////////////////////////////////////////////////////////
static double Fan1(double powerFan,int timeFan1,double[] unitsCost){
double usageFan1= powerFan*timeFan1/(1000);
 double costFan1=10000,Fan1;
for(int i=0;i<3;i++)
{
    Fan1=unitsCost[i]*usageFan1;
costFan1=Math.min(Fan1,costFan1 );
}
System.out.println("\t\t-----Living room fan-----\n");
System.out.println("\tUnits consumed in a day "+usageFan1);
System.out.println("\tUnits consumed in a Week "+usageFan1*7);
System.out.println("\tUnits consumed in a Month "+usageFan1*30);

System.out.println("\tMinimum cost of Living room fan "+ costFan1);
for(int i=0;i<4;i++)
    {
        if(costFan1/usageFan1==unitsCost[i]){                                         //Living room fan
            System.out.println("\tOperate in slot "+i+1);
        System.out.println();
            break;
        }
        else {}
        }
    unitsUsed+=usageFan1;    
    return costFan1;
} 
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
static double Fan3(double powerFan,int timeFan3,double[] unitsCost){
double usageFan3= powerFan*timeFan3/(1000);    //bedroom fan
double costFan3=10000,Fan3=0;
for(int i=0;i<4;i++)
{
Fan3=unitsCost[i]*usageFan3;
costFan3=Math.min(Fan3,costFan3 );
}
System.out.println("\t\t-----Other Fan-----\n");
System.out.println("\tUnits consumed in a day "+usageFan3);
System.out.println("\tUnits consumed in a Week "+usageFan3*7);
System.out.println("\tUnits consumed in a Month "+usageFan3*30);

System.out.println("\tMinimum cost Other fan fan "+ costFan3);
for(int i=0;i<4;i++)
    {
        if(costFan3/usageFan3==unitsCost[i]){
            System.out.println("\tOperate in slot "+i+1);
            System.out.println();
        break;                                                                              //Other Fan
        }
        else {}
    }
    unitsUsed+=usageFan3;
    return costFan3;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
static double Fan2(double powerFan,int timeFan2,double[] unitsCost){
double usageFan2= powerFan*timeFan2/(1000);    //bedroom fan
double costFan2=10000,Fan2=0;

Fan2=unitsCost[3]*usageFan2;
costFan2=Fan2;

System.out.println("\t\t-----Bedroom fan-----\n");
System.out.println("\tUnits consumed in a day "+usageFan2);
System.out.println("\tUnits consumed in a Week "+usageFan2*7);
System.out.println("\tUnits consumed in a Month "+usageFan2*30);
System.out.println("\tMinimum cost Bedroom fan "+ costFan2);
for(int i=0;i<4;i++)
    {
        if(costFan2/usageFan2==unitsCost[i]){
            System.out.println("\tOperate in slot 4\n");
        break;                                                                              //Bedroom Fan
        }
        else {}
    }    
    unitsUsed+=usageFan2;
    return costFan2;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
static double Light1(double powerLight,int timeLight1,double[] unitsCost){
    double usageLight1= powerLight*timeLight1/(1000);  
    double costLight1=unitsCost[2]*usageLight1;
    System.out.println("\t\t-----Living room light-----\n");
    System.out.println("\tUnits consumed in a day "+usageLight1);
    System.out.println("\tUnits consumed in a Week "+usageLight1*7);
System.out.println("\tUnits consumed in a Month "+usageLight1*30);

System.out.println("\tMinimum cost living room light "+costLight1 );                         //living room light
System.out.println("\tOperate in slot 3\n");                                                    
unitsUsed+=usageLight1;    
return costLight1;

}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
static double Light2(double powerLight,int timeLight2,double[] unitsCost){
    double usageLight2= powerLight*timeLight2/(1000);  
    double costLight2=unitsCost[2]*usageLight2; 
    System.out.println("\t\t-----Bedroom Light-----\n");   
    System.out.println("\tUnits consumed in a day "+usageLight2);   
    System.out.println("\tUnits consumed in a Week "+usageLight2*7);
System.out.println("\tUnits consumed in a Month "+usageLight2*30);                                      //Bedroom room light
System.out.println("\tMinimum cost bedroom room light "+costLight2 );
System.out.println("\tOperate in slot 3\n");    
unitsUsed+=usageLight2;    
return costLight2;

}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
static double Light3(double powerLight, int timeLight3,double[] unitsCost){
double usageLight3= powerLight*timeLight3/(1000); //other light
double costLight3=10000,Light3=0;
for(int i=2;i<4;i++)
{
Light3=unitsCost[i]*usageLight3;
costLight3=Math.min(Light3,costLight3 );
}
System.out.println("\t\t-----Other light-----\n");
System.out.println("\tUnits consumed in a day "+usageLight3);
System.out.println("\tUnits consumed in a Week "+usageLight3*7);
System.out.println("\tUnits consumed in a Month "+usageLight3*30);

System.out.println("\tMinimum cost other light "+ costLight3);
for(int i=2;i<4;i++)
{
    if(costLight3/usageLight3==unitsCost[i]){
            System.out.println("\tOperate in slot "+(i+1));
            System.out.println();
        break;                                                                              //Other Light
        }
        else {}
}    
unitsUsed+=usageLight3;
    return costLight3;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
static double Charger(double powercharger, int timeCharger,double[] unitsCost){
double usageCharger = powercharger*timeCharger/(1000); //charger
double costCharger=10000,Charger=0;
for(int i=0;i<4;i++)
{
Charger=unitsCost[i]*usageCharger;
costCharger=Math.min(Charger,costCharger );
}
System.out.println("\t\t\t-----Charger-----\n");
System.out.println("\tUnits consumed in a day "+usageCharger);
System.out.println("\tUnits consumed in a Week "+usageCharger*7);
System.out.println("\tUnits consumed in a Month "+usageCharger*30);

System.out.println("\tMinimum cost charger "+ costCharger);
for(int i=0;i<4;i++)
{
    if(costCharger/usageCharger==unitsCost[i])                                            //Charger
    {
        System.out.println("\tOperate in slot "+i+1);
        System.out.println();
    break;
    }
    else{}
}
unitsUsed+=usageCharger;
    return costCharger;
}
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
public static void main(String[] arg){
    Scanner input = new Scanner(System.in);
    /////input////
    double[] unitsCost= new double[4];
    System.out.println("Enter of electricity in units "); 
    System.out.println("In time 6:00 am to 12:00 pm (morning)(Slot 1)");
    System.out.println("In time 12:00 pm to 6:00 pm (afternoon)(Slot 2)");
    System.out.println("In time 6:00 pm to 12:00 am (evening)(Slot 3)");
    System.out.println("In time 12:00 am to 6:00 am (night)(Slot 4)");
    for(int i=0;i<4;i++)
    {
        unitsCost[i]=input.nextDouble();
    }

    System.out.println("We have 6 appliance at home");
    System.out.println("1)TV (Average 100 watts)");
    System.out.println("2)Refrigerator (Average 400 watts)");
    System.out.println("3)Washing machine  (Average 1000 watts)");
    System.out.println("4)fan (3 fans) (Average 60 Watts)");
    System.out.println("5)Tube light (3)(Average 15 Watts)");
    System.out.println("6)Phone charging(3) (average 8 Watts)");
    ////////////////////////////////////////////////////////////power////////////////////////////////////////////////////
System.out.println("Enter power rating of TV\n");               //Power of TV
    Double powerTV = input.nextDouble();                        //Poewr of WS
System.out.println("Enter power rating of Fridge\n");       // Power of fridge
    Double powerFridge = input.nextDouble();
System.out.println("Enter power rating of Washing machine\n");  
    Double powerWashing = input.nextDouble();
System.out.println("Enter power rating of Fan\n");              // Power fan
    Double powerFan = input.nextDouble();
System.out.println("Enter power rating of  light\n");           //Power  light
    Double powerLight= input.nextDouble();
System.out.println("Enter power rating of Charger\n");          //Power charger
    Double powerCharger = input.nextDouble();


/////////////////////////////////////////////////////////////////Time///////////////////////////////////////////////////////    


System.out.println("Enter time of usage of TV (in hours)\n");                   //Time tv
    int timeTV = input.nextInt();
System.out.println("Enter time of usage of Washing machine (in hours)\n");          //time washing
    int timeWashing = input.nextInt();
System.out.println("Enter time of usage of Living room Fan (in hours)\n");          //Living room fan1
    int timeFan1= input.nextInt();
System.out.println("Enter time of usage of Bedroom Fan(in hours)\n");               //Bedroom fan2
    int timeFan2 = input.nextInt();
System.out.println("Enter time of usage of Other Fan (in hours)\n");                //Other fan3
    int timeFan3 = input.nextInt();
System.out.println("Enter time of usage of bedroom light (in hours)\n");            //Bedroom light2
    int timeLight2 = input.nextInt();
System.out.println("Enter time of usage of Living room Light (in hours)");          //Living room Light1
    int timeLight1 = input.nextInt();
System.out.println("Enter time of usage of Other Light (in hours)");                //Other light3
    int timeLight3 = input.nextInt();
System.out.println("Enter time of usage of Charger (in hours)");                    //charger
    int timeCharger= input.nextInt();


///////////////////////////////////////////////Unit cost of electricity////////////////////////////////////


double costTV=TV(powerTV, timeTV, unitsCost);
double costFridge=Fridge(powerFridge,6, unitsCost);
double costWashing=Washing(powerWashing, timeWashing, unitsCost);
double costFan1 = Fan1(powerFan, timeFan1, unitsCost);
double costFan2 = Fan2(powerFan,timeFan2,unitsCost);
double costFan3 = Fan3(powerFan,timeFan3,unitsCost);
double costLight1 = Light1(powerLight,timeLight1,unitsCost);
double costLight2 = Light2(powerLight,timeLight2,unitsCost);
double costLight3 = Light3(powerLight,timeLight3,unitsCost);
double costCharger = Charger(powerCharger,timeCharger,unitsCost);

double dayUsage = costCharger+costFan1+costFan2+costFan3+costFridge+costLight1+costLight2+costLight3+costTV+costWashing;
System.out.println("Units used in a day "+unitsUsed);
System.out.println("Units used in Week "+unitsUsed*7);
System.out.println("Units used in month "+unitsUsed*30);
System.out.println("Cost of electricity per day " + dayUsage);
System.out.println("Cost of electricity per week " + dayUsage*7); 
System.out.println("Cost of electricity per month " + dayUsage*30);

input.close();
}
}
