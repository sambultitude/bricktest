package vulncheck.vulncheck;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class VulncheckWeb {
	private static final String PASSWORD = "8312789SFAJIOFd78123hjdhfusd7f871ubkas)IAS(Dy7834ghj";
	private VulncheckDB db;
	private static Logger LOG = LoggerFactory.getLogger(VulncheckWeb.class);

    @Autowired
	public VulncheckWeb(VulncheckDB db){
		this.db = db;
	}

	@GetMapping("/{in}")
	public String get(@PathVariable String in){
		LOG.info(in);
		return db.get(in);
	}

	@GetMapping("/a/{in}")
	public String get(@PathVariable String in){
		LOG.info(in);
		return db.get2(in);
	}

}
