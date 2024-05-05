# EJERCICIO PUNTO EXTRA ASO

Se requiere desarrollar un servicio con dos endpoints utilizando el método POST y PUT/POST, respectivamente.

### VALIDACIONES

- ENTRADA POST OK -> devuelve un 201 

    ![](./img/POST-OK.png)

- ENTRADA POST CON ERROR -> devuelve un 400 
    ![](./img/POST-BAD.png)

- ENTRADA PUT OK -> devuelve un 204 

![](./img/PUT-OK.png)

- ENTRADA PUT CON ERROR -> devuelve un 400

![](./img/PUT-BAD.png)

- ENTRADA VALIDACION **PHONE**

![](./img/PHONE-REQ.png)

En el DAO:

    ```
    @Override
    public BUserOut mapBUserOut(BUser bUser){
        if (!validateNumber(bUser.getPhone()))
            throw new BusinessServiceException("bad phone number");
        ....
    }



