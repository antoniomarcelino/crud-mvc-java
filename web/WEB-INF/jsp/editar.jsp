<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"/>
        <title>Personal Trainer WEB</title>
    </head>
    <body>
        <div class="container mt-4 col-lg-4">
            <div class="card border-info">
                <div class="card-header bg-info">
                    <h4>Atualizar Registro</h4>
                </div>
                <div class="card-body">
                    <form method="POST">
                        <label>CREF</label>
                        <input type="text" name="cref" class="form-control" value="${lista[0].cref}">
                        <label>Nome Completo</label>
                        <input type="text" name="nome" class="form-control" value="${lista[0].nome}">
                        <label>Email</label>
                        <input type="email" name="email" class="form-control" value="${lista[0].email}">
                        <label>Senha</label>
                        <input type="password" name="senha" class="form-control" value="${lista[0].senha}">
                        <label>Preço por hora (em R$)</label>
                        <input type="text" name="precoPorHora" class="form-control" value="${lista[0].preco_por_hora}">
                        <label>Experiência profissional</label>
                        <input type="text" name="experiencia" class="form-control" value="${lista[0].experiencia}">
                        <label>Data</label>
                        <input type="text" name="dataAula" class="form-control" value="${lista[0].data_aula}">
                        <input type="submit" value="Atualizar" class="btn btn-success">
                        <a href="index.htm">Voltar</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
