//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: OriStaffWeapon
// Model Creator: 
// Created on: 29.12.2015 - 20:16:20
// Last changed on: 29.12.2015 - 20:16:20

package com.flansmod.client.model.swp; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelOriStaffWeapon extends ModelGun //Same as Filename
{
	int textureX = 64;
	int textureY = 32;

	public ModelOriStaffWeapon() //Same as Filename
	{
		defaultBarrelModel = new ModelRendererTurbo[4];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // fork1
		defaultBarrelModel[1] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // fork2
		defaultBarrelModel[2] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // fork3
		defaultBarrelModel[3] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // fork4

		defaultBarrelModel[0].addBox(10F, 0F, -2.5F, 4, 0, 1, 0F); // fork1
		defaultBarrelModel[0].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[1].addBox(10F, 0F, 1.5F, 4, 0, 1, 0F); // fork2
		defaultBarrelModel[1].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[2].addBox(9F, 0F, 0.5F, 1, 0, 1, 0F); // fork3
		defaultBarrelModel[2].setRotationPoint(0F, 0F, 0F);

		defaultBarrelModel[3].addBox(9F, 0F, -1.5F, 1, 0, 1, 0F); // fork4
		defaultBarrelModel[3].setRotationPoint(0F, 0F, 0F);


		defaultGripModel = new ModelRendererTurbo[1];
		defaultGripModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Staff

		defaultGripModel[0].addBox(-20F, -0.5F, -0.5F, 30, 1, 1, 0F); // Staff
		defaultGripModel[0].setRotationPoint(0F, 0F, 0F);
		defaultGripModel[0].rotateAngleX = 0.78539816F;


		ammoModel = new ModelRendererTurbo[1];
		ammoModel[0] = new ModelRendererTurbo(this, 49, 9, textureX, textureY); // gem

		ammoModel[0].addBox(7F, 4.8F, -5.8F, 1, 1, 1, 0F); // gem
		ammoModel[0].setRotationPoint(0F, 0F, 0F);
		ammoModel[0].rotateAngleX = 0.78539816F;
		ammoModel[0].rotateAngleZ = 0.78539816F;



		animationType = EnumAnimationType.END_LOADED;


		translateAll(0F, 0F, 0F);


		flipAll();
	}
}