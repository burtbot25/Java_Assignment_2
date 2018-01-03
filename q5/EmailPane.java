package q5;

import javafx.scene.layout.GridPane;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;


/**
 * <p>Creates an E-mail Pane class which returns output to the
 * console when the user hits "send".</p>
 *
 * @author Wilburt Herrera
 * @version 1.0
 */
public class EmailPane extends GridPane {

    /**
     * To control.
     */
    private TextField to;
    
    /**
     * Cc control.
     */
    private TextField cc;
    
    /**
     * Bcc control.
     */
    private TextField bcc;
    
    /**
     * Subject control.
     */
    private TextField subject;
    
    /**
     * Body control.
     */
    private TextArea body;
    
    /**
     * Send button.
     */
    private Button send;
    
    /**
     * Control width.
     */
    private final int fieldWidth = 500;
    
    /**
     * Body height.
     */
    private final int fieldHeight = 300;
    
    /**
     * First row in GridPane.
     */
    private final int row1 = 0;
    
    /**
     * Second row in GridPane.
     */
    private final int row2 = 1;
    
    /**
     * Third row in GridPane.
     */
    private final int row3 = 2;
    
    /**
     * Fourth row in GridPane.
     */
    private final int row4 = 3;
    
    /**
     * Fifth row in GridPane.
     */
    private final int row5 = 4;
    
    /**
     * Sixth row in GridPane.
     */
    private final int row6 = 5;
    
    /**
     * First column in GridPane.
     */
    private final int col1 = 0;
    
    /**
     * Second column in GridPane.
     */
    private final int col2 = 1;
    
    /**
     * Constructs an object of type EmailPane.
     */
    public EmailPane() {
        
        /**
         * Creates To label.
         */
        Label toLabel = new Label("To: ");
        
        /**
         * Creates Cc label.
         */
        Label ccLabel = new Label("Cc: ");
        
        /**
         * Creates Bcc label.
         */
        Label bccLabel = new Label("Bcc: ");
        
        /**
         * Creates Subject label.
         */
        Label subjectLabel = new Label("Subject: ");

        /**
         * Creates textfield for To.
         */
        to = new TextField();
        
        /**
         * Creates textfield for Cc.
         */
        cc = new TextField();
        
        /**
         * Creates textfield for Bcc.
         */
        bcc = new TextField();
        
        /**
         * Creates textfield for Subject.
         */
        subject = new TextField();
        
        /**
         * Creates textarea for the body of the e-mail.
         */
        body = new TextArea();
        
        /**
         * Creates Send button.
         */
        send = new Button("Send");
        
        /**
         * Sets To field size.
         */
        to.setPrefWidth(fieldWidth);
        
        /**
         * Sets Cc field size.
         */
        cc.setPrefWidth(fieldWidth);
        
        /**
         * Sets Bcc field size.
         */
        bcc.setPrefWidth(fieldWidth);
        
        /**
         * Sets subject field size.
         */
        subject.setPrefWidth(fieldWidth);
        
        /**
         * Sets body width.
         */
        body.setPrefWidth(fieldWidth);
        
        /**
         * Sets body height.
         */
        body.setPrefHeight(fieldHeight);
        
        /**
         * Sends action event to the event handler when "Send" is clicked.
         */
        send.setOnAction(this::processClick);
        
        /**
         * Centers grid alignment.
         */
        setAlignment(Pos.CENTER);
        
        /**
         * Adds To label to the GridPane.
         */
        add(toLabel, col1, row1);
        
        /**
         * Adds To textfield to the GridPane.
         */
        add(to, col2, row1);
        
        /**
         * Adds Cc label to the GridPane.
         */
        add(ccLabel, col1, row2);
        
        /**
         * Adds Cc textfield to the GridPane.
         */
        add(cc, col2, row2);
        
        /**
         * Adds Bcc label to the GridPane.
         */
        add(bccLabel, col1, row3);
        
        /**
         * Adds Bcc textfield to the GridPane.
         */
        add(bcc, col2, row3);
        
        /**
         * Adds Subject label to the GridPane.
         */
        add(subjectLabel, col1, row4);
        
        /**
         * Adds Subject textfield to the GridPane.
         */
        add(subject, col2, row4);
        
        /**
         * Adds Body textfield to the GridPane.
         */
        add(body, col2, row5);
        
        /**
         * Adds Send button to the GridPane.
         */
        add(send, col2, row6);
        
    }
    
    /**
     * Returns the user's input for each field to the console when 
     * the user hits the "send" button.
     * @param event invokes this method.
     */
    public void processClick(ActionEvent event) {
        
        /**
         * Outputs user's input in To to the console,
         */
        System.out.println("To: " + to.getText());
        
        /**
         * Outputs user's input in Cc to the console,
         */
        System.out.println("Cc: " + cc.getText());
        
        /**
         * Outputs user's input in Bcc to the console,
         */
        System.out.println("Bcc: " + bcc.getText());
        
        /**
         * Outputs user's input in Subject to the console,
         */
        System.out.println("Subject: " + subject.getText());
        
        /**
         * Outputs user's input in Body to the console,
         */
        System.out.println("Message: " + body.getText());

    }
    
}
