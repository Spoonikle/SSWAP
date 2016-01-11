//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.swp; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelJaffaBaldCap extends ModelCustomArmour //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelJaffaBaldCap() //Same as Filename
	{
		headModel = new ModelRendererTurbo[3];
		headModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // topCap
		headModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // backOfHead
		headModel[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // sideBurns

		headModel[0].addBox(-5F, -9F, -5F, 10, 4, 10, 0F); // topCap
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addBox(-5F, -5F, 2F, 10, 3, 3, 0F); // backOfHead
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addBox(-5F, -5F, -1F, 10, 3, 1, 0F); // sideBurns
		headModel[2].setRotationPoint(0F, 0F, 0F);


	}
}