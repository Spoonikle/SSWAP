//This File was created with the Minecraft-SMP Modelling Toolbox 2.1.4.2
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.swp; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMaTokStaff extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelMaTokStaff() //Same as Filename
	{
        gunModel = new ModelRendererTurbo[1];
		gunModel[0] = new ModelRendererTurbo(this, 1, 10, textureX, textureY); // Import chamber01

		gunModel[0].addBox(0F, 0F, 0F, 3, 2, 2, 0F); // Import chamber01
		gunModel[0].setRotationPoint(10F, -1F, -1F);

        
		defaultBarrelModel = new ModelRendererTurbo[9];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 9, 11, textureX, textureY); // Import apature01
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Import Chargecover01
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 1, 24, textureX, textureY); // Import Chargecover02
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 1, 29, textureX, textureY); // Import Chargecover03
		defaultBarrelModel[4] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Import Chargecover04
		defaultBarrelModel[5] = new ModelRendererTurbo(this, 0, 30, textureX, textureY); // Import Chargecover05
		defaultBarrelModel[6] = new ModelRendererTurbo(this, 1, 31, textureX, textureY); // Import Chargecover06
		defaultBarrelModel[7] = new ModelRendererTurbo(this, 0, 26, textureX, textureY); // Import Chargecover07
		defaultBarrelModel[8] = new ModelRendererTurbo(this, 1, 27, textureX, textureY); // Import Chargecover08

		defaultBarrelModel[0].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Import apature01
		defaultBarrelModel[0].setRotationPoint(13F, -0.5F, -0.5F);

		defaultBarrelModel[1].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Import Chargecover01
		defaultBarrelModel[1].setRotationPoint(9F, 1.5F, 0.5F);

		defaultBarrelModel[2].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Import Chargecover02
		defaultBarrelModel[2].setRotationPoint(9F, 0.5F, 1.5F);

		defaultBarrelModel[3].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Import Chargecover03
		defaultBarrelModel[3].setRotationPoint(9F, -1.5F, 1.5F);

		defaultBarrelModel[4].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Import Chargecover04
		defaultBarrelModel[4].setRotationPoint(9F, -1.5F, 0.5F);

		defaultBarrelModel[5].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Import Chargecover05
		defaultBarrelModel[5].setRotationPoint(9F, -1.5F, -1.5F);

		defaultBarrelModel[6].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Import Chargecover06
		defaultBarrelModel[6].setRotationPoint(9F, -1.5F, -1.5F);

		defaultBarrelModel[7].addBox(0F, 0F, 0F, 5, 0, 1, 0F); // Import Chargecover07
		defaultBarrelModel[7].setRotationPoint(9F, 1.5F, -1.5F);

		defaultBarrelModel[8].addBox(0F, 0F, 0F, 5, 1, 0, 0F); // Import Chargecover08
		defaultBarrelModel[8].setRotationPoint(9F, 0.5F, -1.5F);


		defaultStockModel = new ModelRendererTurbo[4];
		defaultStockModel[0] = new ModelRendererTurbo(this, 14, 23, textureX, textureY); // Import pommel01
		defaultStockModel[1] = new ModelRendererTurbo(this, 26, 24, textureX, textureY); // Import pommel02
		defaultStockModel[2] = new ModelRendererTurbo(this, 12, 24, textureX, textureY); // Import pommel03
		defaultStockModel[3] = new ModelRendererTurbo(this, 19, 28, textureX, textureY); // Import pommel04

		defaultStockModel[0].addBox(0F, 0F, 0F, 4, 1, 4, 0F); // Import pommel01
		defaultStockModel[0].setRotationPoint(-25F, -0.5F, -2F);

		defaultStockModel[1].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import pommel02
		defaultStockModel[1].setRotationPoint(-26F, -0.5F, -1F);

		defaultStockModel[2].addBox(0F, 0F, 0F, 1, 1, 2, 0F); // Import pommel03
		defaultStockModel[2].setRotationPoint(-21F, -0.5F, -1F);

		defaultStockModel[3].addBox(0F, 0F, 0F, 2, 1, 1, 0F); // Import pommel04
		defaultStockModel[3].setRotationPoint(-24F, -1F, -0.5F);


		defaultGripModel = new ModelRendererTurbo[2];
		defaultGripModel[0] = new ModelRendererTurbo(this, 0, 3, textureX, textureY); // Import STAFF01
		defaultGripModel[1] = new ModelRendererTurbo(this, 0, 5, textureX, textureY); // Import STAFF02

		defaultGripModel[0].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Import STAFF01
		defaultGripModel[0].setRotationPoint(-20F, 0F, -0.8F);
		defaultGripModel[0].rotateAngleX = 0.78539816F;

		defaultGripModel[1].addBox(0F, 0F, 0F, 15, 1, 1, 0F); // Import STAFF02
		defaultGripModel[1].setRotationPoint(-5F, 0F, -0.8F);
		defaultGripModel[1].rotateAngleX = 0.78539816F;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}