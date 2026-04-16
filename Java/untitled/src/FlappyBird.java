//import java.awt.Color;
//import java.awt.Font;
//import java.awt.Graphics;
//import java.awt.Rectangle;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Random;
//import javax.imageio.ImageIO;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.Timer;
//
//    public class FlappyBird implements ActionListener, MouseListener, KeyListener {
//
//        public static FlappyBird flappyBird;
//        public final int WIDTH = 800, HEIGHT = 800;
//
//        public Renderer renderer;
//        public Rectangle bird;
//        public ArrayList<Rectangle> columns;
//        public int ticks, yMotion, score;
//        public boolean gameOver, started;
//        public Random rand;
//        public BufferedImage birdImage;
//
//        public FlappyBird() {
//            JFrame jframe = new JFrame();
//            Timer timer = new Timer(20, this);
//
//            renderer = new Renderer();
//            rand = new Random();
//
//            jframe.add(renderer);
//            jframe.setTitle("Flappy Bird - Face Edition");
//            jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//            jframe.setSize(WIDTH, HEIGHT);
//            jframe.addMouseListener(this);
//            jframe.addKeyListener(this);
//            jframe.setResizable(false);
//            jframe.setVisible(true);
//
//            bird = new Rectangle(WIDTH / 2 - 15, HEIGHT / 2 - 15, 40, 40); // Made bird slightly bigger for the face
//            columns = new ArrayList<Rectangle>();
//
//            // Try to load the face image
//            try {
//                birdImage = ImageIO.read(new File("face.png"));
//            } catch (IOException e) {
//                System.out.println("Image 'face.png' not found. Using drawn face fallback.");
//            }
//
//            addColumn(true);
//            addColumn(true);
//            addColumn(true);
//            addColumn(true);
//
//            timer.start();
//        }
//
//        public void addColumn(boolean start) {
//            int space = 300;
//            int width = 100;
//            int height = 50 + rand.nextInt(300);
//
//            if (start) {
//                columns.add(new Rectangle(WIDTH + width + columns.size() * 300, HEIGHT - height - 120, width, height));
//                columns.add(new Rectangle(WIDTH + width + (columns.size() - 1) * 300, 0, width, HEIGHT - height - space));
//            } else {
//                columns.add(new Rectangle(columns.get(columns.size() - 1).x + 600, HEIGHT - height - 120, width, height));
//                columns.add(new Rectangle(columns.get(columns.size() - 1).x, 0, width, HEIGHT - height - space));
//            }
//        }
//
//        public void paintColumn(Graphics g, Rectangle column) {
//            g.setColor(new Color(0, 100, 0)); // Dark green
//            g.fillRect(column.x, column.y, column.width, column.height);
//
//            // Add a border to the pipe
//            g.setColor(Color.BLACK);
//            g.drawRect(column.x, column.y, column.width, column.height);
//        }
//
//        public void jump() {
//            if (gameOver) {
//                bird = new Rectangle(WIDTH / 2 - 15, HEIGHT / 2 - 15, 40, 40);
//                columns.clear();
//                yMotion = 0;
//                score = 0;
//
//                addColumn(true);
//                addColumn(true);
//                addColumn(true);
//                addColumn(true);
//
//                gameOver = false;
//            }
//
//            if (!started) {
//                started = true;
//            } else if (!gameOver) {
//                if (yMotion > 0) {
//                    yMotion = 0;
//                }
//                yMotion -= 10;
//            }
//        }
//
//        @Override
//        public void actionPerformed(ActionEvent e) {
//            int speed = 10;
//            ticks++;
//
//            if (started) {
//                for (int i = 0; i < columns.size(); i++) {
//                    Rectangle column = columns.get(i);
//                    column.x -= speed;
//                }
//
//                if (ticks % 2 == 0 && yMotion < 15) {
//                    yMotion += 2;
//                }
//
//                for (int i = 0; i < columns.size(); i++) {
//                    Rectangle column = columns.get(i);
//
//                    if (column.x + column.width < 0) {
//                        columns.remove(column);
//
//                        if (column.y == 0) {
//                            addColumn(false);
//                        }
//                    }
//                }
//
//                bird.y += yMotion;
//
//                for (Rectangle column : columns) {
//                    if (column.y == 0 && bird.x + bird.width / 2 > column.x + column.width / 2 - 10 && bird.x + bird.width / 2 < column.x + column.width / 2 + 10) {
//                        score++;
//                    }
//
//                    if (column.intersects(bird)) {
//                        gameOver = true;
//                        if (bird.x <= column.x) {
//                            bird.x = column.x - bird.width;
//                        } else {
//                            if (column.y != 0) {
//                                bird.y = column.y - bird.height;
//                            } else if (bird.y < column.height) {
//                                bird.y = column.height;
//                            }
//                        }
//                    }
//                }
//
//                if (bird.y > HEIGHT - 120 || bird.y < 0) {
//                    gameOver = true;
//                }
//
//                if (bird.y + yMotion >= HEIGHT - 120) {
//                    bird.y = HEIGHT - 120 - bird.height;
//                    gameOver = true;
//                }
//            }
//
//            renderer.repaint();
//        }
//
//        public void repaint(Graphics g) {
//            // Sky
//            g.setColor(new Color(135, 206, 235)); // Sky Blue
//            g.fillRect(0, 0, WIDTH, HEIGHT);
//
//            // Ground
//            g.setColor(new Color(222, 184, 135)); // Light brown
//            g.fillRect(0, HEIGHT - 120, WIDTH, 120);
//
//            // Grass on top of ground
//            g.setColor(new Color(34, 139, 34)); // Forest Green
//            g.fillRect(0, HEIGHT - 120, WIDTH, 20);
//
//            // --- DRAWING THE BIRD / FACE ---
//            if (birdImage != null) {
//                // If face.png exists, draw it
//                g.drawImage(birdImage, bird.x, bird.y, bird.width, bird.height, null);
//            } else {
//                // FALLBACK: Draw a "Face" manually if image is missing
//                g.setColor(Color.YELLOW);
//                g.fillOval(bird.x, bird.y, bird.width, bird.height);
//
//                g.setColor(Color.BLACK);
//                g.drawOval(bird.x, bird.y, bird.width, bird.height); // Outline
//
//                // Eyes
//                g.fillOval(bird.x + 8, bird.y + 10, 8, 8);
//                g.fillOval(bird.x + 24, bird.y + 10, 8, 8);
//
//                // Mouth (Smile)
//                g.drawArc(bird.x + 8, bird.y + 15, 24, 15, 180, 180);
//            }
//            // -------------------------------
//
//            for (Rectangle column : columns) {
//                paintColumn(g, column);
//            }
//
//            g.setColor(Color.white);
//            g.setFont(new Font("Arial", 1, 80));
//
//            if (!started) {
//                g.drawString("Click to Start!", 100, HEIGHT / 2 - 50);
//            }
//
//            if (gameOver) {
//                g.drawString("Game Over!", 150, HEIGHT / 2 - 50);
//                g.setFont(new Font("Arial", 1, 50));
//                g.drawString("Score: " + String.valueOf(score/2), WIDTH / 2 - 100, HEIGHT / 2 + 50);
//                g.drawString("Click to Restart", 200, HEIGHT / 2 + 150);
//            }
//
//            if (!gameOver && started) {
//                g.drawString(String.valueOf(score/2), WIDTH / 2 - 25, 100);
//            }
//        }
//
//        public static void main(String[] args) {
//            flappyBird = new FlappyBird();
//        }
//
//        // Helper class
//        public class Renderer extends JPanel {
//            private static final long serialVersionUID = 1L;
//
//            @Override
//            protected void paintComponent(Graphics g) {
//                super.paintComponent(g);
//                FlappyBird.flappyBird.repaint(g);
//            }
//        }
//
//        @Override
//        public void mouseClicked(MouseEvent e) {
//            jump();
//        }
//
//        @Override
//        public void keyReleased(KeyEvent e) {
//            if (e.getKeyCode() == KeyEvent.VK_SPACE) {
//                jump();
//            }
//        }
//
//        // Empty required methods
//        @Override public void mousePressed(MouseEvent e) {}
//        @Override public void mouseReleased(MouseEvent e) {}
//        @Override public void mouseEntered(MouseEvent e) {}
//        @Override public void mouseExited(MouseEvent e) {}
//        @Override public void keyTyped(KeyEvent e) {}
//        @Override public void keyPressed(KeyEvent e) {}
//    }
//

//
//import java.awt.*;
//import java.awt.event.*;
//import java.util.ArrayList;
//import java.util.Random;
//import javax.swing.*;
//
//public class FlappyBird extends JPanel implements ActionListener, KeyListener {
//
//    // Image dimensions
//    int boardWidth = 360;
//    int boardHeight = 640;
//
//    // Bird
//    int birdX = boardWidth / 8;
//    int birdY = boardHeight / 2;
//    int birdWidth = 34;
//    int birdHeight = 24;
//
//    class Bird {
//        int x = birdX;
//        int y = birdY;
//        int width = birdWidth;
//        int height = birdHeight;
//        Image img;
//
//        Bird(Image img) {
//            this.img = img;
//        }
//    }
//
//    // Pipes
//    int pipeX = boardWidth;
//    int pipeY = 0;
//    int pipeWidth = 64;
//    int pipeHeight = 512;
//
//    class Pipe {
//        int x = pipeX;
//        int y = pipeY;
//        int width = pipeWidth;
//        int height = pipeHeight;
//        Image img;
//        boolean passed = false; // Check if bird passed the pipe
//
//        Pipe(Image img) {
//            this.img = img;
//        }
//    }
//
//    // Game Logic
//    Bird bird;
//    int velocityX = -4; // moves pipes to the left speed
//    int velocityY = 0; // move bird up/down speed
//    int gravity = 1;
//
//    ArrayList<Pipe> pipes;
//    Random random = new Random();
//
//    Timer gameLoop;
//    Timer placePipesTimer;
//    boolean gameOver = false;
//    double score = 0;
//
//    public FlappyBird() {
//        setPreferredSize(new Dimension(boardWidth, boardHeight));
//        setBackground(Color.blue);
//        setFocusable(true);
//        addKeyListener(this);
//
//        // Initialize Objects
//        bird = new Bird(null);
//        pipes = new ArrayList<Pipe>();
//
//        // Place pipes timer (every 1.5 seconds)
//        placePipesTimer = new Timer(1500, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                placePipes();
//            }
//        });
//        placePipesTimer.start();
//
//        // Game Loop timer (60 times per second)
//        gameLoop = new Timer(1000/60, this);
//        gameLoop.start();
//    }
//
//    public void placePipes() {
//        // (0-1) * pipeHeight/2 -> (0-256)
//        // 128
//        // 0 - 128 - (0-256) --> 1/4 pipeHeight -> 3/4 pipeHeight
//        int randomPipeY = (int) (pipeY - pipeHeight/4 - Math.random()*(pipeHeight/2));
//        int openingSpace = boardHeight/4;
//
//        Pipe topPipe = new Pipe(null);
//        topPipe.y = randomPipeY;
//        pipes.add(topPipe);
//
//        Pipe bottomPipe = new Pipe(null);
//        bottomPipe.y = topPipe.y + pipeHeight + openingSpace;
//        pipes.add(bottomPipe);
//    }
//
//    public void paintComponent(Graphics g) {
//        super.paintComponent(g);
//        draw(g);
//    }
//
//    public void draw(Graphics g) {
//        // Draw Bird
//        g.setColor(Color.orange);
//        g.fillRect(bird.x, bird.y, bird.width, bird.height);
//
//        // Draw Pipes
//        g.setColor(Color.green);
//        for (int i = 0; i < pipes.size(); i++) {
//            Pipe pipe = pipes.get(i);
//            g.fillRect(pipe.x, pipe.y, pipe.width, pipe.height);
//        }
//
//        // Draw Score
//        g.setColor(Color.white);
//        g.setFont(new Font("Arial", Font.PLAIN, 32));
//        if (gameOver) {
//            g.drawString("Game Over: " + (int) score, 10, 35);
//            g.drawString("Press Space to Restart", 10, 70);
//        } else {
//            g.drawString(String.valueOf((int) score), 10, 35);
//        }
//    }
//
//    public void move() {
//        // Bird
//        velocityY += gravity;
//        bird.y += velocityY;
//        bird.y = Math.max(bird.y, 0);
//
//        // Pipes
//        for (int i = 0; i < pipes.size(); i++) {
//            Pipe pipe = pipes.get(i);
//            pipe.x += velocityX;
//
//            if (!pipe.passed && bird.x > pipe.x + pipe.width) {
//                pipe.passed = true;
//                score += 0.5; // 0.5 because there are 2 pipes (top and bottom) per set
//            }
//
//            if (collision(bird, pipe)) {
//                gameOver = true;
//            }
//        }
//
//        if (bird.y > boardHeight) {
//            gameOver = true;
//        }
//    }
//
//    public boolean collision(Bird a, Pipe b) {
//        return a.x < b.x + b.width &&   // a's top left doesn't reach b's top right
//                a.x + a.width > b.x &&   // a's top right passes b's top left
//                a.y < b.y + b.height &&  // a's top left doesn't reach b's bottom left
//                a.y + a.height > b.y;    // a's bottom left passes b's top left
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        move();
//        repaint();
//        if (gameOver) {
//            placePipesTimer.stop();
//            gameLoop.stop();
//        }
//    }
//
//    @Override
//    public void keyPressed(KeyEvent e) {
//        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
//            if (gameOver) {
//                // Restart game logic
//                bird.y = birdY;
//                velocityY = 0;
//                pipes.clear();
//                score = 0;
//                gameOver = false;
//                gameLoop.start();
//                placePipesTimer.start();
//            } else {
//                velocityY = -9; // Jump strength
//            }
//        }
//    }
//
//    @Override
//    public void keyTyped(KeyEvent e) {}
//
//    @Override
//    public void keyReleased(KeyEvent e) {}
//
//    // Main Method to set up the Window
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Flappy Bird");
//        FlappyBird game = new FlappyBird();
//
//        frame.add(game);
//        frame.pack(); // Sizing the frame to fit the JPanel
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//        frame.setResizable(false);
//    }
//}
