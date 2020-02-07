/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petshop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Isaac
 */
public class ChangeFiles {
    
    
    public void ChangeStock(int cat, int dog, int fish, int rabbit, int  toybone, int fakemouse, int brush1, int thowingball, int catfood, int dogfood, int fishfood, int  rabbitfood){
        
        File dirl2 = new File("res/Stock.txt");
            Scanner read = null;
            try{
                read = new Scanner(dirl2);
            }catch(FileNotFoundException e ){
                e.printStackTrace();
            }
            String str = (String) read.next();
            int Cat =  Integer.parseInt(str.length() > 2 ? str.substring(str.length() - 2) : str);
            str = (String) read.next();
            int Dog = Integer.parseInt(str.length() > 2 ? str.substring(str.length() - 2) : str);
            str = (String) read.next();
            int Fish = Integer.parseInt(str.length() > 2 ? str.substring(str.length() - 2) : str);
            str = (String) read.next();
            int Rabbit = Integer.parseInt(str.length() > 2 ? str.substring(str.length() - 2) : str);
            str = (String) read.next();
            int ToyBone = Integer.parseInt(str.length() > 2 ? str.substring(str.length() - 2) : str);
            str = (String) read.next();
            int FakeMouse = Integer.parseInt(str.length() > 2 ? str.substring(str.length() - 2) : str);
            str = (String) read.next();
            int Brush = Integer.parseInt(str.length() > 2 ? str.substring(str.length() - 2) : str);
            str = (String) read.next();
            int ThrowingBall = Integer.parseInt(str.length() > 2 ? str.substring(str.length() - 2) : str);
            str = (String) read.next();
            int CatFood = Integer.parseInt(str.length() > 2 ? str.substring(str.length() - 2) : str);
            str = (String) read.next();
            int DogFood  = Integer.parseInt(str.length() > 2 ? str.substring(str.length() - 2) : str);
            str = (String) read.next();
            int FishFood = Integer.parseInt(str.length() > 2 ? str.substring(str.length() - 2) : str);
            str = (String) read.next();
            int RabbitFood = Integer.parseInt(str.length() > 2 ? str.substring(str.length() - 2) : str);
            
            
            Cat+=cat;
            Dog+=dog;
            Fish+=fish;
            Rabbit+=rabbit;
            ToyBone+=toybone;
            FakeMouse+=fakemouse;
            Brush+=brush1;
            ThrowingBall+=thowingball;
            CatFood+=catfood;
            DogFood+=dogfood;
            FishFood+=fishfood;
            RabbitFood+=rabbitfood;
            
            
            String Cat1 = Integer.toString(Cat);
            if(Cat < 10){
                Cat1 = "0"+Cat;
            }
            String Dog1 = Integer.toString(Dog);
            if(Dog < 10){
                Dog1 = "0"+Dog;
            }
            String Fish1 = Integer.toString(Fish);
            if(Fish < 10){
                Fish1 = "0"+Fish;
            }
            String Rab1 = Integer.toString(Rabbit);
            if(Rabbit < 10){
                Rab1 = "0"+Rabbit;
            }
            String tbone = Integer.toString(ToyBone);
            if(ToyBone < 10){
                tbone = "0"+ToyBone;
            }
            String fmouse = Integer.toString(FakeMouse);
            if(FakeMouse < 10){
                fmouse = "0"+FakeMouse;
            }
            String brush = Integer.toString(Brush);
            if(Brush < 10){
                brush = "0"+Brush;
            }
            String ball = Integer.toString(ThrowingBall);
            if(ThrowingBall < 10){
                ball = "0"+ThrowingBall;
            }
            String catf = Integer.toString(CatFood);
            if(CatFood < 10){
                catf = "0"+CatFood;
            }
            String dogf = Integer.toString(DogFood);
            if(DogFood < 10){
                dogf = "0"+DogFood;
            }
            String fishf = Integer.toString(FishFood);
            if(FishFood < 10){
                fishf = "0"+FishFood;
            }
            String rabf = Integer.toString(RabbitFood);
            if(RabbitFood < 10){
                rabf = "0"+RabbitFood;
            }
            
            File dirl3 = new File("res/Stock.txt");
            try{
                 BufferedWriter out = new BufferedWriter(new FileWriter(dirl3,false));
                 out.write("Cat_" + Cat1);
                 out.newLine();
                 out.write("Dog_" + Dog1);
                 out.newLine();
                 out.write("Fish_" + Fish1);
                 out.newLine();
                 out.write("Rabbit_" + Rab1);
                 out.newLine();
                 out.write("ToyBone_" + tbone);
                 out.newLine();
                 out.write("FakeMouse_" + fmouse);
                 out.newLine();
                 out.write("Brush_" + brush);
                 out.newLine();
                 out.write("ThrowingBall_" + ball);
                 out.newLine();
                 out.write("CatFood_" + catf);
                 out.newLine();
                 out.write("DogFood_" + dogf);
                 out.newLine();
                 out.write("FishFood_" + fishf);
                 out.newLine();
                 out.write("RabbitFood_" + rabf);
                 out.newLine();
                 out.close();
            }catch(FileNotFoundException e){
                e.printStackTrace();
            } catch (IOException ex) {
                Logger.getLogger(Shop.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        
        
    }
    
}
