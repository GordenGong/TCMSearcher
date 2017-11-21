package core.web;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import core.util.WorkoutResult;

public abstract class BaseController {
	private Logger logger=Logger.getLogger(this.getClass());
	
	public BaseController() {
		
	}
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public WorkoutResult<Object> expHandler(Exception e){
		logger.error(e.getMessage(), e);
		return new WorkoutResult<Object>(e);
	}

}
