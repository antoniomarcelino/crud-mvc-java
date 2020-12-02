<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"/>
        <title>Personal Trainer WEB</title>
    </head>

    <body style="background-image: url(https://veja.abril.com.br/wp-content/uploads/2016/07/homem-treino-musculacao.jpg) ">
        <div class="container mt-4">
            <div class="card border-info">
                <div class="card-header bg-info text-white">
                    <a class="btn btn-primary" href="adicionar.htm">Novo Registro</a>
                </div> 
                <div class="card-body">  
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>CREF</th>
                                <th>Nome</th>
                                <th>Email</th>
                                <th>Senha</th>
                                <th>Preco por Hora</th>
                                <th>Experiência</th>
                                <th>Data da Aula</th>
                                <th>Ações</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="dado" items="${lista}">
                            <tr>
                                <td>${dado.cref}</td>
                                <td>${dado.nome}</td>
                                <td>${dado.email}</td>
                                <td>${dado.senha}</td>
                                <td>R$ ${dado.preco_por_hora}</td>
                                <td>${dado.experiencia} anos</td>
                                <td>${dado.data_aula}</td>
                                <td>
                                    <a href="editar.htm?id=${dado.id}" class="btn btn-warning">Editar</a>
                                    <a href="deletar.htm?id=${dado.id}" class="btn btn-danger">Deletar</a>
                                </td>
                            </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                    
                </div> 
            </div>    
        </div>
    </body>
</html>
