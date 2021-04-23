package steps.Gets;

import com.bradesco.core.exception.BradescoException;
import com.cit.framework.CITFrameworkRestAssured;
import com.google.gson.JsonObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.hamcrest.Matcher.*;


import java.io.IOException;

import static org.hamcrest.Matchers.is;


public class GetUser extends CITFrameworkRestAssured {



    @Given("^que seja acessado o endpoint \"([^\"]*)\"$")
    public void queSejaAcessadoOEndpoint(String endpoint) throws Throwable {
        RestEnvironment(endpoint);
    }
    @Then("^for efetuado um get$")
    public void for_efetuado_um_get() throws Throwable {
         Get().statusCode(200);

    }

    @Then("^for efetuado um post com os valores \"([^\"]*)\" e \"([^\"]*)\"$")
    public void forEfetuadoUmPostComOsValoresE(String titulo, String mensagem) throws Throwable {
        JsonObject post = new JsonObject();
        post.addProperty("titulo", titulo);
        post.addProperty("mensagem", mensagem);

        PostBody(post.toString()).statusCode(201);

    }

    @Then("^for efetuado uma atualizacao com os valores \"([^\"]*)\" e \"([^\"]*)\"$")
    public void forEfetuadoUmaAtualizacaoComOsValoresE(String titulo, String mensagem) throws BradescoException, IOException {
        JsonObject put = new JsonObject();
        put.addProperty("titulo", titulo);
        put.addProperty("mensagem", mensagem);

        PutBody(put.toString()).statusCode(200);

    }

    @Then("^para remover o elemento$")
    public void paraRemoverOElemento() throws Throwable {
        Delete().statusCode(200);
    }


   /* @Then("^for efetuado um get$")
    public void forEfetuadoUmGet() throws Throwable {
      String body = "{\"data\":\n" +
                      "{\"name\":\"CIT\"" +
                       "}\n" +
                    "}";



    }*/

}
