package br.com.application.personaltrainer.domain;

import br.com.application.personaltrainer.modelo.PersonalTrainer;
import br.com.application.personaltrainer.persistencia.ConexaoBD;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PersonalController {
    ConexaoBD con = new ConexaoBD();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(con.Conectar());
    ModelAndView mav = new ModelAndView();
    List dados;
    int id;
    
    
    @RequestMapping("index.htm")
    public ModelAndView Listar(){
        String sql = "select * from personal";
        dados = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista", dados);
        mav.setViewName("index");
        return mav;
    }
    
    @RequestMapping(value="adicionar.htm", method = RequestMethod.GET)
    public ModelAndView adicionar(){
        mav.addObject(new PersonalTrainer());
        mav.setViewName("adicionar");
        return mav;
        
    }
    
    @RequestMapping(value="adicionar.htm", method = RequestMethod.POST)
    public ModelAndView adicionar(PersonalTrainer personalTrainer){
        String sql="insert into personal (cref, nome, email, senha, preco_por_hora, experiencia, data_aula) values (?, ?, ?, ?, ?, ?, ?)";
        this.jdbcTemplate.update(sql, 
                personalTrainer.getCref(), 
                personalTrainer.getNome(), 
                personalTrainer.getEmail(), 
                personalTrainer.getSenha(), 
                personalTrainer.getPrecoPorHora(), 
                personalTrainer.getExperiencia(), 
                personalTrainer.getDataAula());
        return new ModelAndView("redirect:/index.htm");
        
    }
    
    @RequestMapping(value="editar.htm", method = RequestMethod.GET)
    public ModelAndView editar(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "select * from personal where id = " + id;
        dados = this.jdbcTemplate.queryForList(sql);
        mav.addObject("lista", dados);
        mav.setViewName("editar");
        return mav;
    }
    
    @RequestMapping(value="editar.htm", method = RequestMethod.POST)
    public ModelAndView editar(PersonalTrainer personalTrainer){
        String sql = "update personal set cref=?, nome=?, email=?, senha=?, preco_por_hora=?, experiencia=?, data_aula=? where id="+id;
        this.jdbcTemplate.update(sql, personalTrainer.getCref(),
                personalTrainer.getNome(), 
                personalTrainer.getEmail(), 
                personalTrainer.getSenha(), 
                personalTrainer.getPrecoPorHora(), 
                personalTrainer.getExperiencia(), 
                personalTrainer.getDataAula());
                return new ModelAndView("redirect:/index.htm");
    }
    
    @RequestMapping(value="deletar.htm", method = RequestMethod.GET)
    public ModelAndView deletar(HttpServletRequest request){
        id = Integer.parseInt(request.getParameter("id"));
        String sql = "delete from personal where id=" + id;
        this.jdbcTemplate.update(sql);
        return new ModelAndView("redirect:/index.htm");
    }

    
    
    
    
    
}
