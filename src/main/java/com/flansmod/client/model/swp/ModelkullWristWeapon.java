//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.0
// Copyright (C) 2015 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: kullWristWeapon
// Model Creator: 
// Created on: 18.12.2015 - 14:18:48
// Last changed on: 18.12.2015 - 14:18:48

package com.flansmod.client.model.swp; //Path where the model is located

import com.flansmod.client.model.EnumAnimationType;
import com.flansmod.client.model.ModelGun;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelkullWristWeapon extends ModelGun //Same as Filename
{
	int textureX = 32;
	int textureY = 32;

	public ModelkullWristWeapon() //Same as Filename
	{
		gunModel = new ModelRendererTurbo[1];
		gunModel[0] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // fist

		gunModel[0].addBox(1F, -2F, -2F, 2, 4, 4, 0F); // fist
		gunModel[0].setRotationPoint(0F, 0F, 0F);


		defaultBarrelModel = new ModelRendererTurbo[1];
		defaultBarrelModel[0] = new ModelRendererTurbo(this, 1, 14, textureX, textureY); // barrel

		defaultBarrelModel[0].addBox(-1.1F, -3F, -1F, 2, 1, 2, 0F); // barrel
		defaultBarrelModel[0].setRotationPoint(0F, 0F, 0F);


		defaultStockModel = new ModelRendererTurbo[1];
		defaultStockModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // wrist

		defaultStockModel[0].addBox(-3F, -2.5F, -2.5F, 4, 5, 5, 0F); // wrist
		defaultStockModel[0].setRotationPoint(0F, 0F, 0F);


		slideModel = new ModelRendererTurbo[1];
		slideModel[0] = new ModelRendererTurbo(this, 1, 12, textureX, textureY); // slide

		slideModel[0].addBox(-2.25F, -3.25F, -0.5F, 3, 1, 1, 0F); // slide
		slideModel[0].setRotationPoint(0F, 0F, 0F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}