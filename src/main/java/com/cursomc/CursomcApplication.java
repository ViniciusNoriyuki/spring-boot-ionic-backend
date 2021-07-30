package com.cursomc;

import com.cursomc.domain.*;
import com.cursomc.domain.enums.TipoCliente;
import com.cursomc.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private EstadoRepository estadoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		Produto p1 = new Produto(null, "Computador", 2000.0);
		Produto p2 = new Produto(null , "Impressora", 800.0);
		Produto p3 = new Produto(null, "Mouse", 80.0);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));   //Adiciona todos os Produtos (p1, p2 e p3) na lista Produtos do obj Categoria
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		Estado est1 = new Estado(null, "São Paulo");
		Estado est2 = new Estado(null, "Minas Gerais");

		Cidade cid1 = new Cidade(null, "Uberlandia", est2);
		Cidade cid2 = new Cidade(null, "Ubatuba", est1);
		Cidade cid3 = new Cidade(null, "Birigui", est1);

		est1.getCidades().addAll(Arrays.asList(cid2, cid3));
		est2.getCidades().addAll(Arrays.asList(cid1));

		Cliente cli1 = new Cliente(null, "Pedro Henrique", "amia@maskda.com", "1231241928", TipoCliente.PESSOAFISICA);

		cli1.getTelefones().addAll(Arrays.asList("1341215", "1251251"));

		Endereco end1 = new Endereco(null, "Rua 9", "123", null, "Vila Nova", "123124", cli1, cid1);
		Endereco end2 = new Endereco(null, "Avenida Matos", "159", "Sala 10", "Flores", "149554", cli1, cid2);

		cli1.getEnderecos().addAll(Arrays.asList(end1, end2));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3));
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(end1, end2));
	}
}
