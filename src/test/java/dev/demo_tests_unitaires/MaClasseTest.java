package dev.demo_tests_unitaires;

import org.junit.Test;

import junit.framework.Assert;
import utils.StringUtils;

public class MaClasseTest {

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

	@Test
	public void testValeurNulleJUnit() {
		// On implémente un premier truc
		try {
			StringUtils onTeste = new StringUtils();
			CharSequence premierTruc = null;
			CharSequence deuxiemeTruc = null;
			Integer valeurObtenue = onTeste.levenshteinDistance(premierTruc, deuxiemeTruc);
			Assert.assertNotNull(valeurObtenue);

		} catch (NullPointerException e) {
			System.err.println("Attention valeur nulle (deux valeurs nulles)");
		}

		// Assert.assertEquals(2, valeurObtenue.intValue());

		// Assert.assertNull(valeurObtenue);

	}

	@Test
	public void testValeurSemiNulleJUnit() {
		// On implémente un premier truc
		try {
			StringUtils onTeste = new StringUtils();
			CharSequence premierTruc = "Chaton";
			CharSequence deuxiemeTruc = null;
			Integer valeurObtenue = onTeste.levenshteinDistance(premierTruc, deuxiemeTruc);
			Assert.assertNotNull(valeurObtenue);

		} catch (NullPointerException e) {
			System.err.println("Attention valeur nulle (au moins une des valeur est nulle)");
		}

		// Assert.assertEquals(2, valeurObtenue.intValue());

		// Assert.assertNull(valeurObtenue);

	}

	@Test
	public void testEgal2JUnit() {
		// On implémente un premier truc
		try {
			StringUtils onTeste = new StringUtils();
			CharSequence premierTruc = "Chaton";
			CharSequence deuxiemeTruc = "Charbon";
			Integer valeurObtenue = onTeste.levenshteinDistance(premierTruc, deuxiemeTruc);
			Assert.assertNotNull(valeurObtenue);
			Assert.assertEquals(2, valeurObtenue.intValue());

		} catch (NullPointerException e) {
			System.err.println("Attention valeur nulle");
		}

		// Assert.assertEquals(2, valeurObtenue.intValue());

		// Assert.assertNull(valeurObtenue);

	}

}
