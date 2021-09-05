package tk.mwacha.chainofresponsability;

import tk.mwacha.chainofresponsability.middlewares.CheckPermissionMiddleware;
import tk.mwacha.chainofresponsability.middlewares.CheckUserMiddleware;
import tk.mwacha.chainofresponsability.middlewares.Middleware;
import tk.mwacha.chainofresponsability.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChainOfResponsabilityMain {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void main(String[] args) throws IOException {
        init();

        boolean done;

        do {
            System.out.println("Digite o e-mail: ");
            String email = reader.readLine();
            System.out.println("Digite a sua senha: ");
            String password = reader.readLine();
            done = server.login(email, password);
        } while(!done);
    }

    public static void init() {
        server = new Server();
        server.registerUser("master@hcode.com.br", "8765");
        server.registerUser("user@hcode.com.br", "1234");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }
}
