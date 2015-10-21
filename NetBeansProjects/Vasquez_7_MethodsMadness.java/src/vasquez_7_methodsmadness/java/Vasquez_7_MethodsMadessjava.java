/*
 * Private void drawcricle(GraphicsContext gc, int x,int y,int d) {
gc.setFill(Color.blue);
gc.fillOval(x,y, d,d);
 */
package vasquez_7_methodsmadness.java;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

import javafx.stage.Stage;

public class Vasquez_7_MethodsMadessjava extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
            Canvas canvas= new Canvas(300, 250);
            GraphicsContext gc = canvas.getGraphicsContext2D();
            drawShapes(gc);
            root.getChildren().add(canvas);
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
    }
    
    private void drawShapes(GraphicsContext gc) {
   {
         gc.setFill(Color.BLACK);
        gc.setStroke(Color.RED);
        gc.setLineWidth(20);
        
        gc.fillOval(80, 60, 30, 30);
        
    
    
    }
    
  
         gc.setFill(Color.BLACK);
        
        
        gc.fillOval(150, 60, 30, 30);
        gc.strokeOval(90,80, 90,90); 
    
    
        gc.setFill(Color.YELLOW);
     
        gc.setLineWidth(10);
        gc.strokeLine(300, 45,90, 70);
       
        int i = 0;
       

 
    
     
    
        for (i =0; i < 51000; i++) {
if (i/6==0){
            
  
   cheek(gc);
necklace(gc);
M3(gc);
M4(gc);
M5(gc);
    }
        }
    }
    public void cheek(GraphicsContext gc ) {
        gc.setFill(Color.RED);   
            
   gc.fillOval(200,80, 30, 30);
        }

    
    public void necklace(GraphicsContext gc) {
        gc.setFill(Color.BLACK);
        gc.fillOval(150,180,500,100);
        gc.fillOval(200,180,500,100);
        gc.fillOval(100,180,500,100);
        gc.fillOval(50,180,500,100);
        gc.fillOval(0,180,500,100);
    }


 public void M3(GraphicsContext gc) {
 gc.setFill(Color.WHITE);
 gc.fillOval(300,200,15,30);
 gc.fillOval(250,200,15,30);
 gc.fillOval(200,200,15,30);
 gc.fillOval(100,200,15,30);
 gc.fillOval(50,200,15,30);
 }
    

 public void M4(GraphicsContext gc) {
     gc.setFill(Color.WHITE);
     gc.fillOval(90, 68, 10, 20);
    gc.fillOval(155, 65, 10, 20);
 }    


public void M5(GraphicsContext gc) {
  gc.setStroke(Color.BLACK); 
  gc.strokeOval(0,0, 550,500);

}

}