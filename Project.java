import java.sql.*;
import java.util.Random.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.text.*;
import java.text.*;
import java.util.*;
import javax.swing.undo.*;
import javax.swing.event.*;
import java.net.*;
class Project extends Frame implements ActionListener
{
        static stadiumm st[] = new stadiumm[5];
        static ArrayList<String>al = new ArrayList<String>();
        static int i=0;
        Button b1 , b2 ;
        Image p;
        Project()
        {
               setLayout(null);
               //images
               Project.al.add("X.img");
               Project.al.add("X1.img");
               Project.al.add("X2.img");
               Project.al.add("X3.img");
               Project.al.add("X4.img");
               Project.al.add("X5.img");
               Project.al.add("X6.img");
               Project.al.add("X7.img");
               Project.al.add("X8.img");
               Project.al.add("X9.img"); 
               b1 = new Button( " BOOK TICKET ");
               b2 = new Button(" EXIT ");
               b1.setBackground(Color.CYAN);
               b2.setBackground(Color.CYAN); 
               b1.setFont(new Font("Courier New",Font.BOLD,12));
               b2.setFont(new Font("Courier New",Font.BOLD,12));
               b1.setBounds( 250 , 680 , 100 , 30 );
               b2.setBounds( 1000 , 680 , 100 , 30 );

                p = new ImageIcon("homep.PNG").getImage();
               //p = new ImageIcon("CKK.jpg").getImage();

                add( b1 );
                add( b2 );
                b1.addActionListener(this);
                b2.addActionListener(this);
              
                repaint();
        }      
        public void actionPerformed( ActionEvent e)
        {
              if( e.getSource()==b1)
              {
                  Frame1 frame = new Frame1();
                 frame.setSize(1500 , 800 );
                 frame.setBackground(Color.WHITE);
                 frame.setTitle("First frame");
                 frame.setVisible(true);
           
              }
              else
               {
                    this.dispose();
               }   

        }
        public void paint( Graphics g)
        {

            g.drawImage( p , 100 ,50 , this );
            g.setColor( Color.BLACK );
            //g.drawRect( 65 , 80 , 370 , 627 );
            //g.drawRect( 65 , 680 , 100 , 25 );
            //g.drawRect( 330 , 680 , 100 , 25 );

        }
       public static void main( String[] args )
        {
            Project p  = new Project();
            p.setVisible( true );
            p.setSize( 1500 , 770 );
            p.setBackground(Color.WHITE);
            p.setTitle( " HOME PAGE ");

        }

} 
class stadiumm extends Frame implements ActionListener
{
        Label Vip[] = new Label[10];
        Label cl1[] = new Label[10];
        Label cl2[] = new Label[10];
        Label cl3[] = new Label[10];
        Label pa[] = new Label[10];
        Button b;
        
    stadiumm()
    {
        setLayout(null);


        b = new Button(" PRINT TICKET ");
        b.setBackground( new Color ( 210 , 230 , 240 ));
        b.setBounds( 853 , 148 , 100 , 25 );
        b.setFont(new Font("Courier New",Font.BOLD,12 ));
        add(b);
        b.addActionListener( this );

        //repaint();
        for ( int i=0 ; i<10 ; i++ )
        {
            Vip[i] = new Label();
            cl1[i]= new Label();
            cl2[i]= new Label();
            cl3[i] = new Label();
            pa[i] = new Label();
            Vip[i].setBackground(Color.BLACK);
            cl1[i].setBackground(Color.BLACK);
            cl2[i].setBackground(Color.BLACK);
            cl3[i].setBackground(Color.BLACK);
            pa[i].setBackground(Color.BLACK);    

            Vip[i].setForeground(Color.WHITE);
            cl1[i].setForeground(Color.WHITE);
            cl2[i].setForeground(Color.WHITE);
            cl3[i].setForeground(Color.WHITE);
            pa[i].setForeground(Color.WHITE);
        }

        Label V = new Label();
        V.setText(" VIP ");
        V.setFont(new Font( "Arial",Font.BOLD , 15 ));
        V.setForeground( new Color( 0 , 0 , 0 ));
        V.setBackground( new Color( 255 , 255 , 255 ));
        V.setBounds( 559 , 670 , 40 , 20 );

        Label c1 = new Label();
        c1.setText(" 1st Class ");
        c1.setFont(new Font( "Arial",Font.BOLD , 10 ));
        c1.setForeground( new Color( 0 , 0 , 0 ));
        c1.setBackground( new Color( 255 , 255 , 255 ));  
        c1.setBounds( 615 , 121 , 55 , 18);   

        Label c2 = new Label();
        c2.setText(" 2nd Class ");
        c2.setFont(new Font( "Arial",Font.BOLD , 10 ));
        c2.setForeground( new Color( 0 , 0 , 0 ));
        c2.setBackground( new Color( 255 , 255 , 255 ));  
        c2.setBounds( 625, 611 , 55 , 18);  
        
        Label c3 = new Label();
        c3.setText(" 3rd Class ");
        c3.setFont(new Font( "Arial",Font.BOLD , 10 ));
        c3.setForeground( new Color( 0 , 0 , 0 ));
        c3.setBackground( new Color( 255 , 255 , 255 ));  
        c3.setBounds( 137 , 156 ,  55 , 18);

        Label p = new Label();
        p.setText(" pavillion ");
        p.setFont(new Font( "Arial",Font.BOLD , 10 ));
        p.setForeground( new Color( 0 , 0 , 0 ));
        p.setBackground( new Color( 255 , 255 , 255 )); 
        p.setBounds( 108 , 641 , 55 , 18);          
        add(c1);
        add(V);
        add(c2);
        add(c3);
        //f1.add(g);
        add(p);

        // III class  SEATS 
       this.cl3[0].setBounds(192 , 285 , 30 , 20);
        this.cl3[1].setBounds(221 , 252 , 30 , 20);
        this.cl3[2].setBounds(258 , 215 , 30 , 20);
        this.cl3[3].setBounds(304 , 195 , 30 , 20);
        this.cl3[4].setBounds(353 , 177 , 30 , 20);
        this.cl3[5].setBounds(146 , 259  , 30 , 20);
        this.cl3[6].setBounds(172 , 220, 30 , 20);
        this.cl3[7].setBounds(223 , 173 , 30 , 20);
        this.cl3[8].setBounds(286 , 143 ,30 ,  20);
        this.cl3[9].setBounds(346, 122,30 , 20);

        // I class seats 

        this.cl1[0].setBounds(406, 169 , 30 , 20);
        this.cl1[1].setBounds(450 , 178  , 30 , 20);
        this.cl1[2].setBounds(493 , 193 , 30 , 20);
        this.cl1[3].setBounds(532 , 229 , 30 , 20);
        this.cl1[4].setBounds(569 , 262 , 30 , 20);
        this.cl1[5].setBounds( 410 , 110 , 30 , 20);
        this.cl1[6].setBounds(458 , 121 , 30 , 20);
        this.cl1[7].setBounds(513 , 133 , 30 , 20);
        this.cl1[8].setBounds(559 , 185 ,30 ,  20);
        this.cl1[9].setBounds(600 , 223 ,30 , 20);
        // II   
        this.cl2[0].setBounds( 587 , 304 , 30 , 20 );
        this.cl2[1].setBounds( 600 , 349 , 30 , 20 );
        this.cl2[2].setBounds( 607 , 400 , 30 , 20 );
        this.cl2[3].setBounds( 601 , 445 , 30 , 20 );
        this.cl2[4].setBounds( 580 , 498 , 30 , 20 );
        this.cl2[5].setBounds( 631 , 278 , 30 , 20 );
        this.cl2[6].setBounds( 641 , 322 , 30 , 20 );
        this.cl2[7].setBounds( 656 , 386 , 30 , 20 );
        this.cl2[8].setBounds( 641 , 466 , 30 , 20 );
        this.cl2[9].setBounds( 623 , 521 , 30 , 20 );

        // VIP seats 


        this.Vip[0].setBounds( 530 , 559 , 30 , 20 );
        this.Vip[1].setBounds( 459 , 596 , 30 , 20);
        this.Vip[2].setBounds( 371 , 611  , 30 , 20);
        this.Vip[3].setBounds(300 , 587 , 30 , 20);
        this.Vip[4].setBounds(247 , 560  , 30 , 20);
        this.Vip[5].setBounds( 563 , 592  , 30 , 20);
        this.Vip[6].setBounds( 482 , 633 , 30 , 20);
        this.Vip[7].setBounds( 364 , 668 , 30 , 20);
        this.Vip[8].setBounds( 263 , 629  ,30 ,  20);
        this.Vip[9].setBounds( 210 , 602 ,30 , 20);

        // Pavillion seats 
        this.pa[0].setBounds( 207 , 520  , 30 , 20 );
        this.pa[1].setBounds( 186 , 481 , 30 , 20 );
        this.pa[2].setBounds( 166 , 431  , 30 , 20 );
        this.pa[3].setBounds( 168 , 380 , 30 , 20 );
        this.pa[4].setBounds( 174 , 330 , 30 , 20 );
        this.pa[5].setBounds( 159 , 550  , 30 , 20 );
        this.pa[6].setBounds( 127 , 498 , 30 , 20 );
        this.pa[7].setBounds( 108 , 428 , 30 , 20 );
        this.pa[8].setBounds( 108 , 363 , 30 , 20 );
        this.pa[9].setBounds( 121 , 315 , 30 , 20 );
        

        for ( int i=0; i< 10 ; i++ )
        {
          this.Vip[i].setText((i+1)+"NB");
          this.cl1[i].setText((i+1)+"NB");
          this.cl2[i].setText((i+1)+"NB");
          this.cl3[i].setText((i+1)+"NB");
          this.pa[i].setText((i+1)+"NB");
          
          add( this.Vip[i] );
          add( this.cl1[i] );
          add( this.cl2[i] );
          add( this.cl3[i] );
          add( this.pa[i] );
          /////        
        }
        
        Label e = new Label();
        e.setBackground(Color.RED);
        e.setBounds( 650 , 36 , 25 , 20 );
        add(e);
        Label e1 = new Label();
        e1.setBounds( 650 , 60 , 25 , 20 );
        e1.setBackground(Color.GREEN);
        add(e1);  
    }
    public void actionPerformed( ActionEvent e )
    {
            if( e.getSource()==b)
            {


                        for( int i=0; i<10 ; i++)
                        {
                            if(Frame4.l[i].getText().charAt(1)=='B'||(Frame4.l[i].getText().charAt(2)=='B'&&Frame4.l[i].getText().charAt(1)=='0'))
                            {
                              Frame4.l[i].setBackground(Color.RED);
                            }
                        }
                        editor l = new editor();
                        l.setTitle(" Ticket Printing ");
                        l.setBackground(Color.BLACK);
                        l.setSize( 1300 , 800);
                        l.setVisible(true); 
                        this.dispose();
            }
    }

    static void circle( Graphics g ,int x1 , int y1 , int size, int noc, int norc ) 
    {
      for( int i=0;i<norc;i++)
      {
        for( int j=0;j<norc;j++)
        {
          g.setColor( Color.GREEN);
          g.fillRect( x1+j*size ,y1+i*size, size,size );
          g.setColor( Color.BLACK);
          g.drawRect( x1+j*size,y1+i*size,size,size);

          for( int k=0;k<noc;k++)
          {
            g.setColor(Color.YELLOW);
            g.fillOval( x1+k*( size) / (noc * 2)+size*j , y1+k*( size) / (noc *2 )+size*i ,size- k*(size) /noc ,size- k*( size)/noc );
            g.setColor(Color.BLACK);
            g.drawOval( x1+k*( size) / (noc * 2)+size*j , y1+k*( size) / (noc *2 )+size*i ,size- k*(size) /noc ,size- k*( size)/noc );
            //g.drawLine( x1+j*size+ size/2, y1+ i *size , x1+ j*size+size/2 , y1 + i*size + size );
            //g.drawLine( x1+ j*size , y1+i*size+size/2 , x1+j*size+size , y1+i*size+size/2);
            if( k==noc-1)
            {
              g.drawLine( 400 , 100 , 400 , 200   );
              g.drawLine( 659 , 250 , 577 , 307 );
              g.drawLine( 126 , 281 , 219 , 316 );
              g.drawLine( 249 , 531 , 178 , 602);
              g.drawLine( 560 , 522 , 638 , 582 );
              //g.drawLine(  );
              //g.setColor( Color.WHITE);
              g.drawLine( 390 , 99 , 389 , 198  );
              g.drawLine( 655 , 241 , 570 , 296 );
              g.drawLine( 215 , 327 , 121 , 292  );
              g.drawLine( 259 , 542 , 186 , 612  );
              g.drawLine( 634 , 588 , 551 , 533 );
              // SEAT 1
              g.drawLine( 170  , 297 , 254 , 196  );
              g.drawLine( 254 , 196 , 389 , 149 );
              g.drawLine( 177 , 299 , 258 , 203 );
              g.drawLine( 258 , 203 , 389 , 156  );
              
              g.drawLine( 149  , 236 , 236 ,  287 );
              g.drawLine(  196 , 181 , 265 , 253);
              g.drawLine( 261 , 135 , 302 , 226 );
              g.drawLine( 323 , 111  , 347 , 208  );

              // SEAT 2 
              g.drawLine(401 , 147 , 518 , 169  );
              g.drawLine( 518 , 169 , 616 , 268  );
              g.drawLine( 400 , 156 , 515 , 177  );
              g.drawLine( 515 , 177 , 610 , 271  );
              
              g.drawLine( 438 , 204 , 450 , 106 );
              g.drawLine(  478 , 215 , 497 , 117);
              g.drawLine( 519 , 239 , 567  , 152 );
              g.drawLine( 551 , 267 , 616 , 192 );

              //  SEAT 3

              g.drawLine(620 , 277 , 649 , 416);
              g.drawLine( 649 , 416 , 601 , 554 );
              g.drawLine( 615 , 279 , 641 , 418   );
              g.drawLine( 641 , 418 , 597 , 549 );
              
              g.drawLine( 589 , 338 , 680 , 295 );
              g.drawLine(  600 , 388 , 695 , 352 );
              g.drawLine( 599 , 428 , 694 , 448 );
              g.drawLine( 586 , 476 , 670 , 529   );


                

              //g.drawLine( 334 , 305 , 374 , 332);

              //seat 4
            
              g.drawLine( 598 , 565 , 395 , 664);
              g.drawLine(  395 , 664 , 222 , 578  );
              g.drawLine( 592 , 562 , 395  , 655 );
              g.drawLine( 395 , 655 , 229 , 572 );
            
              g.drawLine( 494 , 577 , 584 , 637 );
              g.drawLine( 441 , 595 , 490 , 685  );
              g.drawLine(  347 , 593 , 296 , 682);
              g.drawLine( 300 , 574 , 230 , 647);
              
              // seat 5


              g.drawLine( 211 , 569 , 140 , 439 );
              g.drawLine(  140 , 439 , 162 , 310  );
              g.drawLine( 217 , 562 , 150 , 435 );
              g.drawLine( 150 , 435 , 169 , 311  );
            
              g.drawLine( 226 , 498 , 138 , 545 );
              g.drawLine( 210 , 462 , 114 , 490  );
              g.drawLine(  200 , 417 , 101 , 400);
              g.drawLine( 202  , 377 , 106 , 344 );            }
          }
        }
      }


    }

      public void paint( Graphics g )
      {
          g.setColor( Color.BLACK );
          circle( g, 100 , 100 , 600 , 3 , 1 );

          g.setColor( Color.LIGHT_GRAY );
          g.fillRect( 374 , 356 , 40 , 85 );
          g.setColor( Color.BLACK );
          g.drawLine( 672 , 606 , 650 , 567 );

          g.drawLine(  650 , 567 , 644 , 588 );
          g.drawLine( 650 , 567 , 666 , 580 );
          
          g.drawLine( 122 , 623 , 133 , 573  );

          g.drawLine( 133 , 573 , 138 , 593  );
          g.drawLine( 133 , 573 , 116 , 587 );

          g.setColor(Color.WHITE);

          g.drawString(" Already Booked " , 750 , 49 );
          g.drawString(" Currently Booked ", 750 , 70 );
          
                  Label l = new Label();
                  Label l1 = new Label();
                  Label l2 = new Label();
                  Label l3 = new Label();
                  Label l4 = new Label();
                  Label l5 = new Label();
                  l.setForeground(Color.WHITE);
                  l1.setForeground(Color.WHITE);
                  l.setBackground(Color.GREEN);
                  l1.setBackground(Color.RED);

                  l2.setForeground(Color.WHITE);
                  l3.setForeground(Color.WHITE);
                  l2.setBackground(Color.BLUE);
                  l3.setBackground(Color.WHITE);
                  
                  l4.setForeground(Color.WHITE);
                  l5.setForeground(Color.WHITE);
                  l4.setBackground(Color.GRAY);
                  l5.setBackground(Color.DARK_GRAY);

                  ArrayList<Label> la = new ArrayList<Label>();
                  la.add(l);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l3);
                  la.add(l);
                  la.add(l4);
                  la.add(l);
                  la.add(l1);
                  la.add(l1);
                  la.add(l);
                  la.add(l5);
                  la.add(l2);
                  la.add(l1);
                  la.add(l);
                  la.add(l4);
                  la.add(l2);
                  la.add(l3);
                  la.add(l2);
                  la.add(l4);
                  la.add(l);
                  la.add(l5);
                  la.add(l);
                  la.add(l4);
                  la.add(l1);
                  la.add(l2);
                  la.add(l3);
                  la.add(l1);
                  la.add(l1);
                  la.add(l);
                  la.add(l);
                  la.add(l2);
                  la.add(l1);
                  la.add(l1);
                  la.add(l2);
                  la.add(l5);
                  la.add(l4);
                  la.add(l1);
                  la.add(l2);
                  la.add(l3);
                  la.add(l4);
                  la.add(l5);
                  la.add(l2);
                  la.add(l3);
                  la.add(l1);
                  la.add(l);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l);
                  la.add(l);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l1);
                  la.add(l5);
                  la.add(l1);
                  la.add(l1);
                  la.add(l1);
                  la.add(l);
                  la.add(l1);
                  la.add(l);
                  la.add(l2);
                  la.add(l3);
                  la.add(l4);
                  la.add(l);


                  la.add(l);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l3);
                  la.add(l);
                  la.add(l4);
                  la.add(l);
                  la.add(l1);
                  la.add(l1);
                  la.add(l);
                  la.add(l5);
                  la.add(l2);
                  la.add(l1);
                  la.add(l);
                  la.add(l4);
                  la.add(l2);
                  la.add(l3);
                  la.add(l2);
                  la.add(l4);
                  la.add(l);
                  la.add(l5);
                  la.add(l);
                  la.add(l4);
                  la.add(l1);
                  la.add(l2);
                  la.add(l3);
                  la.add(l1);
                  la.add(l1);
                  la.add(l3);
                  la.add(l);
                  la.add(l2);
                  la.add(l1);
                  la.add(l1);
                  la.add(l2);
                  la.add(l5);
                  la.add(l4);
                  la.add(l1);
                  la.add(l2);
                  la.add(l3);
                  la.add(l4);
                  la.add(l5);
                  la.add(l2);
                  la.add(l3);
                  la.add(l1);
                  la.add(l2);
                  la.add(l5);
                  la.add(l5);
                  la.add(l1);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l3);
                  la.add(l4);
                  la.add(l2);
                  la.add(l1);
                  la.add(l1);
                  la.add(l1);
                  la.add(l5);
                  la.add(l1);
                  la.add(l1);
                  la.add(l1);
                  la.add(l);
                  la.add(l1);
                  la.add(l);
                  la.add(l2);
                  la.add(l3);
                  la.add(l4);
                  la.add(l);
                  
                  la.add(l1);
                  la.add(l5);
                  la.add(l1);
                  la.add(l1);
                  la.add(l1);
                  la.add(l);
                  la.add(l1);
                  la.add(l);
                  la.add(l2);
                  la.add(l3);
                  la.add(l4);
                  la.add(l);
                                      
                   la.add(l);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l3);
                  la.add(l);
                  la.add(l4);
                  la.add(l);
                  la.add(l1);
                  la.add(l1);
                  la.add(l);
                  la.add(l5);
                  la.add(l2);
                  la.add(l1);
                  la.add(l);
                  la.add(l4);
                  la.add(l2);
                  la.add(l3);
                  la.add(l2);
                  la.add(l4);
                  la.add(l);
                  la.add(l5);
                  la.add(l);
                  la.add(l4);
                  la.add(l1);
                  la.add(l2);
                  la.add(l3);
                  la.add(l1);
                  la.add(l1);
                  la.add(l);
                  la.add(l);
                  la.add(l2);
                  la.add(l1);
                  la.add(l1);
                  la.add(l2);
                  la.add(l5);
                  la.add(l4);
                  la.add(l1);
                  la.add(l2);
                  la.add(l3);
                  la.add(l4);
                  la.add(l5);
                  la.add(l2);
                  la.add(l3);
                  la.add(l1);
                  la.add(l);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l);
                  la.add(l);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l1);
                  la.add(l5);
                  la.add(l1);
                  la.add(l1);
                  la.add(l1);
                  la.add(l);
                  la.add(l1);
                  la.add(l);
                  la.add(l2);
                  la.add(l3);
                  la.add(l4);
                  la.add(l);


                  la.add(l);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l3);
                  la.add(l);
                  la.add(l4);
                  la.add(l);
                  la.add(l1);
                  la.add(l1);
                  la.add(l);
                  la.add(l5);
                  la.add(l2);
                  la.add(l1);
                  la.add(l);
                  la.add(l4);
                  la.add(l2);
                  la.add(l3);
                  la.add(l2);
                  la.add(l4);
                  la.add(l);
                  la.add(l5);
                  la.add(l);
                  la.add(l4);
                  la.add(l1);
                  la.add(l2);
                  la.add(l3);
                  la.add(l1);
                  la.add(l1);
                  la.add(l3);
                  la.add(l);
                  la.add(l2);
                  la.add(l1);
                  la.add(l1);
                  la.add(l2);
                  la.add(l5);
                  la.add(l4);
                  la.add(l1);
                  la.add(l2);
                  la.add(l3);
                  la.add(l4);
                  la.add(l5);
                  la.add(l2);
                  la.add(l3);
                  la.add(l1);
                  la.add(l2);
                  la.add(l5);
                  la.add(l5);
                  la.add(l1);
                  la.add(l);
                  la.add(l);
                  la.add(l1);
                  la.add(l3);
                  la.add(l4);
                  la.add(l2);
                  la.add(l1);
                  la.add(l1);
                  la.add(l1);
                  la.add(l5);
                  la.add(l1);
                  la.add(l1);
                  la.add(l1);
                  la.add(l);
                  la.add(l1);
                  la.add(l);
                  la.add(l2);
                  la.add(l3);
                  la.add(l4);
                  la.add(l);
                    
                  int k =0 ;
                  for( int ii=0 ; ii<15; ii++)
                  {
                    for( int j=0 ; j<12; j++)
                    {
                        la.get(k).setBounds( 750+(j*40) , 160+(65*(ii)), 20 , 20 );
                        this.add(la.get(k));
                        k++;
                    }
                  }

          
          //circle( g, 10 , 120 , 24 , 4 , 5 );
          //circle( g, 150 , 20 , 40 , 5 , 6 );
          //circle( g, 130 , 275, 36, 3, 3 ); 
      }

     /* public static void main( String[] args )
      {
        stadiumm f1 = new stadiumm();
        f1.setSize(600, 250);
        f1.setVisible( true );
        f1.setBackground(Color.CYAN);
        
      }*/
}
                class Frame11 extends Frame implements ActionListener
                {
                        Choice c1 , c2 , c3 ;
                        Button b6 , b1 , b2 ;
                        TextField t1;
                        Frame11()
                        {
                            setLayout(null); 
                            c1 = new Choice();
                            c2 = new Choice();
                            c3 = new Choice();
                            b6 = new Button(" Cancel ");
                            b2 = new Button(" Ok ");
                            b1 = new Button(" <-- ");
                            Label l3 = new Label (" No of Tickets ");
                            t1 = new TextField();
                            l3.setFont(new Font("Courier New ",Font.BOLD,13));
                            l3.setForeground(Color.WHITE);
                            t1.setBackground(Color.DARK_GRAY);
                            t1.setForeground(Color.WHITE);
                            b1.setBackground(Color.BLACK);
                            b2.setBackground(Color.WHITE); 
                            b6.setBackground(Color.RED);
                            b2.setForeground(Color.BLACK);
                            b6.setForeground(Color.WHITE);
                            b1.setForeground(Color.WHITE);   
                                

                            c3.add(" SELECT SEATING ORDER ");
                            c3.add(" RANDOM ");
                            c3.add(" SEQUANCE ");
                            c3.add(" DESIRED ");
                            c2.add(" SELECT TICKET TYPE ");
                            c2.add(" VIP ");
                            c2.add(" 1st class ");
                            c2.add(" 2nd class ");
                            c2.add(" 3rd class ");
                            c2.add(" pavilion ");

                            c1.add(" SELECT MATCH ");
                            // selecting from todays from the table 
                             try 
                             {        //step1 load the driver class  
                                     Class.forName("oracle.jdbc.driver.OracleDriver");  
                                      
                                     //step2 create  the connection object  
                                           Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                                            PreparedStatement ps = con.prepareStatement("select * from match where m_date > current_date ");
                                            ResultSet rs = ps.executeQuery();
                                            //Vector v = new Vector();
                                            while (rs.next()) 
                                            {
                                                String s = rs.getString(1);
                                                c1.add(s);
                                            }
                                            con.close();
                                            
                           } 
                        catch (Exception ex) 
                        {
                            System.out.println(ex);

                        }  


                            
                            c1.setBounds( 100 , 50 , 200 , 20 );
                            c2.setBounds( 100 , 100 , 200 , 20 );
                            c3.setBounds( 100 , 150 , 200 , 20 );
                            t1.setBounds( 250 , 200 , 100 , 20 );
                            l3.setBounds( 50 , 200 , 100 , 20  );
                            b1.setBounds( 20 , 40 , 50 , 30   ) ;
                            b2.setBounds( 100 , 250 , 80 , 20  );
                            b6.setBounds( 230 , 250 , 80 , 20  );  

                            c1.setBackground( Color.DARK_GRAY);
                            c1.setForeground(Color.WHITE);
                            add(c1);
                            c1.setFont( new Font("Times new Roman",Font.BOLD,13));
                            c2.setBackground(Color.DARK_GRAY);
                            c2.setForeground(Color.WHITE);
                            add(c2);
                            c2.setFont( new Font("Times new Roman",Font.BOLD,13));
                            c3.setBackground(Color.DARK_GRAY);
                            c3.setForeground(Color.WHITE);
                            add(c3);
                            c3.setFont( new Font("Times new Roman",Font.BOLD,13));
                            add(t1);
                            add(l3);
                            add(b1);
                            add(b2);
                            add(b6);

                            b1.addActionListener(this);
                            b2.addActionListener(this);
                            b6.addActionListener(this);

                 
                        } 
                        public void actionPerformed( ActionEvent e)
                        {
                              if( e.getSource()==b1)
                              {
                                  this.dispose();
                              }
                              else if( e.getSource()==b2)
                              { 
                                  if( c1.getSelectedItem().equals(" SELECT MATCH ") || c2.getSelectedItem().equals(" SELECT TICKET TYPE ")|| c3.getSelectedItem().equals(" SELECT SEATING ORDER "))
                                  {
                                         JOptionPane.showMessageDialog(null," Fill details proper ");
                                  }
                                  else
                                  {


                                        Frame4.t3.setText(c1.getSelectedItem());
                                        Frame4.t1.setText(t1.getText());
                                        Frame4.c1.setText(c2.getSelectedItem());
                                        Frame4.c2.setText(c3.getSelectedItem());
                                        this.dispose();
                                  }
                              }
                              else if( e.getSource()==b6)
                              {
                                  t1.setText("");
                                  c2.remove(" SELECT SEATING ORDER ");
                                  c2.insert(" SELECT SEATING ORDER ", 0);
                                  c3.remove(" SELECT TICKET TYPE ");
                                  c3.insert(" SELECT TICKET TYPE ",0);
                                  c1.remove(" SELECT MATCH ");
                                  c1.insert(" SELECT MATCH ",0);
                              }
                        }
                }

                class Frame6 extends Frame implements ActionListener
                {
                        Choice c1 , c2 , c3 ;
                        Button b6 , b1 , b2 ;
                        TextField t1;
                        Frame6()
                        {
                            setLayout(null); 
                            c1 = new Choice();
                            c2 = new Choice();
                            c3 = new Choice();
                            b6 = new Button(" Cancel ");
                            b2 = new Button(" Ok ");
                            b1 = new Button(" <-- ");
                            Label l3 = new Label (" No of Tickets ");
                            t1 = new TextField();
                            l3.setFont(new Font("Courier New ",Font.BOLD,13));
                            l3.setForeground(Color.WHITE);
                            t1.setBackground(Color.DARK_GRAY);
                            t1.setForeground(Color.WHITE);
                            b1.setBackground(Color.BLACK);
                            b2.setBackground(Color.WHITE); 
                            b6.setBackground(Color.RED);
                            b2.setForeground(Color.BLACK);
                            b6.setForeground(Color.WHITE);
                            b1.setForeground(Color.WHITE);    

                            c3.add(" SELECT SEATING ORDER ");
                            c3.add(" RANDOM ");
                            c3.add(" SEQUANCE ");
                            c3.add(" DESIRED ");
                            c2.add(" SELECT TICKET TYPE ");
                             c2.add(" VIP ");
                            c2.add(" 1st class ");
                            c2.add(" 2nd class ");
                            c2.add(" 3rd class ");
                            c2.add(" pavilion ");
                            c1.add(" SELECT MATCH ");
                            // selecting from todays from the table 
                             try 
                             {        //step1 load the driver class  
                                     Class.forName("oracle.jdbc.driver.OracleDriver");  
                                      
                                     //step2 create  the connection object  
                                     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                                            PreparedStatement ps = con.prepareStatement("select * from match where m_date <= current_date");
                                            ResultSet rs = ps.executeQuery();
                                            //Vector v = new Vector();
                                            while (rs.next()) 
                                            {
                                                String s = rs.getString(1);
                                                c1.add(s);
                                            }
                                            con.close();
                                            
                           } 
                        catch (Exception ex) 
                        {
                            System.out.println(ex);

                        }  


                            
                            c1.setBounds( 100 , 50 , 200 , 20 );
                            c2.setBounds( 100 , 100 , 200 , 20 );
                            c3.setBounds( 100 , 150 , 200 , 20 );
                            t1.setBounds( 250 , 200 , 100 , 20 );
                            l3.setBounds( 50 , 200 , 100 , 20  );
                            b1.setBounds( 20 , 40 , 50 , 30   ) ;
                            b2.setBounds( 100 , 250 , 80 , 20  );
                            b6.setBounds( 230 , 250 , 80 , 20  );  

                            c1.setBackground( Color.DARK_GRAY);
                            c1.setForeground(Color.WHITE);
                            add(c1);
                            c1.setFont( new Font("Times new Roman",Font.BOLD,13));
                            c2.setBackground(Color.DARK_GRAY);
                            c2.setForeground(Color.WHITE);
                            add(c2);
                            c2.setFont( new Font("Times new Roman",Font.BOLD,13));
                            c3.setBackground(Color.DARK_GRAY);
                            c3.setForeground(Color.WHITE);
                            add(c3);
                            c3.setFont( new Font("Times new Roman",Font.BOLD,13));
                            add(t1);
                            add(l3);
                            add(b1);
                            add(b2);
                            add(b6);

                            b1.addActionListener(this);
                            b2.addActionListener(this);
                            b6.addActionListener(this);

                 
                        } 
                        public void actionPerformed( ActionEvent e)
                        {
                              if( e.getSource()==b1)
                              {
                                  this.dispose();
                              }
                              else if( e.getSource()==b2)
                              { 
                                 if( c1.getSelectedItem().equals(" SELECT MATCH ") || c2.getSelectedItem().equals(" SELECT TICKET TYPE ")|| c3.getSelectedItem().equals(" SELECT SEATING ORDER "))
                                  {
                                         JOptionPane.showMessageDialog(null," Fill details proper ");
                                  }
                                  else
                                  {


                                        Frame4.t3.setText(c1.getSelectedItem());
                                        Frame4.t1.setText(t1.getText());
                                        Frame4.c1.setText(c2.getSelectedItem());
                                        Frame4.c2.setText(c3.getSelectedItem());
                                        this.dispose();
                                  }
                              }
                              else if( e.getSource()==b6)
                              {
                                  t1.setText("");
                                  c2.remove(" SELECT SEATING ORDER ");
                                  c2.insert(" SELECT SEATING ORDER ", 0);
                                  c3.remove(" SELECT TICKET TYPE ");
                                  c3.insert(" SELECT TICKET TYPE ",0);
                                  c1.remove(" SELECT MATCH ");
                                  c1.insert(" SELECT MATCH ",0);
                              }
                        }
                }
                class Frame4 extends Frame implements ActionListener
                {
                    Button  b3 , b4 , b5 , b6 , b7 , b8 ; 
                    static Button b1 , b2 ;
                     static TextField c1 , c2 ;
                    static String  s=" " , p;
                     Choice c3 ;
                    static TextField t1 , t3 ;
                    static int cost, costt;
                    static int str;
                    static Label l[] = new Label[10];
                    static int start ;
                    static int not ;
                    Image conn;

                    //String msg , msg1;
                    Frame4() throws Exception 
                    {
                        setLayout(null);
                        Label l1 = new Label ( " Select Match ");
                        Label l2 = new Label ( " Ticket Type ");
                        Label l3 = new Label (" No of Tickets ");
                        Label l4 = new Label (" Add Money ");
                        Label l5 = new Label (" Cost :");
                        Label l6 = new Label (" Seat order ");
                        Label l7 = new Label (" My Balance ");


                        t1 = new TextField();
                        t3 = new TextField();

                        b1 = new Button( " UPCOMMING MATCHES " );
                        b2 = new Button( " TODAYS MATCHES " );
                        b3 = new Button( " SUBMIT ");
                        b4 = new Button(" CANCEL ");;
                        b5 = new Button(" PAY ");
                        b6 = new Button(" CANCEL ");
                        b7 = new Button(" ADD ");
                        b8 = new Button(" LOG OUT ");
                        c1 = new TextField();
                        c2 = new TextField();
                        c3 = new Choice();

                        c1.setEditable(false);
                        c2.setEditable(false);
                        t1.setEditable(false);
                        t3.setEditable(false);

                        c1.setText(" select Match ");
                        c2.setText(" select Match ");
                        t3.setText(" SELECTED MATCH ");

                        c3.add("1000");
                        c3.add("2000");
                        c3.add("3000");
                        c3.add("4000");
                        c3.add("5000");
                        c3.add("6000");
                        c3.add("10000");

                        l1.setFont(new Font("Arial", Font.BOLD, 15));
                        l2.setFont(new Font("Courier New ",Font.BOLD,13));
                        l3.setFont(new Font("Courier New ",Font.BOLD,13));
                        l4.setFont(new Font("Courier New ",Font.BOLD,13));
                        l5.setFont(new Font("Courier New ",Font.BOLD,13));
                        l6.setFont(new Font("Courier New ",Font.BOLD,13));
                        l7.setFont( new Font("Courier New ", Font.BOLD, 13));

                         b1.setFont(new Font("Courier New",Font.BOLD,12));
                         b2.setFont(new Font("Courier New",Font.BOLD,12));
                         b3.setFont(new Font("Courier New",Font.BOLD,12));
                         b4.setFont(new Font("Courier New",Font.BOLD,12));
                         b5.setFont(new Font("Courier New",Font.BOLD,12));
                         b6.setFont(new Font("Courier New",Font.BOLD,12));
                         b7.setFont(new Font("Courier New",Font.BOLD,12));
                         b8.setFont(new Font("Courier New",Font.BOLD,12));
                         
                         b1.setBackground(new Color( 0 , 0 , 0 ));
                         b2.setBackground(new Color(0 , 0 , 0));
                         b2.setForeground(Color.WHITE);
                         b1.setForeground(Color.WHITE); 
                          b4.setBackground(new Color( 200 , 10 , 50,2 ));
                         b3.setBackground( new Color( 50 , 10 , 200 , 2)); 
                          b5.setBackground(new Color( 50 , 10  , 200 , 2));
                        b6.setBackground(new Color( 200 , 10 ,50 , 2)); 
                         b7.setBackground(new Color(50 , 10 , 200 , 2));
                         b8.setBackground(Color.RED); 
                         b8.setForeground(Color.WHITE);
                          b7.setForeground(Color.WHITE);
                         t1.setBackground(Color.WHITE);
                         t3.setBackground(Color.WHITE);
                         c1.setForeground(Color.WHITE);
                         c2.setForeground(Color.WHITE);


                         c1.setBackground(new Color( 100 , 0 , 100 , 5 ));
                         c2.setBackground(new Color( 100 , 0 , 100 , 5 ) );
                         c3.setBackground(new Color( 100 , 0 , 100 , 5 )); 
                          c3.setForeground(Color.WHITE);
                        l1.setBounds( 50 , 60 , 140 , 20 );
                        l2.setBounds( 200 , 200 , 130 , 20);
                        l3.setBounds( 200 , 300 , 130 , 20);
                        l4.setBounds( 200 , 580 , 100 , 20 );
                        l5.setBounds( 200 , 420 , 100 , 20 );
                        l6.setBounds( 200 , 250 , 130 , 20 );
                        l7.setBounds( 950 , 60 , 100 , 20 );


                        t1.setBounds( 620 , 300 , 150 , 20 );
                        t3.setBounds( 290 , 60  , 120 , 20  );

                        b1.setBounds( 300 , 120 , 200 , 30);
                        b2.setBounds( 50 , 120  ,  200 , 30 );
                        b3.setBounds( 460 , 365 , 100 , 25 );
                        b4.setBounds( 660 , 365 , 100 , 25 );
                        b5.setBounds( 460 , 490 , 100 , 25);
                        b6.setBounds( 660 , 490 , 100 , 25 );
                        b7.setBounds( 520 , 650 , 100 , 30 );
                        b8.setBounds( 1100 , 120 , 100 , 40 );

                        c1.setBounds( 620 , 200 , 150 , 25);
                        c2.setBounds( 620 , 250 , 150 , 25);
                        c3.setBounds( 620 , 580 , 150 , 25);

                          /*add(l1);
                         add(l2);
                         add(l3);
                         add(l4);
                         add(l5);
                         add(l6);
                         add(l7);
                         */

                         add(t1);
                         add(t3);
                         add(b1);
                         add(b2);
                         add(b3);
                         add(b4);

                         add(b5);
                         add(b6);
                         add(b7);
                         add(b8);

                         add(c1);
                         add(c2);
                         add(c3);
                         try
                         {

                               Class.forName("oracle.jdbc.driver.OracleDriver");  
                                                  
                              //step2 create  the connection object  
                              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                             PreparedStatement pss = con.prepareStatement(" select currentbalance from users where username=? and password=? ");
                              pss.setString(1,Frame2.u);
                              pss.setString(2,Frame2.p);
                              ResultSet rss = pss.executeQuery();

                              if(rss.next())
                              {
                                  Frame4.str = Integer.parseInt(rss.getString(1));
                              }
                              repaint();
                              con.close();
                          }
                          catch( Exception e )
                          {
                              System.out.println( e );
                          }

                         b1.addActionListener(this);
                         b2.addActionListener(this);
                         b3.addActionListener(this);

                         b4.addActionListener(this);
                         b5.addActionListener(this);
                         b6.addActionListener(this);
                         b8.addActionListener(this);
                         b7.addActionListener(this);
                         conn = new ImageIcon( "Conn.png").getImage();
                           
                      }
                       public void paint(Graphics g )
                      { 
                          g.drawImage(conn , 0  , 180 , this );
                          g.setColor(new Color( 20  , 100 , 160 ));
                          g.fillRect( 5 , 5 , 1300 , 180 );
                          g.drawRect( 15 , 40 , 1250 , 130 );
                         
                          g.setColor(new Color( 20 , 0 ,60 , 160  ));
                          g.fillRect( 210 , 180 , 935 , 750 );
                          //g.drawRect( 290 , 180 , 600 , 780 );
                          g.setFont(new Font("Arial Black" , Font.BOLD , 19));
                          //g.setColor(Color.BLUE);
                          g.setColor( Color.BLACK);
                          g.drawString("Select Match" , 70  , 75 );
                          g.drawString(" My Balance :" , 970 , 72 );
                          g.setColor(Color.BLACK);
                          g.setFont( new Font("Arial Black" , Font.BOLD , 17));
                          g.drawString("Ticket Type:", 470 , 215);
                          g.drawString(" No of Tickets: " , 450 , 315);
                          g.drawString(" Add Money :" , 470 , 600 );
                          g.drawString(" Cost :" , 530 , 435 );
                          g.drawString(" Seat Order:", 470 , 265 );
                          g.setColor( Color.BLACK);
                          g.drawString("Rs."+Frame4.str, 1150 , 75 );
                          g.setColor(Color.WHITE);
                          String msg = " Rs."+Frame4.costt+" inc ";
                          g.setFont(new Font("Courier New",Font.BOLD,16));
                          g.drawString(msg,  620 , 435 );


                  
                          
                      }

                      void desired( stadiumm f , int p , String stadium , Label l2[])
                      {

                              f.setVisible(true);
                              Desired.p=p;

                              Desired ff = new Desired();
                              ff.setTitle(" Desired Ticket Booking ");
                              ff.setSize( 500 , 800 );
                              ff.setVisible( true);
                              ff.setBackground(Color.WHITE);
                              ff.desired( f , p , stadium , l2 );
                              repaint();

                               /////

                      }
                      void sequance( stadiumm f , int p , String stadium , Label l2[])
                      {
                            int c=0;
                            
                            int k = 0;
                            int start=0;
                            
                                for ( int i=0; i<10 ; i++)
                                {
                                    if( l2[i].getText().equals((i+1)+"NB"))
                                    {
                                        c++;
                                        if( c==p)
                                        {
                                            break;
                                        }
                                    }
                                    else 
                                    {
                                      c=0;
                                      start=i+1;
                                    }
                                }
                                if( c<p)
                                {
                                     JOptionPane.showMessageDialog(null," Sorry seats in sequance order not available!!!");
                                     Frame4.s=" ";
                                }
                                else
                                {
                                    int cc=0;
                                    int j = start;
                                     while(cc<p)
                                     {
                                            l2[j].setText((j+1)+"B");
                                            l2[j].setBackground(Color.GREEN);
                                            Frame4.s=Frame4.s+"    "+l2[j].getText();
                                            Frame4.p=Frame4.p+" "+j;
                                            j++;
                                            cc++;
                                      }
                                      f.setVisible(true);

                                      

                                       
                                       
                                             try 
                                               {        //step1 load the driver class  
                                                    Class.forName("oracle.jdbc.driver.OracleDriver");  
                                                      
                                                    //step2 create  the connection object  
                                                             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                                                             PreparedStatement pss = con.prepareStatement(" update users set currentbalance=currentbalance-? where username=? and password=? ");
                                                              pss.setInt(1 , Frame4.cost);
                                                              pss.setString(2,Frame2.u);
                                                              pss.setString(3,Frame2.p);
                                                             int rss = pss.executeUpdate();
                                                             JOptionPane.showMessageDialog(null," AMOUNT  " + Frame4.cost + " DEBITED FROM YOUR ACCOUNT ");
                                                             con.close();
                                                }
                                                catch( Exception e )
                                                {
                                                  System.out.println( e );

                                                }
                                          

                                                try
                                                {

                                                                 //step1 load the driver class  
                                                    Class.forName("oracle.jdbc.driver.OracleDriver");  
                                                      
                                                    //step2 create  the connection object  
                                                             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                                                              PreparedStatement psss = con.prepareStatement(" update venue set avail_no_seats = avail_no_seats-? where v_name = ?");
                                                              psss.setInt(1 , p);
                                                              psss.setString(2,stadium);
                                                             int rsss = psss.executeUpdate();
                                                             con.close();
                                                  }
                                                  catch( Exception e)
                                                  {
                                                      System.out.println( e);
                                                  }
                                                  try
                                                  {
                                                                          //step1 load the driver class  
                                                    Class.forName("oracle.jdbc.driver.OracleDriver");  
                                                      
                                                    //step2 create  the connection object  
                                                             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                                                              PreparedStatement ps = con.prepareStatement("select avail_no_seats from venue where v_name =?");
                                                                ps.setString(1, stadium);
                                                                ResultSet rs = ps.executeQuery();
                                                                int q=0;
                                                                if( rs.next())
                                                                {
                                                                    q=rs.getInt(1);
                                                                }
                                                             JOptionPane.showMessageDialog(null, " AVAIL NO OF SEATS IN " + stadium + " ARE " + q ); 
                                                             con.close();
                                                             
                                                              //l2[k].setBackground(Color.RED);

                                                 }
                                                 
                                                 catch( Exception e)
                                                 {
                                                    System.out.println( e );
                                                 }


                                                  Frame4.str-=Frame4.costt;
                                                  Frame4.costt=0;  

                                                  repaint();
                                                  Frame4.l = l2; 
                                                          
                                       
                                }
                                  
                      }
                      void random( stadiumm f , int p , String stadium , Label l1[])
                      {
                            int c =0;
                           
                           
                            
                            //System.out.println(" IN RANDOM FUNCTION ");
                            while(c<p)
                            {
                                  Random r = new Random();
                                  int j = r.nextInt(9)+1;
                                  //System.out.println(" IN WHILE " + c );

                                    if( l1[j].getText().equals((j+1)+"NB"))
                                    {
                                        c++;
                                        // nk=j;
                                        Frame4.p=Frame4.p+" "+j;
                                        l1[j].setText((j+1)+"B");
                                        l1[j].setBackground(Color.GREEN);
                                        Frame4.s=Frame4.s+"       "+l1[j].getText();
                                    }
                                         
                                   
                             } 
                              f.setVisible(true);

                             if(c==p)
                             {
                                   
                                             try 
                                               {        //step1 load the driver class  
                                                    Class.forName("oracle.jdbc.driver.OracleDriver");  
                                                      
                                                    //step2 create  the connection object  
                                                             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                                                             PreparedStatement pss = con.prepareStatement(" update users set currentbalance=currentbalance-? where username=? and password=? ");
                                                              pss.setInt(1 , Frame4.cost);
                                                              pss.setString(2,Frame2.u);
                                                              pss.setString(3,Frame2.p);
                                                             int rss = pss.executeUpdate();
                                                             JOptionPane.showMessageDialog(null," AMOUNT  " + Frame4.cost + " DEBITED FROM YOUR ACCOUNT ");
                                                             con.close();
                                                }
                                                catch( Exception e )
                                                {
                                                  System.out.println( e );

                                                }

                                                try
                                                {

                                                                 //step1 load the driver class  
                                                    Class.forName("oracle.jdbc.driver.OracleDriver");  
                                                      
                                                    //step2 create  the connection object  
                                                             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                                                              PreparedStatement psss = con.prepareStatement(" update venue set avail_no_seats = avail_no_seats-? where v_name = ?");
                                                              psss.setInt(1 , p);
                                                              psss.setString(2,stadium);
                                                             int rsss = psss.executeUpdate();
                                                             con.close();
                                                  }
                                                  catch( Exception e)
                                                  {
                                                      System.out.println( e);
                                                  }
                                                  try
                                                  {
                                                                            //step1 load the driver class  
                                                            Class.forName("oracle.jdbc.driver.OracleDriver");  
                                                            
                                                            //step2 create  the connection object  
                                                               Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                                                              PreparedStatement ps = con.prepareStatement("select avail_no_seats from venue where v_name =?");
                                                                ps.setString(1, stadium);
                                                                ResultSet rs = ps.executeQuery();
                                                                int q=0;
                                                                if( rs.next())
                                                                {
                                                                    q=rs.getInt(1);
                                                                }
                                                             JOptionPane.showMessageDialog(null, " AVAIL NO OF SEATS IN " + stadium + " ARE " + q ); 
                                                             con.close();
                                                             
                                                              //l2[k].setBackground(Color.RED);

                                                 }
                                                 
                                                 catch( Exception e)
                                                 {
                                                    System.out.println( e );
                                                 } 

                                                  Frame4.str-=Frame4.costt;
                                                  Frame4.costt=0;  

                                                  repaint();
                                                  Frame4.l = l1; 

                             }
                             else 
                             {
                                    JOptionPane.showMessageDialog(null, " NOT AVAILABLE IN RANDOM ORDER ");
                             }
                      }
                      void ordered(  stadiumm f, int p , String order , String type ,String stadium )
                      {

                            if( type.equals("VIP"))
                            {
                                  //System.out.println(" IN VIP ");
                                  int count=0;
                                  //System.out.println(" ***************&&& "); 
                                  //f.setVisible(true); 
                                  for( int i=0; i<10;i++)
                                  {
                                    //System.out.println(" IN FOR " + i );
                                      if(f.Vip[i].getText().equals((i+1)+"NB"))
                                      {
                                          count++;
                                      }
                                  }
                                  Frame4.s=Frame4.s+" VIP       ";
                                  if(p<=count)
                                  {
                                      if(order.equals("RANDOM"))
                                      {
                                            
                                            random( f, p , stadium, f.Vip);
                                      }
                                      else if( order.equals("SEQUANCE"))
                                      {
                                          sequance( f , p , stadium, f.Vip);
                                      }
                                      else if( order.equals("DESIRED"))
                                      {
                                        desired( f , p , stadium , f.Vip);
                                      }
                                  }
                                  else  
                                  {
                                         JOptionPane.showMessageDialog(null," Sorry seats in "+ type + " not available!!!");
                                  }
                            }
                            else if ( type.equals("1st class"))
                            {
                                  int count=0;  
                                  for( int i=0; i<10;i++)
                                  {
                                      if(f.cl1[i].getText().equals((i+1)+"NB"))
                                      {
                                          count++;
                                      }
                                  }
                                  Frame4.s=Frame4.s+" 1st class       ";
                                  if(p<=count)
                                  {
                                      if(order.equals("RANDOM"))
                                      {
                                            random( f, p , stadium, f.cl1);
                                      }
                                      else if( order.equals("SEQUANCE"))
                                      {
                                          sequance( f , p , stadium , f.cl1);
                                      }
                                      else if( order.equals("DESIRED"))
                                      {
                                          desired( f , p , stadium , f.cl1);
                                      }
                                  }
                                  else 
                                  {
                                         JOptionPane.showMessageDialog(null," Sorry seats in "+ type + " not available!!!");
                                  }  
                            }
                            else if( type.equals("2nd class"))
                            {
                                  int count=0;  
                                  for( int i=0; i<10;i++)
                                  {
                                      if(f.cl2[i].getText().equals((i+1)+"NB"))
                                      {
                                          count++;
                                      }
                                  }
                                  Frame4.s=Frame4.s+" 2nd Class       ";
                                  if(p<=count)
                                  {
                                      if(order.equals("RANDOM"))
                                      {
                                            random( f, p , stadium, f.cl2);
                                      }
                                      else if( order.equals("SEQUANCE"))
                                      {
                                          sequance( f , p , stadium,f.cl2);
                                      }
                                      else if( order.equals("DESIRED"))
                                      {
                                          desired(f , p , stadium , f.cl2);
                                      }
                                  }
                                  else 
                                  {
                                         JOptionPane.showMessageDialog(null," Sorry seats in "+ type + " not available!!!");
                                  }
                            }
                            else if( type.equals("3rd class"))
                            {
                                int count=0;  
                                  for( int i=0; i<10;i++)
                                  {
                                      if(f.cl3[i].getText().equals((i+1)+"NB"))
                                      {
                                          count++;
                                      }
                                  }
                                  Frame4.s=Frame4.s+" 3rd Class       ";
                                  if(p<=count)
                                  {
                                      if(order.equals("RANDOM"))
                                      {
                                            random( f, p , stadium,f.cl3);
                                      }
                                      else if( order.equals("SEQUANCE"))
                                      {
                                          sequance( f , p , stadium, f.cl3);
                                      }
                                      else if( order.equals("DESIRED"))
                                      {
                                          desired( f , p , stadium , f.cl3);
                                      }
                                  }
                                  else 
                                  {
                                         JOptionPane.showMessageDialog(null," Sorry seats in "+ type + " not available!!!");
                                  }
                            }
                            else if( type.equals("pavilion"))
                            {
                                  int count=0;  
                                  for( int i=0; i<10;i++)
                                  {
                                      if(f.pa[i].getText().equals((i+1)+"NB"))
                                      {
                                          count++;
                                      }
                                  }
                                  Frame4.s=Frame4.s+" Pavilion        ";
                                  if(p<=count)
                                  {
                                      if(order.equals("RANDOM"))
                                      {
                                            random( f, p , stadium , f.pa);
                                      }
                                      else if( order.equals("SEQUANCE"))
                                      {
                                          sequance( f , p , stadium , f.pa);
                                      }
                                      else if( order.equals("DESIRED"))
                                      {
                                          desired( f , p , stadium , f.pa);
                                      }
                                  }
                                  else 
                                  {
                                         JOptionPane.showMessageDialog(null," Sorry seats in "+ type + " not available!!!");
                                  }
                            }

                      }
                      void bookk( String stadium , String type , String order , int p)
                      {

                               
                                int cap=0;
                                Label l1 = new Label();

                                     try 
                                     {        //step1 load the driver class  
                                           Class.forName("oracle.jdbc.driver.OracleDriver");  
                                            
                                           //step2 create  the connection object  
                                             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                                                  PreparedStatement ps = con.prepareStatement("select avail_no_seats from venue where v_name=?");
                                                   ps.setString(1, stadium );
                                                  
                                                  ResultSet rs = ps.executeQuery();
                                                  if(rs.next())
                                                  {
                                                       //System.out.println("*********");

                                                       cap=Integer.parseInt(rs.getString(1));
                                                       //System.out.println(cap);
                                                      
                                                  }
                                                  else 
                                                  {
                                                      JOptionPane.showMessageDialog(null," No rows selected ");
                                                  }
                                                  con.close();
                                                                  
                                          } 
                                      catch (Exception ex) 
                                      {
                                                  System.out.println(ex);

                                      }


                                if( stadium.equals("Wankedhe"))
                                {
                                     
                                      l1.setText("WANKEDHE");
                                      l1.setFont( new Font("Courier New ",Font.BOLD,17));
                                      
                                      l1.setForeground( Color.BLACK);
                                      
                                      l1.setBackground(Color.ORANGE);
                                      l1.setBounds( 300 , 35 , 120 , 20 );

                                      if( cap==50 )
                                      {
                                          Project.st[0] = new stadiumm();
                                          Project.st[0].setSize( 1200 , 800 );
                                          Project.st[0].setVisible(true);
                                          Project.st[0].setBackground(Color.BLACK);
                                          Project.st[0].add(l1);

                                      } 
                                      //System.out.println(" STADIUMM");
                                      
                                          
                                      ordered( Project.st[0] , p , order , type , stadium );
                                      //System.out.println(" AFTER ORDERED ");
                                }
                                else if( stadium.equals("Pune"))
                                {
                                      l1.setText("PUNE STADIUM");
                                      l1.setFont( new Font("Courier New ",Font.BOLD,17));
                                      l1.setBackground(Color.ORANGE);
                                      l1.setForeground( Color.BLACK);
                                      
                                      l1.setBounds( 300 , 35 , 175 , 20 );
                                      if( cap==50)
                                      {
                                          Project.st[1] = new stadiumm();
                                           Project.st[1].setSize( 1200 , 800 );
                                          Project.st[1].setVisible(true);
                                          Project.st[1].setBackground(Color.BLACK);
                                          Project.st[1].add(l1);
                                      }  
                                      ordered( Project.st[1] , p , order , type , stadium );
                                }
                                else if( stadium.equals("Feroz shah kotla"))
                                {
                                       l1.setText("FEROH SHAH KOTLA");
                                      l1.setFont( new Font("Courier New ",Font.BOLD,17));
                                      l1.setForeground(Color.BLACK);

                                      l1.setBackground(Color.ORANGE);
                                      l1.setBounds( 300 , 35 , 190 , 25 );
                                      if( cap==50)
                                      {
                                          Project.st[2] = new stadiumm();
                                           Project.st[2].setSize( 1200 , 800 );
                                          Project.st[2].setVisible(true);
                                          Project.st[2].setBackground(Color.BLACK);
                                          Project.st[2].add(l1);
                                      }  
                                      ordered( Project.st[2] , p , order , type , stadium );
                               

                                }  
                                else if( stadium.equals("Eden gardens"))
                                {
                                       l1.setText("EDEN GARDENS");
                                      l1.setFont( new Font("Courier New ",Font.BOLD,17));
                                      l1.setBackground(Color.ORANGE);
                                      l1.setForeground(Color.BLACK);
                                      
                                      l1.setBounds( 300 , 35 , 170 , 20 );
                                      if( cap==50)
                                      {
                                          Project.st[3] = new stadiumm();
                                           Project.st[3].setSize( 1200 , 800 );
                                          Project.st[3].setVisible(true);
                                          Project.st[3].setBackground(Color.BLACK);
                                          Project.st[3].add(l1);
                                      }  
                                      ordered( Project.st[3] , p , order , type , stadium );
                               
                                }
                                else if( stadium.equals("Chiddambaram"))
                                {
                                       l1.setText("CHIDDAMBARAM");
                                      l1.setFont( new Font("Courier New ",Font.BOLD,17));
                                      l1.setBackground(Color.ORANGE);
                                      l1.setForeground(Color.BLACK);
                                      
                                      l1.setBounds( 300 , 35 , 170 , 20 );
                                      if( cap==50)
                                      {
                                          Project.st[4] = new stadiumm();
                                           Project.st[4].setSize( 1200 , 800 );
                                          Project.st[4].setVisible(true);
                                          Project.st[4].setBackground(Color.BLACK);
                                          Project.st[4].add(l1);
                                      }  
                                      ordered( Project.st[4] , p , order , type , stadium );
                               
                                }
                      }
                      void book( int p , String type , String order)
                      {

                                     try 
                                     {        //step1 load the driver class  
                                          Class.forName("oracle.jdbc.driver.OracleDriver");  
                                            
                                          //step2 create  the connection object  
                                          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                                                   PreparedStatement pss = con.prepareStatement(" select currentbalance from users where username=? and password=? ");
                                                    pss.setString(1,Frame2.u);
                                                    pss.setString(2,Frame2.p);
                                                    ResultSet rss = pss.executeQuery();

                                                   if(rss.next())
                                                   {
                                                        int pp = Integer.parseInt(rss.getString(1));
                                                        System.out.println( pp );

                                                        if(pp>=Frame4.cost)
                                                        {
                                                               

                                                              PreparedStatement ps = con.prepareStatement("select v_name from venue where v_name in ( select v_name from match where m_id = ?)");
                                                               ps.setString(1, t3.getText() );
                                                              
                                                              ResultSet rs = ps.executeQuery();
                                                              if(rs.next())
                                                              {
                                                                   //System.out.println("*****");
                                                                   bookk( rs.getString(1), type , order , p);
                                                                  
                                                              }
                                                              else 
                                                              {
                                                                  JOptionPane.showMessageDialog(null," No rows selected ");
                                                              }
                                                        }
                                                    
                                                        else
                                                        {
                                                             JOptionPane.showMessageDialog(null," INSUFFICIENT BALANCE ");
                                                        }
                                                   } 

                                                   con.close();                  
                                        } 
                                      catch (Exception ex) 
                                      {
                                                  System.out.println(ex);

                                      }


                      }
                      public void actionPerformed( ActionEvent ew)
                      {
                          if(ew.getSource()==b1)
                          {
                                Frame11 f6 = new Frame11();
                                f6.setSize(500 , 300);
                                f6.setTitle(" Upcomming_matches ");
                                Color c1 = new Color(100 , 230 , 100 );
                                f6.setBackground(Color.BLACK);
                                f6.setVisible(true);
                          }
                          else if( ew.getSource()==b2)
                          {
                                Frame6 f7 = new Frame6();
                                f7.setSize(500 , 300);
                                f7.setTitle(" Todays_matches ");
                                Color c1 = new Color(150 , 170 , 100 );
                                f7.setBackground(Color.BLACK);
                                f7.setVisible(true);
                          }
                          else if( ew.getSource()==b3)
                          { 
                                int p = Integer.parseInt(t1.getText());
                                if(t3.getText().equalsIgnoreCase(" Selected Match "))
                                {
                                        
                                       JOptionPane.showMessageDialog(null," Select Match To Submit  ");  


                                }
                              else
                              {
                                      try 
                                      {        //step1 load the driver class  
                                               Class.forName("oracle.jdbc.driver.OracleDriver");  
                                                
                                               //step2 create  the connection object  
                                               Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 
                                                    String st =" "+t3.getText().trim()+" ";

                                                      PreparedStatement ps = con.prepareStatement("select avail_no_seats from venue where v_name in ( select v_name from match where m_id = '"+st+"')");
                                                      ResultSet rs = ps.executeQuery();
                                                      //rs.setString(1,t3.getText());
                                                      //Vector v = new Vector();
                                                      if(rs.next()) 
                                                      {
                                                         
                                                          if(p<=Integer.parseInt(rs.getString(1)))
                                                          {

                                                                if(c1.getText().trim().equalsIgnoreCase("VIP"))
                                                                {
                                                                    
                                                                    Frame4.cost=p*2500;
                                                                    Frame4.costt=p*2500;
                                                                }
                                                                else if(c1.getText().trim().equalsIgnoreCase("1st class"))
                                                                {
                                                                    Frame4.cost=p*1500;
                                                                    Frame4.costt=p*1500;
                                                                }
                                                                else if(c1.getText().trim().equalsIgnoreCase("2nd class"))
                                                                {
                                                                    Frame4.cost=p*1000;
                                                                    Frame4.costt=p*1000;
                                                                }
                                                                else if(c1.getText().trim().equalsIgnoreCase("3rd class"))
                                                                {
                                                                    Frame4.cost=p*800;
                                                                    Frame4.costt=p*800;
                                                                }
                                                                else if(c1.getText().trim().equalsIgnoreCase("pavilion"))
                                                                {
                                                                    Frame4.cost=p*2000;
                                                                    Frame4.costt=p*2000;
                                                                }
                                                                
                                                                repaint();

                                                          }
                                                        
                                                          else
                                                          {
                                                                 JOptionPane.showMessageDialog(null," Seats not available "); 
                                                          }

                                                      }

                                                      con.close();
                                                      
                                                      
                                     } 
                                   catch (Exception ex) 
                                   {
                                      System.out.println(ex);

                                   }  

                              }

                                
                          }

                          else if( ew.getSource()==b4 || ew.getSource()==b6)
                          {
                              //this.dispose();
                              c1.setText(" select Match ");
                              c2.setText(" select Match ");
                              t3.setText(" SELECTED MATCH ");
                              t1.setText("0");
                              Frame4.costt=0;
                              repaint();

                          }
                          else if( ew.getSource()==b5 )
                          { 
                                 

                                 
                                 // repaint();
                                  if(Frame4.costt==0)
                                  {
                                              JOptionPane.showMessageDialog(null," SUBMIT  TO  CONTINUE  PAYMENT  ");   
                                  }
                                  else 
                                  {
                                      String type = c1.getText().trim();
                                      String order = c2.getText().trim();
                                      System.out.println(Integer.parseInt(t1.getText()));
                                        
                                        
                                        book ( Integer.parseInt(t1.getText())  , type , order );
                                  }
                                  
                          }
                          else if( ew.getSource()==b7)
                          {
                                int p = Integer.parseInt(c3.getSelectedItem());
                               try
                               {


                                      Class.forName("oracle.jdbc.driver.OracleDriver");  
                                  
                                        //step2 create  the connection object  
                                       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123");  
                                       
                                      PreparedStatement ps = con.prepareStatement(" update Users set currentbalance=currentbalance+? where Username =? and Password=?");
                                                   ps.setInt( 1, p);
                                                   ps.setString(2, Frame2.u);
                                                   ps.setString(3, Frame2.p);
                                                  int rs = ps.executeUpdate();

                                                  PreparedStatement pss = con.prepareStatement(" select currentbalance from Users where Username =? and Password=?");
                                                   pss.setString(1, Frame2.u);
                                                   pss.setString(2, Frame2.p);
                                                  ResultSet rss = pss.executeQuery();
                                                  if( rss.next())
                                                  {
                                                      str = rss.getInt(1);
                                                  }

                                      JOptionPane.showMessageDialog(null," ADDED RS." + p +" TO YOUR ACCOUNT ");
                                      con.close(); 
                                       

                                }
                                catch(Exception ex)
                                {
                                      JOptionPane.showMessageDialog(null," Amount not Added "); 
                                      System.out.println(ex);
                                } 
                                repaint();

                          }
                          else if(ew.getSource()==b8)
                          {
                              int k =  JOptionPane.showConfirmDialog(null , " Are you sure ");
                              if( k == JOptionPane.YES_OPTION)  
                              {
                                 Frame2.t1.setText("");
                                 Frame2.t2.setText("");
                                 this.dispose();   
                              }
                          }

                      }
                }
                class Frame5 extends Frame implements ActionListener
                {
                    Button b1 , b2 ; 
                    TextField t1 , t2 , t3;
                    Image ca;
                    Frame5()
                    {
                        setLayout(null);

                        t1 = new TextField();
                        t2 = new TextField();
                        t3 = new TextField();
                          ca = new ImageIcon("NE.PNG").getImage();


                         b1 = new Button (" SUBMIT ");
                         b2 = new Button (" BACK ");

                         //l.setFont(new Font("Arial", Font.BOLD, 20));
                         t1.setFont(new Font("Times new roman",Font.BOLD,18));
                         t2.setFont(new Font("Times new roman",Font.BOLD,18));
                         t3.setFont( new Font("Times new roman", Font.BOLD, 18));
                         b1.setFont(new Font("Courier New",Font.BOLD,12));
                         b2.setFont(new Font("Courier New",Font.BOLD,12));

                         b1.setBackground(new Color( 100 , 100 , 150 , 90 ));
                         b2.setBackground(new Color ( 100 , 100 , 150 , 90 ));  
                         t1.setBackground(new Color( 15 , 2 , 36 , 10 ));
                         t2.setBackground(new Color( 15 , 2 , 36 , 10 ));
                         t3.setBackground(new Color( 15 , 2 , 36 , 10));
                         t1.setForeground(Color.WHITE);
                         t2.setForeground(Color.WHITE);
                         t3.setForeground(Color.WHITE);
                        t3.setEchoChar('.');
                         b1.setBounds( 550 , 570 , 100 , 40 );
                         b2.setBounds( 750 , 570 , 100 , 40 );
                         t1.setBounds( 700 , 250 , 170 , 30 );
                         t2.setBounds( 700 , 350 , 170 , 30 );
                         t3.setBounds( 700 , 450 , 170 , 30 );
                         add(b1);
                         add(b2);
                         add(t1);
                         add(t2);
                         add(t3);

                         b1.addActionListener(this);
                         b2.addActionListener(this);


                    }
                    public void actionPerformed( ActionEvent e )
                    {
                        if( e.getSource()==b1)
                        {
                               
                               try
                               {

                                      Class.forName("oracle.jdbc.driver.OracleDriver");  
                                  
                                        //step2 create  the connection object  
                                       Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123");  
                                       Statement st=con.createStatement();
                                       
                                       if(t2.getText().equals(t3.getText()))
                                       {
                                          int i=st.executeUpdate("insert into Users(Username,Password,CurrentBalance)values('"+t1.getText()+"','"+t2.getText()+"','"+0+"')");
                                          JOptionPane.showMessageDialog(null,"Account Created successfully"); 
                                       }
                                       else 
                                       {
                                            JOptionPane.showMessageDialog(null," Mismatch in confirming password ");
                                       }
                                       con.close();

                                }
                                catch(Exception ex)
                                {
                                      JOptionPane.showMessageDialog(null,"Account already exists"); 
                                      System.out.println(ex);
                                }
                                this.dispose();
                        }
                        else if ( e.getSource()==b2)
                        {
                            this.dispose();
                        }
                    }

                    public void paint( Graphics g )
                    {

                        g.setFont(new Font("Times new Roman",Font.BOLD,35));
                        

                         g.drawImage( ca , 0 , 0 , this );

                        g.setColor( new Color( 250 , 10 , 30 ) ) ;
                        g.fillRect( 360 , 130 , 700  , 60);
                        g.setColor( new Color( 30 , 0 , 0 , 60 ));
                        g.fillRect( 360 , 190 , 700 , 500);
                      
                        g.setColor(Color.WHITE);
                         g.setFont( new Font("Times New Roman ", Font.BOLD  ,  30));

                        g.drawString( " FILL DETAILS " , 580 , 170 );
                        g.setFont( new Font(" Arial ", Font.BOLD , 20 ));
                        g.setColor( Color.WHITE);
                        g.drawString( " Username :" , 580 , 270 );
                        g.drawString(" Password :", 580 , 370  );
                        g.drawString(" Confirm Password :" , 500 , 470 );
                        g.drawRect( 360 , 130 , 700 ,560);


                    }
                }

                class Frame2 extends Frame implements ActionListener 
                {
                    Font font1;
                    Font font2;
                    Button b1 , b2 , b3 , b4; 
                    static TextField t1 , t2;
                    static String u , p ;
                    Image cup , ipl , ipl1 , bb1;
                    Frame2()
                    {
                         setLayout(null);
                         //font1 = new Font("Arial", Font.BOLD, 25);
                         font2 = new Font("Courier New",Font.BOLD,15);
                        
                         //Label l = new Label(" ONLINE TICKET BOOKING ");
                         //Label l1 = new Label(" USERNAME ");
                         //Label l2 = new Label(" PASSWORD ");

                         t1 = new TextField();
                         t2 = new TextField();
                        
                         t1.setFont(font2);
                         t2.setFont(font2);

                         b1 = new Button(" TOURNAMENT DETAILS ");
                         b2 = new Button(" BACK ");
                         b3 = new Button(" LOGIN ");
                         b4 = new Button(" CREATE NEW ACCOUNT ");
                         
                          
                         //l.setBounds( 500 , 60   , 350 , 20 );
                         b1.setBounds( 1060 , 670 , 220 , 28 );
                         b2.setBounds( 900 , 670 , 90 , 28  );
                         b3.setBounds( 425 , 670 , 90 , 28 );
                         b4.setBounds( 150 , 670 , 200 , 28 );
                        // l1.setBounds( 200 , 550 , 100 , 20);
                         //l2.setBounds( 200 , 600 , 100 , 20);
                         t1.setBounds( 400 , 540 , 150 , 27 );
                         t2.setBounds( 400 , 600 , 150 , 27 );
                           t2.setEchoChar('.');

                         //l.setFont(font1);
                        // l1.setFont(new Font("Courier",Font.BOLD,15));
                         //l2.setFont(new Font("Courier",Font.BOLD,15));
                         b1.setFont(new Font("Courier New",Font.BOLD,12));
                         b2.setFont(new Font("Courier New",Font.BOLD,12));
                         b3.setFont(new Font("Courier New",Font.BOLD,12));
                         b4.setFont(new Font("Courier New",Font.BOLD,12));
                         
                         b1.setBackground(new Color ( 190 , 90 , 40 , 50 ));
                         b2.setBackground(new Color ( 190 , 90 , 40 , 50 ));
                         b3.setBackground(new Color ( 190 , 90 , 40 , 50 ));
                         b4.setBackground(new Color ( 190 , 90 , 40 , 50 ));
                         t1.setBackground(new Color( 150 , 250 , 160 , 50 ));
                         t2.setBackground(new Color(150 , 250 , 160 , 50 ));
                         add(b1);
                         add(b2);
                         add(b4);
                         add(b3);
                         add(t1);
                         add(t2);

                         //cup = new ImageIcon("Ipl cup2.jpg").getImage();
                         //ipl = new ImageIcon("Ipl2.jpg").getImage();
                         //ipl1 = new ImageIcon("Ipl5.jpg").getImage();
                         //bb1 = new ImageIcon("ann2.jpg").getImage();
                         cup = new ImageIcon("CKK.jpg").getImage();
                         b1.addActionListener(this);
                         b2.addActionListener(this);
                         b3.addActionListener(this);
                         b4.addActionListener(this);
                      }
                         public void actionPerformed( ActionEvent e )
                         {
                              if( e.getSource()== b1 )
                              {   Frame9  f3 = new Frame9();
                                  f3.setTitle(" POints Table ");
                                  f3.setSize( 1300 , 750 );
                                  f3.setVisible( true );
                                  f3.setBackground(new Color( 0 , 0 , 70));
                               }
                              else if ( e.getSource() == b2)
                              {
                                  this.dispose();
                              }
                              else if ( e.getSource() == b3)
                              {
                                  Frame2.u = t1.getText();
                                  Frame2.p = t2.getText();
                                     try 
                                     {        //step1 load the driver class  
                                          Class.forName("oracle.jdbc.driver.OracleDriver");  
                                            
                                          //step2 create  the connection object  
                                          Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                                                  PreparedStatement ps = con.prepareStatement("select * from users where Username =? and Password= ?");
                                                   ps.setString(1, u);
                                                   ps.setString(2, p);
                                                  ResultSet rs = ps.executeQuery();
                                                  if(rs.next())
                                                  {
                                                      JOptionPane.showMessageDialog(null," WELCOME ");
                                                      Frame4 f4 = new Frame4();
                                                      f4.setSize( 1300 , 720);
                                                      f4.setVisible(true);
                                                      f4.setTitle("Booking Ticket");
                                                      Color c1 = new Color( 100 , 150 , 170);
                                                      f4.setBackground(c1);
                                                  }
                                                  else 
                                                  {
                                                      JOptionPane.showMessageDialog(null,"CREDENTIALS MISMATCH");
                                                  }

                                                  con.close();
                                                                  
                                          } 
                                      catch (Exception ex) 
                                      {
                                                  System.out.println(ex);

                                      }

                                  
                              }
                              else if ( e.getSource() == b4 )
                              {
                                  Frame5 f5 = new Frame5();
                                  f5.setTitle("Create New Account");
                                  f5.setSize( 1300 , 800);
                                  f5.setVisible(true);
                                  f5.setBackground( new Color( 150 , 170 , 180 ));
                              }
                           
                          } 

                          public void paint(Graphics g )
                          {

                            g.drawRect(200 , 550 , 100 , 20 );
                            g.drawRect(200 , 600 , 100 , 20);
                            g.setColor( Color.BLACK);
                            g.fillRect( 10 , 520 , 1350 , 200);
                            g.setColor( Color.BLACK );
                            g.drawRect(10 , 520 , 1350 , 200 );
                            //g.setColor( new Color( 230 , 150 , 130 , 100 ));
                            //g.fillRect( 210 , 520 , 470 , 125 );
                            g.setColor( Color.BLACK );
                            g.fillRect( 0 , 65 , 1360 , 65 );
                            g.setColor( Color.WHITE);
                            g.drawRect( 0 , 65 , 1360 , 65 );

                            g.drawImage( cup , 3 , 136 , this);
                            //g.drawImage( ipl , 520 , 136 , this);
                            //g.drawImage( ipl1 , 1150 , 136 , this);
                            //g.drawImage( bb1 , 10 , 520 , this );

                            g.setFont(new Font("Times new Roman",Font.BOLD,25));
                            g.setColor(Color.BLUE);
                            g.drawString( " ONLINE TICKET BOOKING ",500 , 60);
                            g.setColor(Color.WHITE);
                            g.setFont( new Font(" Courier New " , Font.BOLD , 18));
                            g.drawString(" Username " , 240 , 560 );
                            g.drawString(" Password " , 240 , 620 );

                          } 
                                
                }
                class Frame9 extends Frame implements ActionListener
                {
                       Button b; 
                       Image csk , kx ,srh , kkr , dc , rr , mi , rcb;
                      Frame9()
                      {
                         setLayout(null); 
                           b = new Button("Back");
                          b.setBackground(Color.RED);
                          b.setBounds(1100 , 590 , 100 , 40  );
                          b.addActionListener(this);
                          add(b);
                          
                          //repaint();
                      }
                        public void actionPerformed( ActionEvent e )
                        {
                          if(e.getSource()==b)
                          {
                            this.dispose();
                          }
                        }
                      
                      public void paint( Graphics g )
                      {
                        
                        g.setColor(Color.BLACK);
                        g.setColor(Color.WHITE);
                        g.setFont( new Font("Arial", Font.BOLD , 28 ));
                        g.drawString( " Points Table " , 350 , 80 );
                        csk = new ImageIcon("CSKp.jpg").getImage();
                        kx = new ImageIcon("KXP.jpg").getImage();
                        srh= new ImageIcon("SRH.Jpg").getImage();
                        kkr = new ImageIcon("KKR.jpg").getImage();
                        dc = new ImageIcon("DC.jpg").getImage();
                        rr = new ImageIcon("RR.jpg").getImage();
                        mi = new ImageIcon("MI.jpg").getImage();
                        rcb = new ImageIcon("RCB.jpg").getImage();
                        ArrayList<Image>ii = new ArrayList<Image>();
                        ii.add(csk);
                        ii.add(kx);
                        ii.add(srh);
                        ii.add(kkr);
                        ii.add(dc);
                        ii.add(rr);
                        ii.add(mi);
                        ii.add(rcb);
                        g.setColor(Color.BLACK );
                        for( int i=0; i<4 ; i++)
                        {
                            g.setColor( Color.BLACK );
                            g.fillRect( 0 , 170 + ((2*i)*65), 1000 , 65 );
                            g.setColor( new Color( 0 , 0 , 20 ));
                            g.fillRect( 0 , 170 + (((2*i)+1)*65), 1000 , 65);
                        }
                        // Team
                        g.setColor(Color.WHITE);
                        g.setFont( new Font( "Arial" , Font.BOLD , 15 ));
                        ArrayList<String> al = new ArrayList<String>();
                        al.add("CSK");
                        al.add("KXIP");
                        al.add("SRH");
                        al.add("KKR");
                        al.add("DC");
                        al.add("RR");
                        al.add("MI");
                        al.add("RCB");
                        //Pld 
                        ArrayList<Integer> pld = new ArrayList<Integer>();
                        pld.add(3);
                        pld.add(4);
                        pld.add(3);
                        pld.add(3);
                        //pld.add(3);
                        pld.add(4);
                        pld.add(4);
                        pld.add(3);
                        pld.add(4);
                        ArrayList<String> p = new ArrayList<String>();
                        p.add("+0.507");
                        p.add("+0.164");
                        p.add("+2.111");
                        p.add("+0.555");
                        p.add("+0.215");
                        p.add("-0.333");
                        p.add("-0.750");
                        p.add("-1.901");
                        ArrayList<Integer> pl = new ArrayList<Integer>();
                        pl.add(6);
                        pl.add(6);
                        pl.add(4);
                        pl.add(4);
                        pl.add(4);
                        pl.add(2);
                        pl.add(2);
                        pl.add(0);
                        //SetForm
                        ArrayList<Integer> la = new ArrayList<Integer>();
                        la.add(1);
                        la.add(1);
                        la.add(1);
                        la.add(0);
                        la.add(1);
                        la.add(1);
                        la.add(0);
                        la.add(1);
                        la.add(1);
                        la.add(1);
                        la.add(1);
                        la.add(0);
                        la.add(0);
                        la.add(1);
                        la.add(0);
                        la.add(0);
                        la.add(0);
                        la.add(1);
                        la.add(0);
                        la.add(1);
                        la.add(0);
                        la.add(0);
                        la.add(0);
                        la.add(0);
                        int k =0 ;
                        for( int i=0 ; i<8; i++)
                        {
                            for( int j=0 ; j<3; j++)
                            {
                                if(la.get(k)==1)
                                {
                                    Label l = new Label("W");
                                    l.setForeground(Color.WHITE);
                                    l.setBackground(Color.GREEN);
                                    l.setBounds( 770+(j*40) , 198+(65*(i)), 20 , 20 );
                                    this.add(l);
                                  
                                }
                                else 
                                {
                                    Label l1 = new Label("L");
                                    l1.setForeground(Color.WHITE);
                                    l1.setBackground(Color.RED);

                                    l1.setBounds( 770+(j*40) , 198+(65*(i)), 20 , 20 );
                                    this.add(l1);
                                }
                                k++;
                            }
                        }

                        for( int i=0 ; i<8; i++)
                        {
                          g.drawString((i+1)+"", 20 , 210+(65*(i)));
                          g.drawString(al.get(i) , 260 , 210+(65*i));
                          g.drawString(pld.get(i)+" ",  355 , 210+(65*i)); 
                          g.drawString(p.get(i) , 500 , 210+(65*i) );
                          g.drawString(pl.get(i)+" ", 645 ,210+(65*i));
                          g.drawImage(ii.get(i) , 100 , 180+(65*i), this);
                        }
                        g.setFont(new Font("Arial" , Font.BOLD , 20 ));
                        g.setColor( new Color( 240 , 10 , 50 ));
                        // ist column
                        //g.fillRect( 0 , )
                        g.drawString( " Team " , 100 , 150 );
                        g.drawString( " Pld " , 350 , 150 );
                        g.drawString( " Net RR " , 490 , 150 );
                        g.drawString( " Pts ", 640 , 150 );
                        g.drawString( " Form " , 790 , 150 );

                      }
                }
                class Frame1 extends Frame implements ActionListener
                {
                   //vars
                    Button b1, b2 , b3;
                   // Label l1 , l2 , l3;
                    Font font1 , font2; 
                    Image p ,m;
                    String msg = " book";
                    String msg2 = " MATCH ";
                    String msg1 = "WELCOME TO CRICKET MATCH TICKET BOOKING";

                   Frame1() {
                          setLayout(null);
                        
                  

                       //create two buttons 
                       b1=new Button("SHOW FORM");
                       b2 = new Button("BACK");

                      b2.setBackground(Color.LIGHT_GRAY);
                      b1.setBackground(Color.LIGHT_GRAY);
                       
                       font1 = new Font("Arial", Font.BOLD, 18);
                       font2 = new Font("Courier New",Font.BOLD,15);
                     //  l1.setFont(font1);
                       b1.setFont(font2);
                       b2.setFont(font2);
                       //l2.setFont(new Font("Courier",Font.BOLD,15));
                      //set the location of buttons
                   b1.setBounds(1000,650,120,25);
                   b2.setBounds( 250  , 670 , 100 , 25 );
                  // l1.setBounds(100,50,500,40);
                   //l2.setBounds(35,300,500,20);
                  p = new ImageIcon("LOGIn pagee 4.jpg").getImage();
                  m = new ImageIcon("mY1.jpg").getImage();
                  //add them to frame
                   add(b1);
                   add(b2);
                   //add(l1);
                   //add(l2);
                   
                 //add action listener to buttons
                  b1.addActionListener(this);
                  b2.addActionListener(this);
                }
                public void paint( Graphics g )
                {

                    g.setFont( new Font( "Lucida Calligraphy", Font.BOLD , 50 ));
          
                    g.setColor( Color.BLACK );

                    g.drawImage( p , 80 , 120 , this );
                    g.drawImage( m , 430 , 10 , this ); 

                      
                  g.drawString( msg , 280 , 120 );

                  g.setColor(Color.BLUE);
                  g.drawString( msg2 , 600 , 120);
                  

                    g.setColor(Color.BLACK);  
                    g.setFont( new Font( " Times new Roman " , Font.BOLD , 15 ));

                    g.setColor( Color.BLACK );
  
                    g.drawString( msg1 , 900 , 120 ); 
                    
                    //g.drawRect( 580 , 50 , 270 , 40 );

                    g.drawLine( 890 , 120 , 1350 , 120 );
                }

                public void actionPerformed(ActionEvent ae) 
                {
                     //if next button is clicked display frame2
                    if(ae.getSource()==b1)
                    {
                         //create frame2 object and display
                        
                         Frame2 f2=new Frame2();
                         f2.setSize(1500, 750);
                         f2.setVisible(true);
                         f2.setBackground(Color.LIGHT_GRAY);
                         f2.setTitle("Form2");
                      }
                      else if( ae.getSource()== b2 )

                      {
                            this.dispose();
                      }
                        
                         
                }
               
              }
//////////////////////////////////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////////////////////////////////
class editor extends Frame implements ActionListener
{

  ///


       Button b1 ;
       Image match ;
       Image venue,img;
  ///
  
            String v=" " , t=" " , d1=" ";
            editor()
            {
                                  setLayout(null);
                                  Label l1 = new Label ( " Match ");
                                  Label l2 = new Label ( " Venue ");
                                  Label l3 = new Label ( " Date & Time ");
                                  Label l4 = new Label ( " No of Tickets ");
                                  Label l5 = new Label ( " Cost ");
                                  Label l6 = new Label (" Seat Numbers ");
                                  

                                  b1 = new Button("<<");

                                  b1.setBackground(Color.CYAN);
                                  //SQL> insert into match (m_id,v_name,m_date,time, home_team , versus_team, match_img , v_img ) values (' MI VS CSK ', 'Wankedhe', '08-APR-99', ' 8:00 pm ' , load_file('C:\\Users\STUDENT\Desktop\Mumbai-Indians-Logo.png') , load_file('C:\Users\STUDENT\Desktop\images (2).jpeg') , load_file('C:\Users\STUDENT\Desktop\csk.jpg') , load_file('C:\Users\STUDENT\Desktop\wankhede-stadium.jpg') );
                                  String ss[] = Frame4.s.split(" ");
                                    

                                  if(ss[2].equalsIgnoreCase("Vip"))
                                  {
                                    img = new ImageIcon("vIP.png").getImage();

                                  } 
                                  else if(ss[2].equalsIgnoreCase("1st"))
                                  {
                                    img = new ImageIcon("FIRST CLASS.jpg").getImage();

                                  } 
                                  else if(ss[2].equalsIgnoreCase("2nd"))
                                  {
                                    img = new ImageIcon("2ND.jpg").getImage();

                                  } 
                                  else if(ss[2].equalsIgnoreCase("3rd"))
                                  {
                                    img = new ImageIcon("3RD.png").getImage();

                                  } 
                                  else if(ss[2].equalsIgnoreCase("Pavilion"))
                                  {
                                    img = new ImageIcon("PAV.jpg").getImage();

                                  } 
                                 
                                  l1.setBounds( 365 , 170  , 60  , 20 );
                                  l2.setBounds( 363 , 234 ,  65  , 20 );
                                  l3.setBounds( 335 , 279 ,  120 , 20 );
                                  l4.setBounds( 336 , 343 ,  120 , 20  );
                                  l5.setBounds( 344 , 401 , 70  , 20 );
                                  l6.setBounds( 248 , 470 , 140 , 20 );
                                  
                                  b1.setBounds( 430 , 610 , 100 , 30 );
                                  
                                  l1.setForeground(Color.WHITE);
                                  l2.setForeground(Color.WHITE);
                                  l3.setForeground(Color.WHITE);
                                  l4.setForeground(Color.WHITE);
                                  l5.setForeground(Color.WHITE);
                                  l6.setForeground(Color.WHITE);
                                  
                                  l1.setBackground(new Color( 0 , 0 , 0 , 0 ));
                                  l2.setBackground(new Color( 0 , 0 , 0 , 0 ));
                                  l3.setBackground(new Color( 0 , 0 , 0 , 0 ));
                                  l4.setBackground(new Color( 0 , 0 , 0 , 0 ));
                                  l5.setBackground(new Color( 0 , 0 , 0 , 0 ));
                                  l6.setBackground(new Color( 0 , 0 , 0 , 0 ));


                                  l1.setFont(new Font("Arial Black",Font.BOLD,13));
                                  l2.setFont( new Font("Arial Black",Font.BOLD,13));
                                  l3.setFont(new Font("Arial Black",Font.BOLD,13));
                                  l4.setFont(new Font("Arial Black",Font.BOLD,13));
                                  l5.setFont( new Font("Arial Black",Font.BOLD,13));
                                  l6.setFont(new Font("Arial Black",Font.BOLD,13));
                                  
                                  b1.setFont( new Font("Courier New ",Font.BOLD, 15));

                                  
                                  add(l1);
                                  add(l2);
                                  add(l3);
                                  add(l4);
                                  add(l5);
                                  add(l6);
                                  
                                  add(b1);
                                  b1.addActionListener(this);
                                            
                                            try
                                            {

                                                    //Load the Driver
                                                    Class.forName("oracle.jdbc.driver.OracleDriver");
                                                  
                                                     //step2 create  the connection object  
                                                     Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                                                    //create the statement object 
                                                      PreparedStatement ps = con.prepareStatement("select * from match where m_id =?");
                                                      ps.setString(1,Frame4.t3.getText());
                                                      ResultSet rs = ps.executeQuery();
                                                      if(rs.next())
                                                      {


                                                          Blob b = rs.getBlob(7);
                                                           d1  = rs.getString(3);
                                                           t = rs.getString(4);
                                                           v = rs.getString(2);

                                                          byte b1[] = new byte [(int)b.length()];
                                                          b1 = b.getBytes(1, ( int )b.length());
                                                          //System.out.println("imageb length = "+ b.length());
                                                         
                                                          FileOutputStream fos = new FileOutputStream(Project.al.get(Project.i));
                                                          fos.write(b1);
                                                          match = new ImageIcon(Project.al.get(Project.i)).getImage();
                                                          fos.close(); 
                                                          con.close();
                                                          Project.i++;
                                                          repaint();
                                                          //stmt.close();
                                                         
                                                      }
                                                      else
                                                      {
                                                           JOptionPane.showMessageDialog(null, " No rows selected " ); 
                                                      }

                                                      con.close();

                                            }
                                            catch ( Exception e)
                                            {
                                                System.out.println( e );
                                            }
                                            
                                          //  repaint();

            }

                    
                    public void actionPerformed( ActionEvent e )
                   {
                       if( e.getSource()==b1)
                       {
                            Frame4.s=" ";
                            this.dispose();
                       }
                  }

                  public void paint( Graphics g )
                  {
                        g.drawImage( match , 0 , 50 , this );
                        g.drawImage(img, 1000 , 60 , this );
                        g.setColor( new Color( 255 , 250 , 250 , 100 ));
                        //g.drawRect( 246 , 108 , 473 , 491 );
                        g.fillRect(246 , 108 , 600 , 550 );

                        g.setColor( Color.WHITE);
                        

                        g.fillRect( 498 , 164 , 150 , 30 );
                        g.fillRect( 498 , 228 , 200 , 27 );
                        g.fillRect( 498 , 273 , 250 , 30 );
                        g.fillRect( 498 , 337 , 40 , 30 );
                        g.fillRect( 498 , 395 , 150 , 30  );
                        g.fillRect( 245 , 523 , 600 , 30 );  
                        g.setColor( Color.BLACK);

                        g.setFont(new Font( " Arial Black " , Font.BOLD , 15 ));
                        //g.drawString( Frame4.t3 , )
                        /*g.drawString( "Match :" ,355 , 181 );
                        g.drawString( "Venue :",353 , 243 );
                        g.drawString(" Date & Time : " , 315 , 289 );
                        g.drawString(" No of tickets : " , 316 , 354 );
                        g.drawString(" Cost: " , 364 , 414 );
                        g.drawString(" Seat numbers :", 258 , 542 );
                        */

                        g.setColor( Color.BLACK);
                        g.drawString( Frame4.t3.getText() , 511 , 189);
                        g.drawString( v , 520 , 248 );
                        g.drawString( d1 + " " + t , 505 , 298 );
                        g.drawString( Frame4.t1.getText() , 509 , 354 );
                        g.drawString( Frame4.cost+" " , 512 , 416 );
                        g.drawString( Frame4.s , 245 , 548 );

                  }
                      
    

//END MAIN CLASS
}
 class Desired extends Frame implements ActionListener
{  
        
        ArrayList<Label>al = new ArrayList<Label>();
        static Label l2[];
        static stadiumm f;
        static int p ;
        Button b1;
        Choice c[] = new Choice[p];
            Desired()
            {
                setLayout(null);
                b1 = new Button("Book");
                b1.setBounds( 200 , 600 , 150 , 30 );
                b1.setBackground(Color.GREEN);
                add(b1);
                b1.addActionListener(this);
            }

            void desired( stadiumm f , int p , String stadium , Label l2[])
            {   
                
                   for( int i= 0 ; i<p ;i++)
                    {
                              c[i] = new Choice();
                              int start = 0;
                              Label l = new Label("Seat"+ " " +(i+1));
                              l.setFont( new Font("Courier New" , Font.BOLD , 15 ));
                              l.setBackground(Color.CYAN);
                              l.setForeground(Color.BLACK);
                              l.setBounds( 100 , 200+50*i , 100 , 20 );
                              this.add(l);
                              al.add(l);
                              for( int j=0 ; j<10 ; j++)
                              {
                                  if( l2[j].getText().endsWith("NB"))
                                  {
                                       c[i].add((j+1)+" ");
                                       
                                  }
                              } 
                              c[i].setBounds( 350 , 200+50*i , 75 , 20);
                              this.add(c[i]); 
                    }
                  Label l1  = new Label(" Select seats in order from your Ticket type ");
                  l1.setBackground(Color.CYAN);
                  l1.setForeground(Color.BLACK);
                  l1.setFont( new Font( " Times New Roman " , Font.BOLD , 15));
                  l1.setBounds( 60 , 100 , 330 , 20 );
                  this.add(l1);
                  Desired.l2 = l2;
                  Desired.f=f;
                  Desired.p=p;
                   try 
                     {        //step1 load the driver class  
                          Class.forName("oracle.jdbc.driver.OracleDriver");  
                            
                          //step2 create  the connection object  
                                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                                   PreparedStatement pss = con.prepareStatement(" update users set currentbalance=currentbalance-? where username=? and password=? ");
                                    pss.setInt(1 , Frame4.cost);
                                    pss.setString(2,Frame2.u);
                                    pss.setString(3,Frame2.p);
                                   int rss = pss.executeUpdate();
                                   JOptionPane.showMessageDialog(null," AMOUNT  " + Frame4.cost + " DEBITED FROM YOUR ACCOUNT ");
                                   con.close();
                      }
                      catch( Exception e )
                      {
                        System.out.println( e );

                      }

                      try
                      {

                                       //step1 load the driver class  
                          Class.forName("oracle.jdbc.driver.OracleDriver");  
                            
                          //step2 create  the connection object  
                                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                                    PreparedStatement psss = con.prepareStatement(" update venue set avail_no_seats = avail_no_seats-? where v_name = ?");
                                    psss.setInt(1 , p);
                                    psss.setString(2,stadium);
                                   int rsss = psss.executeUpdate();
                                   con.close();
                        }
                        catch( Exception e)
                        {
                            System.out.println( e);
                        }
                        try
                        {
                                                  //step1 load the driver class  
                                                    Class.forName("oracle.jdbc.driver.OracleDriver");  
                                                      
                                                    //step2 create  the connection object  
                                                             Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","dbms123"); 

                                    PreparedStatement ps = con.prepareStatement("select avail_no_seats from venue where v_name =?");
                                      ps.setString(1, stadium);
                                      ResultSet rs = ps.executeQuery();
                                      int q=0;
                                      if( rs.next())
                                      {
                                          q=rs.getInt(1);
                                      }
                                   JOptionPane.showMessageDialog(null, " AVAIL NO OF SEATS IN " + stadium + " ARE " + q ); 
                                   
                                    //l2[k].setBackground(Color.RED);
                                   con.close();

                       }
                       
                       catch( Exception e)
                       {
                          System.out.println( e );
                       } 

                        Frame4.str-=Frame4.costt;
                        Frame4.costt=0;  

                        //repaint();
                        //Frame4.l = l2; 


                    //repaint();
                   

            }

            public  void actionPerformed( ActionEvent e)
            {
                  int k=0;
                   for( int i=0 ; i<Desired.p-1 ; i++)
                  {
                      for( int j = i+1; j<Desired.p ; j++)
                      {
                          if( c[i].getSelectedItem().equals(c[j].getSelectedItem()))
                          {
                                k=2;
                                JOptionPane.showMessageDialog(null," Cant book a ticket more than once !!! Please Book again");
                                 //desired(); 
                          }
                      }
                      if(k==2)
                        break;
                  }
                  if( k==0)
                  {
                        for( int i=0 ; i<Desired.p ; i++)
                        {
                               int pp = Integer.parseInt(c[i].getSelectedItem().trim())-1 ;
                               Desired.l2[pp].setText((pp+1)+"B");
                               Desired.l2[pp].setBackground(Color.GREEN);
                               Frame4.s=Frame4.s+"    "+Desired.l2[pp].getText();
                        }
                  }
                  Label ll = new Label();
                  ll.setText(Frame4.s);
                  ll.setBounds( 100 , 700 , 400 , 20 );
                  this.add(ll);
 
                  Frame4.l=Desired.l2;
                 
                  this.dispose();

            }
              //f.setVisible(true);
              
 }
                    