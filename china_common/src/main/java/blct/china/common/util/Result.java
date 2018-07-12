package blct.china.common.util;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@XmlRootElement
public class Result implements Serializable {

    private boolean success;
    private List<String> errors;
    private Object returnValue;

    public Result() {
    }

    public static Result buildErrorResult(String errorMessage) {
        Result result = new Result();
        if (errorMessage != null) {
            List<String> errorList = new ArrayList(1);
            errorList.add(errorMessage);
            result.setErrors(errorList);
        }
        result.setSuccess(false);
        return result;
    }

    public static Result buildSuccessResult() {
        Result result = new Result();
        result.setSuccess(true);
        result.setErrors(new ArrayList());
        return result;
    }

    public static Result buildSuccessResult(Object returnValue) {
        Result result = new Result();
        result.setSuccess(true);
        result.setErrors(new ArrayList());
        result.setReturnValue(returnValue);
        return result;
    }
}
