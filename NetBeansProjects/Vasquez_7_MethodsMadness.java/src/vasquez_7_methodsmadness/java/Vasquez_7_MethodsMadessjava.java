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
        
}
 
    int i = 0;
     int j =14;
      int x = 10;
      int y = 10;
      int d= 10;

    /**
     *
     * @param gc
     * @param j
     * @param x
     * @param y
     * @param d
     */
    public void drawcricle(GraphicsContext gc, int j,int x,int y,int d){
        gc.setFill(Color.BLACK);
        gc.setStroke(Color.RED);
    for (i =0; i < 500; i++) {
if (i % 2 ==0) {
   
      }
    }
    }  
    public void DrawNecklace(GraphicsContext gc);
            
}
        
          

                
                     
                          
        
    
            
            
            
            
            
            
            
            
            
            
    
    



                
                     
                          
        
    