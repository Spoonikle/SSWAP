//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.swp; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSerpentGuardHelmet extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 256;

	public ModelSerpentGuardHelmet() //Same as Filename
	{
		headModel = new ModelRendererTurbo[9];
		headModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // hood1
		headModel[1] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // headCover
		headModel[2] = new ModelRendererTurbo(this, 105, 25, textureX, textureY); // hood2
		headModel[3] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // snakeHead
		headModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // snakeSnout
		headModel[5] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // hoodtop
		headModel[6] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // hood3
		headModel[7] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // hood4
		headModel[8] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // hood5

		headModel[0].addBox(-36F, -30F, 9F, 70, 8, 12, 0F); // hood1
		headModel[0].setRotationPoint(0F, 0F, 0F);

		headModel[1].addBox(-16F, -32F, -17F, 32, 32, 33, 0F); // headCover
		headModel[1].setRotationPoint(0F, 0F, 0F);

		headModel[2].addBox(-32F, -38F, 5F, 63, 8, 12, 0F); // hood2
		headModel[2].setRotationPoint(0F, 0F, 0F);

		headModel[3].addBox(-16F, -42F, -25F, 32, 10, 30, 0F); // snakeHead
		headModel[3].setRotationPoint(0F, 0F, 0F);

		headModel[4].addBox(-8F, -42F, -33F, 16, 10, 8, 0F); // snakeSnout
		headModel[4].setRotationPoint(0F, 0F, 0F);

		headModel[5].addBox(-26F, -46F, 1F, 52, 8, 12, 0F); // hoodtop
		headModel[5].setRotationPoint(0F, 0F, 0F);

		headModel[6].addBox(-32F, -22F, 9F, 62, 8, 12, 0F); // hood3
		headModel[6].setRotationPoint(0F, 0F, 0F);

		headModel[7].addBox(-28F, -14F, 5F, 54, 8, 12, 0F); // hood4
		headModel[7].setRotationPoint(0F, 0F, 0F);

		headModel[8].addBox(-24F, -6F, 5F, 46, 6, 12, 0F); // hood5
		headModel[8].setRotationPoint(0F, 0F, 0F);


	}
}