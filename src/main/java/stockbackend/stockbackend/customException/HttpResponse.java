package stockbackend.stockbackend.customException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.Locale;

@ResponseBody
public class HttpResponse{


    public HttpServletResponse HttpResponse(HttpServletResponse response) throws IOException {
        response.setStatus(HttpStatus.OK.value());
        String json = new ObjectMapper().writeValueAsString("Given Input Values Updated Successfully");
        response.getWriter().write(json);
        response.flushBuffer();
        return response;
    }

}
