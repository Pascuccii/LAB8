import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

/*7.	Выбор изображения по тематике (природа, автомобили, дети и т.д.)
и его отображение.
*/

public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("text/html; charset=UTF8");

        try (PrintWriter out = response.getWriter()) {
            ArrayList<String> toyotas = new ArrayList<>();
            toyotas.add("Toyota 86<br><img src=\"https://img.car.com/2019/toyota/86/48951_11_2_320x.png\" alt=\"A toyota\">");
            toyotas.add("Toyota Supra<br><img src=\"https://img.car.com/2020/toyota/supra/51667_11_2_320x.png\" alt=\"A toyota\">");
            toyotas.add("Toyota Camry Solara<br><img src=\"https://img.car.com/2008/toyota/camry-solara/19957_11_2_320x.png\" alt=\"A toyota\">");
            toyotas.add("Toyota Corolla<br><img src=\"https://img.car.com/2020/toyota/corolla/50702_11_2_320x.png\" alt=\"A toyota\">");

            ArrayList<String> hondas = new ArrayList<>();
            hondas.add("Honda Civic Type-R<br><img src=\"https://img.car.com/2019/honda/civic-type-r/50189_11_2_320x.png\" alt=\"A honda\">");
            hondas.add("Honda Accord<br><img src=\"https://img.car.com/2020/honda/accord/52805_11_2_320x.png\" alt=\"A honda\">");
            hondas.add("Honda Passport<br><img src=\"https://img.car.com/2020/honda/passport/53246_11_2_320x.png\" alt=\"A honda\">");
            hondas.add("Honda S2000<br><img src=\"https://img.car.com/2009/honda/s2000/21389_11_2_320x.png\" alt=\"A honda\">");

            ArrayList<String> audis = new ArrayList<>();
            audis.add("Audi A7<br><img src=\"https://img.car.com/2020/audi/a7/52330_11_2_320x.png\" alt=\"An audi\">");
            audis.add("Audi R8<br><img src=\"https://img.car.com/2020/audi/r8/51029_11_2_320x.png\" alt=\"An audi\">");
            audis.add("Audi TTS<br><img src=\"https://img.car.com/2020/audi/tts/52329_11_2_320x.png\" alt=\"An audi\">");
            audis.add("Audi Q3<br><img src=\"https://img.car.com/2019/audi/q3/50886_11_2_320x.png\" alt=\"An audi\">");

            ArrayList<String> teslas = new ArrayList<>();
            teslas.add("Tesla Model S<br><img src=\"https://img.car.com/2019/tesla/model-s/50624_11_2_320x.png\" alt=\"A tesla\">");
            teslas.add("Tesla Model X<br><img src=\"https://img.car.com/2019/tesla/model-x/50490_11_2_320x.png\" alt=\"A tesla\">");
            teslas.add("Tesla Model 3<br><img src=\"https://img.car.com/2019/tesla/model-3/50488_11_2_320x.png\" alt=\"A tesla\">");
            teslas.add("Tesla Roadster<br><img src=\"https://img.car.com/2010/tesla/roadster/24659_11_2_320x.png\" alt=\"A tesla\">");

            String car = request.getParameter("car");
            out.println("<html>");
            out.println("<body>");

            Random ran = new Random();
            int num = ran.nextInt(4);
            switch (car) {
                case "toyota":
                    out.println(toyotas.get(num));
                    break;
                case "honda":
                    out.println(hondas.get(num));
                    break;
                case "audi":
                    out.println(audis.get(num));
                    break;
                case "tesla":
                    out.println(teslas.get(num));
                    break;
            }
            out.println("</body></html>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
