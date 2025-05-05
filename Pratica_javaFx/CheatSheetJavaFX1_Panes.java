import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
/*
 * Tipos alternativos de Pane: 
 * T2) import javafx.scene.layout.BorderPane;
 * T3) import javafx.scene.layout.TilePane;
 * T4) import javafx.scene.layout.GridPane;
 * T5) import javafx.scene.layout.FlowPane;
*/
import javafx.stage.Stage;

public class CheatSheetJavaFX1_Panes extends Application { // extends -> por ser uma aplicação
    // T1) import ... .Pane;
    @Override // Necessita do @Override para o método start
    public void start(Stage stage) {
        Pane painel = new Pane(); // É um elemento (node) de interação de usuário (UI) que guarda outros elementos
        Scene scn = new Scene(painel, 800, 600); 
        // Scene, é uma estrutura em arvore que armazena dados (o'que vai ter na aba), com o painel e a sua dimensão 
        Label texto = new Label(" Olá Mundo! em JavaFx! "); // Igual ao android studio, uma instância de Label (texto)
        texto.relocate(340, 10); // Indicador da posição.
        painel.getChildren().add( texto ); 
        /* 
         * 1. "painel" é o node principal 
         * 2. ".getChildren()" é para pegar 1 node relacionado ao node indicado (no caso o root -> painel)
         * 3. ".add()" adicionar um novo node e o conteúdo sendo a "Label texto"
         */
        Button btnClick = new Button("Clique-me"); // Cria uma instância de botão
        btnClick.relocate(10, 200); // Posiciona
        painel.getChildren().add(btnClick); // adiciona na "tela"

        TextField txtNome = new TextField(); // cria uma instância de caixa de texto
        txtNome.relocate(10, 100);
        painel.getChildren().add(txtNome);

        stage.setScene(scn); // Stage é a aba e a scene é o conteúdo da mesma
        stage.setTitle("Primeiro Programa de JavaFX"); // Controla o nome da aba
        stage.show(); // Ele quem exibe a aba.
    }
    // T2) import ... .BorderPane;
    /*
    @Override
    public void start(Stage stage) { 
        BorderPane painel = new BorderPane(); // divide a tela em: top, bottom, left, right e center
        Scene scn = new Scene(painel, 800, 600);

        Label texto = new Label(" Ola Mundo Java FX ");
        painel.setTop( texto );

        Button btnClick = new Button("Clique-me");
        painel.setBottom(btnClick);

        TextField txtNome = new TextField();
        painel.setCenter(txtNome);

        stage.setScene(scn);
        stage.setTitle("Meu primeiro programa JavaFX");
        stage.show();
    }
    */
    // T3) import ... .TilePane;
    /*
    @Override
    public void start(Stage stage) { 
        TilePane painel = new TilePane(); // posiciona os nodes um depois do outro na ordem que são adicionados em grid
        Scene scn = new Scene(painel, 800, 600);
        painel.setPrefRows(2);
        painel.setHgap(10);
        painel.setVgap(20);

        Label texto = new Label(" Ola Mundo Java FX ");
        painel.getChildren().add( texto );

        Button btnClick = new Button("Clique-me");
        painel.getChildren().add(btnClick);

        TextField txtNome = new TextField();
        painel.getChildren().add(txtNome);

        stage.setScene(scn);
        stage.setTitle("Meu primeiro programa JavaFX");
        stage.show();
    }
    */
    // T4) import ... .GridPane;
    /* 
     @Override
    public void start(Stage stage) { 
        GridPane painel = new GridPane(); // em formato de "matriz"
        Scene scn = new Scene(painel, 800, 600);
        painel.setHgap(10);
        painel.setVgap(20);

        Label texto = new Label(" Ola Mundo Java FX ");
        painel.add( texto,0,0 );

        Button btnClick = new Button("Clique-me");
        painel.add(btnClick, 0, 1);

        TextField txtNome = new TextField();
        painel.add(txtNome, 1, 1);

        stage.setScene(scn);
        stage.setTitle("Meu primeiro programa JavaFX");
        stage.show();
    }
    */
    // T5) import ... .FlowPane;
    /*
     @Override
    public void start(Stage stage) { 
        FlowPane painel = new FlowPane(); // parecido com o tile pane, porém, não é em grid
        Scene scn = new Scene(painel, 800, 600);
        painel.setHgap(10);
        painel.setVgap(20);

        Label texto = new Label(" Ola Mundo Java FX ");
        painel.getChildren().add( texto );

        Button btnClick = new Button("Clique-me");
        painel.getChildren().add(btnClick);

        TextField txtNome = new TextField();
        painel.getChildren().add(txtNome);

        stage.setScene(scn);
        stage.setTitle("Meu primeiro programa JavaFX");
        stage.show();
    }
    */
    public static void main(String[] args) {
        Application.launch(args); 
    }
}