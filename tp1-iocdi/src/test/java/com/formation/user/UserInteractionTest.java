package com.formation.user;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.formation.AppConfig;

/*Nous fournissons la liste des classes de configuration Spring 
qui permettront d'avoir le contexte Spring correct dans nos test*/
@ContextConfiguration(classes = { AppConfig.class })
/*
 * Nous demandons une exécution particulière des tests avec une délagation de
 * Junit à Spring pour la gestion du cycle de vie et donc l'injection des beans
 */
@RunWith(SpringRunner.class)
public class UserInteractionTest {
	ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
	UserInteraction interaction = applicationContext.getBean(UserInteraction.class);

	@Test
	public void captainage() {
		assertEquals(58, interaction.sayTheCaptainAgeForAFamousThreeMast());
		System.out.println(interaction.sayTheCaptainAgeForAFamousThreeMast());
	}
}
