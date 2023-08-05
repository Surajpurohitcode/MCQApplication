package com.example.mcq;

import com.opencsv.exceptions.CsvValidationException;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.io.*;
import java.net.URL;
import java.util.*;
import java.util.concurrent.TimeUnit;

import com.opencsv.CSVReader;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class McqQa implements Initializable {

          @FXML
          private ToggleGroup options;

          @FXML
          private Label question;

          @FXML
          private RadioButton op1;

          @FXML
          private RadioButton op2;

          @FXML
          private RadioButton op3;

          @FXML
          private RadioButton op4;

        @FXML
        private Label subjectdata;

        @FXML
        private BorderPane rootpane;

        @FXML
        private MFXButton stopgame;

        static int currect;
        static int wrong;

        @FXML
        private Label timer;

        @FXML
        private MFXButton nextbtn;

        int counter = 0;
        private long min, sec, hr, totalSec = 0; //250 4 min 10 sec
         private Timer mytimer;



    private String format(long value) {
        if (value < 10) {
            return 0 + "" + value;
        }

        return value + "";
    }

    public void convertTime() {

        min = TimeUnit.SECONDS.toMinutes(totalSec);
        sec = totalSec - (min * 60);
        //hr = TimeUnit.MINUTES.toHours(min);
        min = min - (hr * 60);
        timer.setText(format(min) + ":" + format(sec));

        totalSec--;
    }

    private void setTimer() {
        totalSec = 900;
        this.mytimer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                Platform.runLater(new Runnable() {
                    @Override
                    public void run() {
                        convertTime();
                    }
                });
            }
        };

        mytimer.schedule(timerTask, 0, 1000);
    }

      @Override
      public void initialize(URL url, ResourceBundle resourceBundle) {

        subjectdata.setText(String.valueOf(McqGame.subjectdata));

        setTimer();
        question.setText("How to create a checkbox in HTML?");
        op1.setText("<input type = checkbox>");
        op2.setText("<input type = button>");
        op3.setText("<checkbox>");
        op4.setText("<input type = check>");

        op1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String ans = op1.getText();
                if (ans.equals("<input type = checkbox>"))
                {
                    currect = currect+1;
                }
                else
                {
                    wrong = wrong+1;
                }
            }
        });

          op2.setOnAction(new EventHandler<ActionEvent>() {
              @Override
              public void handle(ActionEvent event) {
                  String ans = op2.getText();
                  if (ans.equals("<input type = checkbox>"))
                  {
                      currect = currect+1;
                  }
                  else
                  {
                      wrong = wrong+1;
                  }

              }
          });

          op3.setOnAction(new EventHandler<ActionEvent>() {
              @Override
              public void handle(ActionEvent event) {
                  String ans = op3.getText();
                  if (ans.equals("<input type = checkbox>"))
                  {
                      currect = currect+1;
                  }
                  else
                  {
                      wrong = wrong+1;
                  }

              }
          });

          op4.setOnAction(new EventHandler<ActionEvent>() {
              @Override
              public void handle(ActionEvent event) {
                  String ans = op4.getText();
                  if (ans.equals("<input type = checkbox>"))
                  {
                      currect = currect+1;
                  }
                  else
                  {
                      wrong = wrong+1;
                  }
              }
          });


      }

      public void getQuestion() throws IOException, CsvValidationException {

        loadQuestion();

      }
      public void loadQuestion() throws IOException {
          if (counter==0)
          {
              question.setText("HTML stands for -");
              op1.setText("HighText Machine Language");
              op2.setText("HyperText and links Markup Language");
              op3.setText("HyperText Markup Language");
              op4.setText("None of these");

              options.getSelectedToggle().setSelected(false);

              op1.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op1.getText();
                      if (ans.equals("HyperText Markup Language"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op2.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op2.getText();
                      if (ans.equals("HyperText Markup Language"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op3.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op3.getText();
                      if (ans.equals("HyperText Markup Language"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op4.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op4.getText();
                      if (ans.equals("HyperText Markup Language"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });


          } else if (counter==1) {

              question.setText("The correct sequence of HTML tags for starting a webpage is -");
              op1.setText("Head, Title, HTML, body");
              op2.setText("HTML, Body, Title, Head");
              op3.setText("HTML, Head, Title, Body");
              op4.setText("HTML, Head, Title, Body");

              options.getSelectedToggle().setSelected(false);

              op1.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op1.getText();
                      if (ans.equals("HTML, Head, Title, Body"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op2.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op2.getText();
                      if (ans.equals("HTML, Head, Title, Body"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op3.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op3.getText();
                      if (ans.equals("HTML, Head, Title, Body"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op4.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op4.getText();
                      if (ans.equals("HTML, Head, Title, Body"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });



          }
          else if (counter==2) {

              question.setText("Which of the following element is responsible for making the text bold in HTML?");
              op1.setText("<pre>");
              op2.setText("<a>");
              op3.setText("<b>");
              op4.setText("<br>");

              options.getSelectedToggle().setSelected(false);

              op1.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op1.getText();
                      if (ans.equals("<b>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op2.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op2.getText();
                      if (ans.equals("<b>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op3.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op3.getText();
                      if (ans.equals("<b>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op4.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op4.getText();
                      if (ans.equals("<b>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });


          }

          else if (counter==3) {

              question.setText("Which of the following tag is used for inserting the largest heading in HTML?");
              op1.setText("<h3>");
              op2.setText("<h1>");
              op3.setText("<h5>");
              op4.setText("<h6>");

              options.getSelectedToggle().setSelected(false);


              op1.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op1.getText();
                      if (ans.equals("<h1>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op2.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op2.getText();
                      if (ans.equals("<h1>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op3.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op3.getText();
                      if (ans.equals("<h1>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op4.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op4.getText();
                      if (ans.equals("<h1>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

          }

          else if (counter==4) {

              question.setText("Which of the following tag is used to insert a line-break in HTML?");
              op1.setText("<br>");
              op2.setText("<a>");
              op3.setText("<pre>");
              op4.setText("<b>");

              options.getSelectedToggle().setSelected(false);

              op1.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op1.getText();
                      if (ans.equals("<br>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op2.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op2.getText();
                      if (ans.equals("<br>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op3.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op3.getText();
                      if (ans.equals("<br>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op4.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op4.getText();
                      if (ans.equals("<br>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

          }
          else if (counter==5) {

              question.setText("How to create an unordered list (a list with the list items in bullets) in HTML?");
              op1.setText("<ul>");
              op2.setText("<ol>");
              op3.setText("<li>");
              op4.setText("<i>");

              options.getSelectedToggle().setSelected(false);

              op1.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op1.getText();
                      if (ans.equals("<ul>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op2.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op2.getText();
                      if (ans.equals("<ul>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op3.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op3.getText();
                      if (ans.equals("<ul>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op4.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op4.getText();
                      if (ans.equals("<ul>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

          }
          else if (counter==6) {

              question.setText("Which character is used to represent the closing of a tag in HTML?");
              op1.setText("/");
              op2.setText("!");
              op3.setText("//");
              op4.setText(".");

              options.getSelectedToggle().setSelected(false);

              op1.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op1.getText();
                      if (ans.equals("/"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op2.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op2.getText();
                      if (ans.equals("/"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op3.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op3.getText();
                      if (ans.equals("/"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op4.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op4.getText();
                      if (ans.equals("/"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });



          }
          else if (counter==7) {

              question.setText("How to create a hyperlink in HTML?");
              op1.setText("<a href = \"www.javatpoint.com\"> javaTpoint.com </a>");
              op2.setText("<a url = \"www.javatpoint.com\" javaTpoint.com /a>");
              op3.setText("<a link = \"www.javatpoint.com\"> javaTpoint.com </a>");
              op4.setText("<a> www.javatpoint.com <javaTpoint.com /a>");

              options.getSelectedToggle().setSelected(false);

              op1.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op1.getText();
                      if (ans.equals("<a href = \"www.javatpoint.com\"> javaTpoint.com </a>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op2.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op2.getText();
                      if (ans.equals("<a href = \"www.javatpoint.com\"> javaTpoint.com </a>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op3.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op3.getText();
                      if (ans.equals("<a href = \"www.javatpoint.com\"> javaTpoint.com </a>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op4.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op4.getText();
                      if (ans.equals("<a href = \"www.javatpoint.com\"> javaTpoint.com </a>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });


          }
          else if (counter==8) {

              question.setText("How to create an ordered list (a list with the list items in numbers) in HTML?");
              op1.setText("<ul>");
              op2.setText("<ol>");
              op3.setText("<li>");
              op4.setText("<i>");


              options.getSelectedToggle().setSelected(false);

              op1.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op1.getText();
                      if (ans.equals("<ol>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op2.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op2.getText();
                      if (ans.equals("<ol>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op3.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op3.getText();
                      if (ans.equals("<ol>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op4.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op4.getText();
                      if (ans.equals("<ol>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });



          }
          else if (counter==9) {

              question.setText("Which of the following element is responsible for making the text italic in HTML?");
              op1.setText("<i>");
              op2.setText("<italic>");
              op3.setText("<it>");
              op4.setText("<pre>");

              options.getSelectedToggle().setSelected(false);

              op1.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op1.getText();
                      if (ans.equals("<i>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op2.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op2.getText();
                      if (ans.equals("<i>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op3.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op3.getText();
                      if (ans.equals("<i>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op4.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op4.getText();
                      if (ans.equals("<i>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

          }
          else if (counter==10) {

              question.setText("How to insert an image in HTML?");
              op1.setText("<img href = \"jtp.png\" />");
              op2.setText("<img url = \"jtp.png\" />");
              op3.setText("<img link = \"jtp.png\" />");
              op4.setText("<img src = \"jtp.png\" />");

              options.getSelectedToggle().setSelected(false);

              op1.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op1.getText();
                      if (ans.equals("<img src = \"jtp.png\" />"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op2.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op2.getText();
                      if (ans.equals("<img src = \"jtp.png\" />"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op3.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op3.getText();
                      if (ans.equals("<img src = \"jtp.png\" />"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op4.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op4.getText();
                      if (ans.equals("<img src = \"jtp.png\" />"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });


          }
          else if (counter==11) {

              question.setText("How to add a background color in HTML?");
              op1.setText("<marquee bg color: red>");
              op2.setText("<marquee bg-color = red>");
              op3.setText("<marquee bgcolor = red>");
              op4.setText("<marquee color = red>");

              options.getSelectedToggle().setSelected(false);


              op1.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op1.getText();
                      if (ans.equals("<marquee bg color: red>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op2.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op2.getText();
                      if (ans.equals("<marquee bg color: red>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op3.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op3.getText();
                      if (ans.equals("<marquee bg color: red>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op4.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op4.getText();
                      if (ans.equals("<marquee bg color: red>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });



          }
          else if (counter==12) {

              question.setText("<input> is -");
              op1.setText("a format tag.");
              op2.setText("an empty tag.");
              op3.setText("All of the above");
              op4.setText("None of the above");

              options.getSelectedToggle().setSelected(false);

              op1.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op1.getText();
                      if (ans.equals("an empty tag."))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op2.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op2.getText();
                      if (ans.equals("an empty tag."))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op3.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op3.getText();
                      if (ans.equals("an empty tag."))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op4.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op4.getText();
                      if (ans.equals("an empty tag."))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });




          }
          else if (counter==13) {

              question.setText("Which of the following tag is used to make the underlined text?");
              op1.setText("<i>");
              op2.setText("<ul>");
              op3.setText("<u>");
              op4.setText("<pre>");

              options.getSelectedToggle().setSelected(false);

              op1.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op1.getText();
                      if (ans.equals("<u>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op2.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op2.getText();
                      if (ans.equals("<u>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op3.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op3.getText();
                      if (ans.equals("<u>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });

              op4.setOnAction(new EventHandler<ActionEvent>() {
                  @Override
                  public void handle(ActionEvent event) {
                      String ans = op4.getText();
                      if (ans.equals("<u>"))
                      {
                          currect = currect+1;
                      }
                      else
                      {
                          wrong = wrong+1;
                      }
                  }
              });



          } else if (counter==14) {

              nextbtn.setText("Submit");
              FXMLLoader loader = new FXMLLoader(getClass().getResource("Result.fxml"));
              Parent root = loader.load();
              Stage stage = new Stage();
              Scene scene = new Scene(root);
              stage.setScene(scene);
              stage.getIcons().add(new Image("logo.png"));
              stage.show();
              rootpane.getScene().getWindow().hide();
          }
          counter++;
      }

      public void stopGame() throws IOException {
          Alert alert = new Alert(Alert.AlertType.WARNING);
          alert.setTitle("Stop Quiz");
          alert.setContentText("Are you sure you want to quit this quiz?");
          alert.setHeight(250);
          alert.setWidth(250);
          Optional<ButtonType> result = alert.showAndWait();
          ButtonType button = result.orElse(ButtonType.CANCEL);

          if (button == ButtonType.OK) {

              FXMLLoader loader = new FXMLLoader(getClass().getResource("GameScreen.fxml"));
              Parent root = loader.load();
              Stage stage = new Stage();
              Scene scene = new Scene(root);
              stage.setScene(scene);
              stage.setMaximized(true);
              stage.getIcons().add(new Image("logo.png"));
              stage.show();
              rootpane.getScene().getWindow().hide();

          } else {
              System.out.println("canceled");
          }
      }
}

