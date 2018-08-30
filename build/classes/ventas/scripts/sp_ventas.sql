--insercion de registro tb_distrito

CREATE PROCEDURE sp_insertar_distrito(in cod VARCHAR(3),in nom VARCHAR(25), in vend VARCHAR(3))
     insert into tb_distrito values(cod,nom,vend);

CREATE PROCEDURE sp_actualizar_distrito(in cod VARCHAR(3),in nom VARCHAR(25), in ven VARCHAR(3))
    update tb_distrito SET nom_dis=nom, cod_ven=ven WHERE cod_dis=cod;

CREATE PROCEDURE sp_eliminar_distrito(in cod VARCHAR(3))
    delete from tb_distrito WHERE cod_dis=cod;

CREATE PROCEDURE sp_buscar_distrito(in cod VARCHAR(3))
select cod_dis,nom_dis, cod_ven from tb_distrito WHERE cod_dis=cod;

CREATE PROCEDURE sp_listar_distrito()
select cod_dis,nom_dis, cod_ven from tb_distrito 



