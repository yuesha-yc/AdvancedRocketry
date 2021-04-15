package zmaster587.advancedRocketry.integration.jei.arcFurnace;

import zmaster587.libVulpes.interfaces.IRecipe;
import zmaster587.libVulpes.recipe.RecipesMachine;

import java.util.LinkedList;
import java.util.List;

import mezz.jei.api.helpers.IJeiHelpers;

public class ArcFurnaceRecipeMaker {

	public static List<ArcFurnaceWrapper> getMachineRecipes(IJeiHelpers helpers, Class clazz) {
		
		List<ArcFurnaceWrapper> list = new LinkedList<ArcFurnaceWrapper>();
		for(IRecipe rec : RecipesMachine.getInstance().getRecipes(clazz)) {
			list.add(new ArcFurnaceWrapper(rec));
		}
		return list;
	}
	
}