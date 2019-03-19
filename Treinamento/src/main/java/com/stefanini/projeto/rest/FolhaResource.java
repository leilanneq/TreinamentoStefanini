package com.stefanini.projeto.rest;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.stefanini.projeto.modelo.Folha;
import com.stefanini.projeto.modelo.Linhas;
import com.stefanini.projeto.service.FolhaService;

@Path("/folha")
public class FolhaResource {
	@Inject
	private FolhaService folhaService = new FolhaService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll() {
		List<Folha> folhas = folhaService.findAll();

		if (folhas.isEmpty()) {
			return Response.ok().build();
		}

		return Response.ok(folhas).build();
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/cadastrarfolha")
	public String cadastrarFolha(Folha folha) {
		
		try {
			folha.setTamanho(folha.getTamanho());
			folha.setNome(folha.getNome());
			folha.setLinhas(folha.getLinhas());

			return "Folha cadastrada";
			
		} catch (Exception e) {
			
			return "Não foi possível cadastrar folha" + e.getMessage();
		}
		
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/editarfolha")
	public String alterarFolha(Folha folha) {
		
		try {
			folha.setTamanho(folha.getTamanho());
			folha.setNome(folha.getNome());	
			folha.setLinhas(folha.getLinhas());
			
			folhaService.editarFolha(folha);

			return "Folha alterada";
		
		} catch (Exception e) {
			
			return "Não foi possível alterar folha" + e.getMessage();
		}

	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/cadastrarlinha")
	public String cadastrarLinha(Linhas linhas) {
		
		try {
			linhas.setNomeLinha(linhas.getNomeLinha());
			linhas.setNumeroLinha(linhas.getNumeroLinha());
			//linhas.setFolha(linhas.getFolha());

			return "Linha cadastrada";
			
		} catch (Exception e) {
			
			return "Não foi possível cadastrar linha" + e.getMessage();
		}	
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/editarlinha")
	public String alterarLinha(Linhas linhas) {
		
		try {
			linhas.setNomeLinha(linhas.getNomeLinha());
			linhas.setNumeroLinha(linhas.getNumeroLinha());
			//linhas.setFolha(linhas.getFolha());
			
			folhaService.editarLinhas(linhas);

			return "Linha alterada alterada";
		
		} catch (Exception e) {
			
			return "Não foi possível alterar folha" + e.getMessage();
		}
	}
	
	@DELETE
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/excluirFolha")
	public String excluirFolha(Folha folha) {
		
		try {
			folhaService.removerFolha(folha);

			return "Folha removida com sucesso";
		
		} catch (Exception e) {
			
			return "Não foi possível excluir folha" + e.getMessage();
		}
	}


}
