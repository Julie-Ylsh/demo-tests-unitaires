package dev.demo_tests_unitaires;

import org.junit.Test;

import junit.framework.Assert;
import utils.StringUtils;

public class MaClasseTest {

	@Test
	public void testPremiereMethode() {
		// On implémente un premier truc
		try {
			StringUtils onTeste = new StringUtils();
			CharSequence premierTruc = null;
			CharSequence deuxiemeTruc = null;
			Integer valeurObtenue = onTeste.levenshteinDistance(premierTruc, deuxiemeTruc);
			Assert.assertNotNull(valeurObtenue);

		} catch (NullPointerException e) {
			System.err.println("Attention valeur nulle");
		}

		// Assert.assertEquals(2, valeurObtenue.intValue());

		// Assert.assertNull(valeurObtenue);

	}

}
