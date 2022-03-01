package kodlamaio.hrmsApp.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrmsApp.business.abstracts.JobPositionService;
import kodlamaio.hrmsApp.core.utilities.results.DataResult;
import kodlamaio.hrmsApp.core.utilities.results.ErrorResult;
import kodlamaio.hrmsApp.core.utilities.results.Result;
import kodlamaio.hrmsApp.core.utilities.results.SuccessDataResult;
import kodlamaio.hrmsApp.core.utilities.results.SuccessResult;
import kodlamaio.hrmsApp.dataAccess.abstracts.JobDao;
import kodlamaio.hrmsApp.entities.concretes.JobPositions;

@Service
public class JobPositionManager implements JobPositionService {

	private JobDao jobDao;

	@Autowired
	public JobPositionManager(JobDao jobDao) {
		super();
		this.jobDao = jobDao;
	}



	@Override
	public DataResult<List<JobPositions>> getAll() {
		
		return new SuccessDataResult<List<JobPositions>>(this.jobDao.findAll(),"Data has been listed");
	}



	@Override
	public Result add(JobPositions jobPositions) {
		if (this.jobDao.findByJobExplanation(jobPositions.getJobExplanation())!=null) {
			return new ErrorResult("This job title has been entered");
		}else {
			this.jobDao.save(jobPositions);
			return new SuccessResult("Job Position saved succesfully");
		}
		
	}
	
	

}
