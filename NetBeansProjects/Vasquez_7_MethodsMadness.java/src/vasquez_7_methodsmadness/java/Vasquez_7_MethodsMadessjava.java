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
        
        gc.setLineWidth(20);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(150, 60, 30, 30);
        gc.strokeOval(90,80, 90,90); 
    
    
        gc.setFill(Color.YELLOW);
     
        gc.setLineWidth(10);
        gc.strokeLine(300, 45, 10, 70);
        gc.fillOval(30, 80, 30, 30);
        int i = 0;
       

 
    
     
    
        for (i =0; i < 51000; i++) {
if (i/6==0){
            
   gc.setFill(Color.BLACK);   
        gc.fillOval(100, 200, 100, 30);
   

    }
    }
    }
    public void M1(GraphicsContext gc ){
        for (int i = 0; i < 500; i++) {
        if (i / 10 == 0) {
        gc.setFill(Color.CYAN);   
            gc.fillOval(200, 200, 100, 100);
        }
        }
    }
}

    
    

    
