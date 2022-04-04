package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import control.ControleAcessorio;
import control.ControleDados;
import control.ControleRoupa;
import control.ControleUsuario;

import model.Acessorio;
import model.Roupa;

public class TelaDetalheProduto implements ActionListener {
	private JFrame janela;
	private JLabel labelNome = new JLabel("Nome: ");
	private JTextField valorNome;
	private JLabel labelDepartamento = new JLabel("Departamento: ");
	String departamentos[] = {"Masculino", "Feminino", "Infantil", "Unissex"};
	private JComboBox comboboxDepartamento;
	private JLabel labelDescricao = new JLabel("Descricao: ");
	private JTextField valorDescricao;
	private JLabel labelMarca = new JLabel("Marca: ");
	private JTextField valorMarca;
	private JLabel labelPreco = new JLabel("Preco(R$): ");
	private JTextField valorPreco;//
	private JLabel labelCondicao = new JLabel("Condicao: ");
	String condicao[] = {"Ruim", "Neutra", "Boa", "Otima"};
	private JComboBox comboboxCondicao;
	private JLabel labelCor = new JLabel("Cor: ");
	private JTextField valorCor;
	private JLabel labelMaterial = new JLabel("Material: ");
	private JTextField valorMaterial;
	private JLabel labelPeso = new JLabel("Peso(g): ");
	private JTextField valorPeso;
	private JLabel labelMedida = new JLabel("Medida(largura/altura): ");
	private JTextField valorMedidaLargura;
	private JTextField valorMedidaAltura;
	private JLabel labelTamanho = new JLabel("Tamanho(P/M/G): ");
	String tamanhos[] = {"PP", "P", "M", "G", "GG"};
	private JComboBox comboboxTamanho;
	private JLabel labelTecido = new JLabel("Tecido: ");
	private JTextField valorTecido;
	private JLabel labelEstampa = new JLabel("Estampa: ");
	private JTextField valorEstampa;
	
	private JButton botaoComprarAcessorio = new JButton("Comprar");
	private JButton botaoExcluirAcessorio = new JButton("Excluir");
	private JButton botaoSalvarAcessorio = new JButton("Salvar");
	
	private JButton botaoComprarRoupa= new JButton("Comprar");
	private JButton botaoExcluirRoupa = new JButton("Excluir");
	private JButton botaoSalvarRoupa = new JButton("Salvar");
	private JButton botaoCadastrarRoupa = new JButton("Cadastrar");
	private JButton botaoCadastrarAcessorio = new JButton("Cadastrar");

	private String[] novoDado = new String[12];
	private ControleDados dados;
	
	int pos;
	
	public void cadastrarEditarProduto(ControleDados d, int opcaoAcessorioRoupa, int opcao, int posicaoProduto) {
		dados = d;
		int opAcessorioRoupa = opcaoAcessorioRoupa;
		int op = opcao;
		pos = posicaoProduto;
		
		janela = new JFrame();
		
		//Acessorio
		if(opAcessorioRoupa == 1) {
			//Cadastrar acessorio
			if(op == 1) {
				janela = new JFrame("Cadastro de Acessorio");

				valorNome = new JTextField(200);
				comboboxDepartamento = new JComboBox(departamentos);
				valorDescricao = new JTextField(200);
				valorMarca = new JTextField(200);
				valorPreco = new JTextField(10);
				comboboxCondicao = new JComboBox(condicao);
				valorCor = new JTextField(200);
				valorMaterial = new JTextField(200);
				valorPeso = new JTextField(10);
				valorMedidaLargura = new JTextField(10);
				valorMedidaAltura = new JTextField(10);

				botaoCadastrarAcessorio.setBounds(180, 320, 180, 25);
				this.janela.add(botaoCadastrarAcessorio);
			}
			
			//Ver acessorio a venda e Colocar na sacola
			if(op == 2) {
				String nome_acessorio = dados.getAcessoriosAVenda().get(pos).getNome();
				janela = new JFrame(nome_acessorio);

				valorNome = new JTextField(dados.getAcessoriosAVenda().get(pos).getNome(),200);
				String departamento_cadastrado[] = {dados.getAcessoriosAVenda().get(pos).getDepartamento()};
				comboboxDepartamento =  new JComboBox(departamento_cadastrado);
				valorDescricao = new JTextField(dados.getAcessoriosAVenda().get(pos).getDescricao(),200);
				valorMarca = new JTextField(dados.getAcessoriosAVenda().get(pos).getMarca(),200);
				String preco_cadastrado = Double.toString(dados.getAcessoriosAVenda().get(pos).getPreco());
				valorPreco = new JTextField(preco_cadastrado);
				String condicao_cadastrada[] = {dados.getAcessoriosAVenda().get(pos).getCondicao()};
				comboboxCondicao =  new JComboBox(condicao_cadastrada);
				valorCor = new JTextField(dados.getAcessoriosAVenda().get(pos).getCor(),200);
				valorMaterial = new JTextField(dados.getAcessoriosAVenda().get(pos).getMaterial(),200);
				valorPeso = new JTextField(dados.getAcessoriosAVenda().get(pos).getPeso(),10);
				valorMedidaLargura = new JTextField(dados.getAcessoriosAVenda().get(pos).getMedidaLargura(),10);
				valorMedidaAltura = new JTextField(dados.getAcessoriosAVenda().get(pos).getMedidaAltura(),10);
				
				botaoComprarAcessorio.setBounds(180, 320, 180, 25);
				this.janela.add(botaoComprarAcessorio);
			}
			
			//Ver acessorio
			if(op == 3) {
				String nome_acessorio = dados.getAcessoriosAVenda().get(pos).getNome();
				janela = new JFrame(nome_acessorio);

				valorNome = new JTextField(dados.getAcessoriosAVenda().get(pos).getNome(),200);
				String departamento_cadastrado[] = {dados.getAcessoriosAVenda().get(pos).getDepartamento()};
				comboboxDepartamento =  new JComboBox(departamento_cadastrado);
				valorDescricao = new JTextField(dados.getAcessoriosAVenda().get(pos).getDescricao(),200);
				valorMarca = new JTextField(dados.getAcessoriosAVenda().get(pos).getMarca(),200);
				String preco_cadastrado = Double.toString(dados.getAcessoriosAVenda().get(pos).getPreco());
				valorPreco = new JTextField(preco_cadastrado);
				String condicao_cadastrada[] = {dados.getAcessoriosAVenda().get(pos).getCondicao()};
				comboboxCondicao =  new JComboBox(condicao_cadastrada);
				valorCor = new JTextField(dados.getAcessoriosAVenda().get(pos).getCor(),200);
				valorMaterial = new JTextField(dados.getAcessoriosAVenda().get(pos).getMaterial(),200);
				valorPeso = new JTextField(dados.getAcessoriosAVenda().get(pos).getPeso(),10);
				valorMedidaLargura = new JTextField(dados.getAcessoriosAVenda().get(pos).getMedidaLargura(),10);
				valorMedidaAltura = new JTextField(dados.getAcessoriosAVenda().get(pos).getMedidaAltura(),10);
			}
			
			//Editar ou excluir acessorio
			if(op == 4) {
				String nome_acessorio = dados.getAcessoriosAVenda().get(pos).getNome();
				janela = new JFrame(nome_acessorio);
				
				valorNome = new JTextField(dados.getAcessoriosAVenda().get(pos).getNome(),200);
				String departamento_cadastrado[] = {dados.getAcessoriosAVenda().get(pos).getDepartamento()};
				comboboxDepartamento =  new JComboBox(departamento_cadastrado);
				valorDescricao = new JTextField(dados.getAcessoriosAVenda().get(pos).getDescricao(),200);
				valorMarca = new JTextField(dados.getAcessoriosAVenda().get(pos).getMarca(),200);
				String preco_cadastrado = Double.toString(dados.getAcessoriosAVenda().get(pos).getPreco());
				valorPreco = new JTextField(preco_cadastrado);
				String condicao_cadastrada[] = {dados.getAcessoriosAVenda().get(pos).getCondicao()};
				comboboxCondicao =  new JComboBox(condicao_cadastrada);
				valorCor = new JTextField(dados.getAcessoriosAVenda().get(pos).getCor(),200);
				valorMaterial = new JTextField(dados.getAcessoriosAVenda().get(pos).getMaterial(),200);
				valorPeso = new JTextField(dados.getAcessoriosAVenda().get(pos).getPeso(),10);
				valorMedidaLargura = new JTextField(dados.getAcessoriosAVenda().get(pos).getMedidaLargura(),10);
				valorMedidaAltura = new JTextField(dados.getAcessoriosAVenda().get(pos).getMedidaAltura(),10);
				
				botaoSalvarAcessorio.setBounds(180, 320, 90, 25);
				botaoExcluirAcessorio.setBounds(270, 320, 90, 25);
				this.janela.add(botaoSalvarAcessorio);
				this.janela.add(botaoExcluirAcessorio);
			}
			
			labelNome.setBounds(30, 20, 150, 25);
			valorNome.setBounds(180, 20, 180, 25);
			
			labelDepartamento.setBounds(30, 50, 150, 25);
			comboboxDepartamento.setBounds(180, 50, 180, 25);
			
			labelDescricao.setBounds(30, 80, 150, 25);
			valorDescricao.setBounds(180, 80, 180, 25);
			
			labelMarca.setBounds(30, 110, 150, 25);
			valorMarca.setBounds(180, 110, 180, 25);
			
			labelPreco.setBounds(30, 140, 150, 25);
			valorPreco.setBounds(180, 140, 180, 25);
			
			labelCondicao.setBounds(30, 170, 150, 25);
			comboboxCondicao.setBounds(180, 170, 180, 25);
			
			labelCor.setBounds(30, 200, 150, 25);
			valorCor.setBounds(180, 200, 180, 25);
			
			labelMaterial.setBounds(30, 230, 150, 25);
			valorMaterial.setBounds(180, 230, 180, 25);
			
			labelPeso.setBounds(30, 260, 150, 25);
			valorPeso.setBounds(180, 260, 180, 25);
			
			labelMedida.setBounds(30, 290, 150, 25);
			valorMedidaLargura.setBounds(180, 290, 90, 25);
			valorMedidaAltura.setBounds(270, 290, 90, 25);
			
			this.janela.add(labelNome);
			this.janela.add(valorNome);
			this.janela.add(labelDepartamento);
			this.janela.add(comboboxDepartamento);
			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(labelMarca);
			this.janela.add(valorMarca);
			this.janela.add(labelPreco);
			this.janela.add(valorPreco);
			this.janela.add(labelCondicao);
			this.janela.add(comboboxCondicao);
			this.janela.add(labelCor);
			this.janela.add(valorCor);
			this.janela.add(labelMaterial);
			this.janela.add(valorMaterial);
			this.janela.add(labelPeso);
			this.janela.add(valorPeso);
			this.janela.add(labelMedida);
			this.janela.add(valorMedidaLargura);
			this.janela.add(valorMedidaAltura);
			
			this.janela.setLayout(null);
			
			this.janela.setSize(400, 400);
			this.janela.setVisible(true);
			
			botaoCadastrarAcessorio.addActionListener(this);
			botaoSalvarAcessorio.addActionListener(this);
			botaoExcluirAcessorio.addActionListener(this);
			botaoComprarAcessorio.addActionListener(this);
		
		//Roupa	
		}else if(opAcessorioRoupa == 2) {
			//Cadastrar roupa
			if(op == 1) {
				janela = new JFrame("Cadastro de Roupa");

				valorNome = new JTextField(200);
				comboboxDepartamento = new JComboBox(departamentos);
				valorDescricao = new JTextField(200);
				valorMarca = new JTextField(200);
				valorPreco = new JTextField(10);
				comboboxCondicao = new JComboBox(condicao);
				valorCor = new JTextField(200);
				valorTecido = new JTextField(200);
				valorEstampa = new JTextField(200);
				comboboxTamanho = new JComboBox(tamanhos);

				botaoCadastrarRoupa.setBounds(180, 320, 180, 25);
				this.janela.add(botaoCadastrarRoupa);
			}
			
			//Ver roupa a venda e Comprar
			if(op == 2) {
				String nome_roupa = dados.getRoupasAVenda().get(pos).getNome();
				janela = new JFrame(nome_roupa);

				valorNome = new JTextField(dados.getRoupasAVenda().get(pos).getNome(),200);
				String departamento_cadastrado[] = {dados.getRoupasAVenda().get(pos).getDepartamento()};
				comboboxDepartamento =  new JComboBox(departamento_cadastrado);
				valorDescricao = new JTextField(dados.getRoupasAVenda().get(pos).getDescricao(),200);
				valorMarca = new JTextField(dados.getRoupasAVenda().get(pos).getMarca(),200);
				String preco_cadastrado = Double.toString(dados.getRoupasAVenda().get(pos).getPreco());
				valorPreco = new JTextField(preco_cadastrado);
				String condicao_cadastrada[] = {dados.getAcessoriosAVenda().get(pos).getCondicao()};
				comboboxCondicao =  new JComboBox(condicao_cadastrada);
				valorCor = new JTextField(dados.getRoupasAVenda().get(pos).getCor(),200);
				valorTecido = new JTextField(dados.getRoupasAVenda().get(pos).getTecido(),200);
				valorEstampa = new JTextField(dados.getRoupasAVenda().get(pos).getEstampa(),10);
				String tamanho_cadastrado[] = {dados.getRoupasAVenda().get(pos).getTamanho()};
				comboboxTamanho =  new JComboBox(tamanho_cadastrado);
				
				botaoComprarRoupa.setBounds(180, 320, 180, 25);
				this.janela.add(botaoComprarRoupa);
			}
			
			//Ver roupa
			if(op == 3) {
				String nome_roupa = dados.getRoupasAVenda().get(pos).getNome();
				janela = new JFrame(nome_roupa);

				valorNome = new JTextField(dados.getRoupasAVenda().get(pos).getNome(),200);
				String departamento_cadastrado[] = {dados.getRoupasAVenda().get(pos).getDepartamento()};
				comboboxDepartamento =  new JComboBox(departamento_cadastrado);
				valorDescricao = new JTextField(dados.getRoupasAVenda().get(pos).getDescricao(),200);
				valorMarca = new JTextField(dados.getRoupasAVenda().get(pos).getMarca(),200);
				String preco_cadastrado = Double.toString(dados.getRoupasAVenda().get(pos).getPreco());
				valorPreco = new JTextField(preco_cadastrado);
				String condicao_cadastrada[] = {dados.getAcessoriosAVenda().get(pos).getCondicao()};
				comboboxCondicao =  new JComboBox(condicao_cadastrada);				valorCor = new JTextField(dados.getRoupasAVenda().get(pos).getCor(),200);
				valorTecido = new JTextField(dados.getRoupasAVenda().get(pos).getTecido(),200);
				valorEstampa = new JTextField(dados.getRoupasAVenda().get(pos).getEstampa(),10);
				String tamanho_cadastrado[] = {dados.getRoupasAVenda().get(pos).getTamanho()};
				comboboxTamanho =  new JComboBox(tamanho_cadastrado);
			}
			
			//Editar ou excluir roupa
			if(op == 4) {
				String nome_roupa = dados.getRoupasAVenda().get(pos).getNome();
				janela = new JFrame(nome_roupa);
				
				valorNome = new JTextField(dados.getRoupasAVenda().get(pos).getNome(),200);
				String departamento_cadastrado[] = {dados.getRoupasAVenda().get(pos).getDepartamento()};
				comboboxDepartamento =  new JComboBox(departamento_cadastrado);
				valorDescricao = new JTextField(dados.getRoupasAVenda().get(pos).getDescricao(),200);
				valorMarca = new JTextField(dados.getRoupasAVenda().get(pos).getMarca(),200);
				String preco_cadastrado = Double.toString(dados.getRoupasAVenda().get(pos).getPreco());
				valorPreco = new JTextField(preco_cadastrado);
				String condicao_cadastrada[] = {dados.getAcessoriosAVenda().get(pos).getCondicao()};
				comboboxCondicao =  new JComboBox(condicao_cadastrada);				valorCor = new JTextField(dados.getRoupasAVenda().get(pos).getCor(),200);
				valorTecido = new JTextField(dados.getRoupasAVenda().get(pos).getTecido(),200);
				valorEstampa = new JTextField(dados.getRoupasAVenda().get(pos).getEstampa(),10);
				String tamanho_cadastrado[] = {dados.getRoupasAVenda().get(pos).getTamanho()};
				comboboxTamanho =  new JComboBox(tamanho_cadastrado);
				
				botaoSalvarRoupa.setBounds(180, 320, 90, 25);
				botaoExcluirRoupa.setBounds(270, 320, 90, 25);
				this.janela.add(botaoSalvarRoupa);
				this.janela.add(botaoExcluirRoupa);
			}
			
			labelNome.setBounds(30, 20, 150, 25);
			valorNome.setBounds(180, 20, 180, 25);
			
			labelDepartamento.setBounds(30, 50, 150, 25);
			comboboxDepartamento.setBounds(180, 50, 180, 25);
			
			labelDescricao.setBounds(30, 80, 150, 25);
			valorDescricao.setBounds(180, 80, 180, 25);
			
			labelMarca.setBounds(30, 110, 150, 25);
			valorMarca.setBounds(180, 110, 180, 25);
			
			labelPreco.setBounds(30, 140, 150, 25);
			valorPreco.setBounds(180, 140, 180, 25);
			
			labelCondicao.setBounds(30, 170, 150, 25);
			comboboxCondicao.setBounds(180, 170, 180, 25);
			
			labelCor.setBounds(30, 200, 150, 25);
			valorCor.setBounds(180, 200, 180, 25);
			
			labelTecido.setBounds(30, 230, 150, 25);
			valorTecido.setBounds(180, 230, 180, 25);
			
			labelEstampa.setBounds(30, 260, 150, 25);
			valorEstampa.setBounds(180, 260, 180, 25);
			
			labelTamanho.setBounds(30, 290, 150, 25);
			comboboxTamanho.setBounds(180, 290, 180, 25);
			
			this.janela.add(labelNome);
			this.janela.add(valorNome);
			this.janela.add(labelDepartamento);
			this.janela.add(comboboxDepartamento);
			this.janela.add(labelDescricao);
			this.janela.add(valorDescricao);
			this.janela.add(labelMarca);
			this.janela.add(valorMarca);
			this.janela.add(labelPreco);
			this.janela.add(valorPreco);
			this.janela.add(labelCondicao);
			this.janela.add(comboboxCondicao);
			this.janela.add(labelCor);
			this.janela.add(valorCor);
			this.janela.add(labelTecido);
			this.janela.add(valorTecido);
			this.janela.add(labelEstampa);
			this.janela.add(valorEstampa);
			this.janela.add(labelTamanho);
			this.janela.add(comboboxTamanho);
			
			this.janela.setLayout(null);
			
			this.janela.setSize(400, 400);
			this.janela.setVisible(true);
			
			botaoCadastrarRoupa.addActionListener(this);
			botaoSalvarRoupa.addActionListener(this);
			botaoExcluirRoupa.addActionListener(this);
			botaoComprarRoupa.addActionListener(this);
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == botaoSalvarAcessorio || src == botaoCadastrarAcessorio) {
				novoDado[0] = valorNome.getText();
				novoDado[1] = comboboxDepartamento.getSelectedItem().toString();
				novoDado[2] = valorDescricao.getText();
				novoDado[3] = valorMarca.getText();
				novoDado[4] = valorPreco.getText();
				novoDado[5] = comboboxCondicao.getSelectedItem().toString();
				novoDado[6] = valorCor.getText();
				novoDado[7] = valorMaterial.getText();
				novoDado[8] = valorPeso.getText();
				novoDado[9] = valorMedidaLargura.getText();
				novoDado[10] = valorMedidaAltura.getText();
	
			boolean auxiliar = true;
			
			//auxiliar = new ControleAcessorio(dados).cadastrarAcessorio(novoDado);
			if(auxiliar == true) {
				mensagemSucessoCadastrar();	
				
			}else {
				mensagemErroSalvarAcessorio();
			}
		}
		
		if(src == botaoSalvarRoupa || src == botaoCadastrarRoupa) {
			Roupa roupa_nova = new Roupa(dados.getUsuarioPrincipal());
				roupa_nova.setNome(valorNome.getText());
				
				String departamentoselecionado = comboboxDepartamento.getSelectedItem().toString();
				roupa_nova.setDepartamento(departamentoselecionado);
				roupa_nova.setDescricao(valorDescricao.getText());
				roupa_nova.setMarca(valorMarca.getText());
				Double precoselecionado = Double.parseDouble(valorPreco.getText());
				roupa_nova.setPreco(precoselecionado);
				String condicaoselecionada = comboboxDepartamento.getSelectedItem().toString();
				roupa_nova.setCondicao(condicaoselecionada);				
				roupa_nova.setTecido(valorTecido.getText());
				roupa_nova.setEstampa(valorEstampa.getText());
				String tamanhoselecionado = comboboxTamanho.getSelectedItem().toString();
				roupa_nova.setTamanho(tamanhoselecionado);
				
			new ControleRoupa(dados).cadastrarRoupa(roupa_nova);
			
			janela.dispose();
		}
		
		if(src == botaoExcluirAcessorio) {
			new ControleAcessorio(dados).excluirAcessorio(pos);
		}
		
		if(src == botaoExcluirAcessorio) {
			new ControleRoupa(dados).excluirRoupa(pos);
		}
		
		if(src == botaoComprarAcessorio) {
			new ControleUsuario(dados).adicionarAcessorioNaSacola(dados.getAcessoriosAVenda().get(pos));
			mensagemSucessoSacola();
		}
		
		if(src == botaoComprarRoupa) {
			new ControleUsuario(dados).adicionarRoupaNaSacola(dados.getRoupasAVenda().get(pos));
			mensagemSucessoSacola();
		}
	}
	
	public void mensagemSucessoSacola() {
		JOptionPane.showMessageDialog(null, "O Produto foi adicionado na Sacola com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	public void mensagemSucessoCadastrar() {
		JOptionPane.showMessageDialog(null, "O Produto foi cadastrado com sucesso!", null, 
				JOptionPane.INFORMATION_MESSAGE);
		janela.dispose();
	}
	
	public void mensagemErroSalvarAcessorio() {
		JOptionPane.showMessageDialog(null,"Erro ao salvar os dados!\n "
				+ "Pode ter ocorrido um dos dois erros a seguir:  \n"
				+ "1. Nem todos os campos foram preenchidos \n"
				+ "2. Preco, peso, medida da largura e a medida da altura devem conter apenas numeros", null, 
				JOptionPane.ERROR_MESSAGE);
		janela.dispose();
	}
}