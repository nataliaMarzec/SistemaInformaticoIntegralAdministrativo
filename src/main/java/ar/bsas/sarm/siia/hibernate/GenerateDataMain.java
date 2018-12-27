package ar.bsas.sarm.siia.hibernate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GenerateDataMain {

	public static void main(String[] args) {
		HibernateConf.modo = "generate";
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		//ctx.scan("ar.edu.unq.sarmiento", "ar.edu.unq.sarmiento.hibernate");
		ctx.refresh();
		DataGenerator dg = (DataGenerator) ctx.getBean("dataGenerator");
		dg.generate();
		
		ctx.close();
	}

}
